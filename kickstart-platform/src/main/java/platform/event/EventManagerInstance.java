/*
   Copyright 2011 Espen Skjervold

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package platform.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import platform.event.interfaces.Condition;
import platform.event.interfaces.Event;
import platform.event.interfaces.EventExceptionHandler;
import platform.event.interfaces.GenericEventListener;
import platform.event.internals.EventManagerExtension;
import platform.event.internals.EventSubscription;

/**
 * This class should be used for subscribing to, and triggering events
 * Copyright 2011  Espen Skjervold, FFI  //
 */
public class EventManagerInstance {

    private EventManagerExtension eventManagerExtension;
    
    /* Executor service with dynamic cache pool */
    private ExecutorService scheduler = Executors.newCachedThreadPool();

    /* Timer thread used to schedule future and periodic events */
    private Timer timer = new Timer(); 
    
    /* Default exception handler for exception within asynchronous events */
    private EventExceptionHandler exceptionHandler = new EventExceptionHandler() {
        @Override
        public void handleException(Exception ex) {
            ex.printStackTrace(System.err);
        }
    }; 
    
    protected Map<String, Map<Integer, EventSubscription>> eventSubscriptionLists = new HashMap<String, Map<Integer, EventSubscription>>();
    private Map<Object, List<EventSubscription>> contextSubscriptionsMap = new HashMap<Object, List<EventSubscription>>();

     /**
     * Registers an event listener, and binds it to a specific type of event. Define your own types of events by creating classes imlement the Event interface.
     * @param receiver The callback object that will be called once the event is triggered. This may typically be an anonymous implementation of the class.
     * @param eventClass The type of Event that is subscribed to.
        it may be another instance of the same Event type (the class inheriting the Event class).
     */
    public synchronized void registerEventListener(GenericEventListener receiver, Class<? extends Event> eventClass) {
        registerEventListener(null,receiver, eventClass, null);
    }

      /**
     * Registers an event listener, and binds it to a specific type of event. Define your own types of events by creating classes imlement the Event interface.
     * @param m_Context Any type of object, which will serve as a m_Context for your event listeners. Useful when bulk-unregistering event listeners. (usage: unregisterAllEventListenersForContext("myContext") )
     * Note: Context-matching is done using object.equals(object), not object references.
     * @param receiver The callback object that will be called once the event is triggered. This may typically be an anonymous implementation of the class.
     * @param eventClass The type of Event that is subscribed to.
        it may be another instance of the same Event type (the class inheriting the Event class).
     */
    public synchronized void registerEventListener(Object context, GenericEventListener receiver, Class<? extends Event> eventClass) {
        registerEventListener(context,receiver, eventClass, null);
    }


    public synchronized void unregisterAllEventSubscriptions() {
        eventSubscriptionLists = new HashMap<String, Map<Integer, EventSubscription>>();
    }


    /**
     * Registers an event listener, and binds it to a specific type of event and provides a condition.
     * @param receiver The callback object that will be called once the event is triggered. This may typically be an anonymous implementation of the class.
     * @param eventClass The type of Event that is subscribed to.
     * @param condition A condition that must be true for the EventListener to be called.
     */
    public synchronized void registerEventListener(GenericEventListener receiver, Class<? extends Event> eventClass, Condition condition) {
        registerEventListener(null, receiver, eventClass, condition);
    }


    /**
     * Registers an event listener, and binds it to a specific type of event and provides a condition.
     * @param m_Context Any type of object, which will serve as a m_Context for your event listeners. Useful when bulk-unregistering event listeners. (usage: unregisterAllEventListenersForContext("myContext") )
     * Note: Context-matching is done using object.equals(object), not object references.
     * @param receiver The callback object that will be called once the event is triggered. This may typically be an anonymous implementation of the class.
     * @param eventClass The type of Event that is subscribed to.
     * @param condition A condition that must be true for the EventListener to be called.
     */
    public synchronized void registerEventListener(Object context, GenericEventListener receiver, Class<? extends Event> eventClass, Condition condition) {

        Map<Integer, EventSubscription> subcriptionList = eventSubscriptionLists.get(eventClass.getName());

        if (subcriptionList==null) {
            subcriptionList = new HashMap<Integer, EventSubscription>();
            eventSubscriptionLists.put(eventClass.getName(), subcriptionList);
        }

        EventSubscription subscription = new EventSubscription(receiver, eventClass, condition);

        if (!subcriptionList.containsKey(subscription.hashCode()))
            subcriptionList.put(subscription.hashCode(), subscription);

        manageContext(context, subscription);

        if (eventManagerExtension!=null)
            eventManagerExtension.afterRegisterEventListener(receiver, eventClass, condition, eventSubscriptionLists);
    }

