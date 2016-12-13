package platform.email;

import platform.email.messages.any2manager.SendEmail;
import platform.email.messages.monitor2manager.MOConfigureEmailManager;
import platform.email.messages.monitor2manager.MOProcessStop;
import platform.email.messages.monitor2manager.MOUpgrade;
import platform.message.MessageManager;
import platform.process.BaseProcess;
import platform.util.ApplicationConstants;


public class BaseEmailManager extends BaseProcess {

    @Override
    protected void registerMessage(MessageManager messageManager) {
        // TODO Auto-generated method stub
        messageManager.registerMessage(new SendEmail());
    }

    @Override
    protected void registerMessageWithIdConnector(MessageManager messageManager) {
        // TODO Auto-generated method stub
        messageManager.registerMessage(new MOProcessStop());
        messageManager.registerMessage(new MOUpgrade());
        messageManager.registerMessage(new MOConfigureEmailManager());

    }

    @Override
    protected String getProcessType() {
        // TODO Auto-generated method stub
        return ApplicationConstants.APPLICATION_NAME_EMAIL_MANAGER;
    }

    @Override
    protected void registerPeers() {
        // TODO Auto-generated method stub
    }

    @Override
    protected void register() {
        // TODO Auto-generated method stub
    }

    @Override
    protected void startThreads() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void addRegisterParameters(
            platform.message.MORegister registerObject) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void loadConfiguration() {
        // TODO Auto-generated method stub
    }

    @Override
    protected void registerEventListner() {
        // TODO Auto-generated method stub

    }
}