    private void manageContext(Object context, EventSubscription subscription) {
        if (context!=null) {
            List<EventSubscription> subscriptionsAssociatedWithContext = contextSubscriptionsMap.get(context);
            if (subscriptionsAssociatedWithContext==null) {
                subscriptionsAssociatedWithContext = new ArrayList<EventSubscription>();
                contextSubscriptionsMap.put(context, subscriptionsAssociatedWithContext);
            }
            subscriptionsAssociatedWithContext.add(subscription);
        }
    }

    /**
     * Unregisters an event listener bound to an event
     * @param receiver The EventListener registered for a particular event.
     * @param event
     */
    public synchronized void unregisterEventListener(GenericEventListener receiver, Class<? extends Event> eventClass) {

        EventSubscription tempSubscription = new EventSubscription(receiver, eventClass, null);

        Map<Integer, EventSubscription> subcriptionList = eventSubscriptionLists.get(eventClass.getName());
        if (subcriptionList.containsKey(tempSubscription.hashCode()))
            subcriptionList.remove(tempSubscription.hashCode());
    }

    /**
     * Unregisters all event listeners associated with a specific m_Context (event listeners registered with EventManager.registerEventListener("someContext", myEventListener...) )
     * @param m_Context The object instance (or an object that .equals(object)==true) that was used to register the event listener.
     */
    public synchronized void unregisterAllEventListenersForContext(Object context) {
        List<EventSubscription> subscriptionsAssociatedWithContext = contextSubscriptionsMap.get(context);
        for (EventSubscription eventSubscription : subscriptionsAssociatedWithContext) {
            unregisterEventListener(eventSubscription.getReceiver(), eventSubscription.getEventClass());
        }
    }

     /**
     * A blocking call, freezing the current thread execution until the event is triggered. May be used for thread synchronization.
     * @param event An instance of the type of Event that is subscribed to. This does not need to be the same Event instance that is used to trigger the event,
        it may be another instance of the same Event type (the class inheriting the Event class).
     * @param timeout The number of milliseconds before the blocking call will resume regardless of whether the event was triggered or not. If zero, it will never time out.
     */
    public boolean waitUntilTriggered(Class<? extends Event> eventClass, long timeout) {
        EventWatcher eventWatcher = new EventWatcher(this, eventClass);
        return eventWatcher.waitUntilTriggeredThenUnregister(timeout);

    }

    /**
     * A blocking call, freezing the current thread execution until the event is triggered. May be used for thread synchronization.
     * @param event An instance of the type of Event that is subscribed to. This does not need to be the same Event instance that is used to trigger the event,
        it may be another instance of the same Event type (the class inheriting the Event class).
     * @param timeout The number of milliseconds before the blocking call will resume regardless of whether the event was triggered or not. If zero, it will never time out.
     * @param condition A condition that must be true for the call to unblock.
     */
    public boolean waitUntilTriggered(Class<? extends Event> eventClass, long timeout, Condition condition) {
        EventWatcher eventWatcher = new EventWatcher(this, eventClass, condition);
        return eventWatcher.waitUntilTriggeredThenUnregister(timeout);
    }

    /**
     * Triggers an event.
     * @param sender The object instance triggering the event.
     * @param event An instance of the type of Event that is triggered.
     */
    public synchronized void triggerEvent(final Object sender, final Event event) {
        triggerEvent(sender, event, null);
    }

     /**
     * Triggers an event.
     * 
     * @param sender The object instance triggering the event.
     * @param event An instance of the type of Event that is triggered.
     * @param conditionalExpression An object of any type. Will be checked by any event listeners providing Condition-objects.
     */
    public synchronized void triggerEvent(final Object sender, final Event event, final Object conditionalExpression) {
        Map<Integer, EventSubscription> subscriptionList = eventSubscriptionLists.get(event.getClass().getName());
        
        if (subscriptionList != null && !subscriptionList.isEmpty()) {
            for (EventSubscription eventSubscription : subscriptionList.values()) {
                if (eventSubscription.getEventClass()==event.getClass()) {
                    if ((eventSubscription.getCondition()==null) || // No conditional expression, or...
                        (conditionalExpression !=null && eventSubscription.getCondition().matches(sender, event, conditionalExpression)))  // Conditional expression is set and it matches
                            invokeHandlerMethodAsynchronously(sender, event, eventSubscription.getReceiver());
                }
            }
        }
        
        if (eventManagerExtension!=null)
                    eventManagerExtension.afterTriggerEvent(sender, event, conditionalExpression);
    }

    /**
     * Triggers an event in the future. Notice that when there are events in the future, the
     * EventManagerInstance is not able to shut down automatically before the event has been triggered. A manual
     * shutdown can be initiated by calling EventManagerInstance.shutdown().
     *
     * @param sender The object instance triggering the event.
     * @param event An instance of the type of Event that is triggered.
     */
    public synchronized void triggerFutureEvent(final Object sender, final Event event, long delay, TimeUnit timeUnit) {
        triggerFutureEvent(sender, event, null, delay, timeUnit);
    }

    /**
     * Triggers an event in the future. Notice that when there are events in the future, the
     * EventManagerInstance is not able to shut down automatically before the event has been triggered. A manual
     * shutdown can be initiated by calling EventManagerInstance.shutdown().
     * 
     * @param sender The object instance triggering the event.
     * @param event An instance of the type of Event that is triggered.
     * @param conditionalExpression An object of any type. Will be checked by any event listeners providing Condition-objects.
     */
    public synchronized void triggerFutureEvent(final Object sender, final Event event, final Object conditionalExpression, long delay, TimeUnit timeUnit) {  
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                triggerEvent(sender, event, conditionalExpression);
            }
        }, TimeUnit.MILLISECONDS.convert(delay, timeUnit));
    }

    /**
     * Triggers an event in the future. Notice that when there are events in the future, the
     * EventManagerInstance is not able to shut down automatically before the event has been triggered. A manual
     * shutdown can be initiated by calling EventManagerInstance.shutdown().
     * 
     * @param sender The object instance triggering the event.
     * @param event An instance of the type of Event that is triggered.
     */
    public synchronized void triggerPeriodicEvent(final Object sender, final Event event, long initialDelay, long delay, TimeUnit timeUnit) {
        triggerPeriodicEvent(sender, event, null, initialDelay, delay, timeUnit);        
    }

    /**
     * Triggers an event in the future. Notice that when there are events in the future, the
     * EventManagerInstance is not able to shut down automatically before the event has been triggered. A manual
     * shutdown can be initiated by calling EventManagerInstance.shutdown().
     * 
     * @param sender The object instance triggering the event.
     * @param event An instance of the type of Event that is triggered.
     * @param conditionalExpression An object of any type. Will be checked by any event listeners providing Condition-objects.
     */
    public synchronized void triggerPeriodicEvent(final Object sender, final Event event, final Object conditionalExpression,
            long initialDelay, long delay, TimeUnit timeUnit) {            
            long delayInMs = TimeUnit.MILLISECONDS.convert(initialDelay, timeUnit);
            long periodInMs = TimeUnit.MILLISECONDS.convert(delay, timeUnit);
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    triggerEvent(sender, event, conditionalExpression);
                }
            }, delayInMs, periodInMs);
    }

    private void invokeHandlerMethodAsynchronously(final Object sender, final Event event, final GenericEventListener receiver) {
        //System.out.println("invoke");
        scheduler.submit(new Runnable(){
            public void run() {
                try {
                    receiver.eventTriggered(sender, event);
                } catch (Exception ex) {
                    exceptionHandler.handleException(ex); // Call exception handler
                }
            }
        });
    }

    public EventManagerExtension getEventManagerExtension() {
        return eventManagerExtension;
    }

    public void setEventManagerExtension(EventManagerExtension eventManagerExtension) {
        this.eventManagerExtension = eventManagerExtension;
    }
    
    /**
     * Set handler for events occurring within asynchronous events.
     * 
     * @param eventExceptionHandler Exception handler.
     */
    public void setEventExceptionHandler(EventExceptionHandler eventExceptionHandler) {
        this.exceptionHandler = eventExceptionHandler;
    }
    
    /**
     * Get current exception handler.
     * 
     * @return current exception handler.
     */
    public EventExceptionHandler getEventExceptionHandler() {
        return this.exceptionHandler;
    }
   
    /** 
     * Shutdown the event scheduler after the currently active event threads have exited. Qeued or scheduled events
     * will not be executed.
     */
    public void shutdown() {
        timer.cancel();
        scheduler.shutdownNow();
    }
}
