package platform.email.messages.monitor2manager;

import platform.communication.Session;
import platform.config.Reader;
import platform.message.Message;
import platform.messages.BaseMOConfigureEmailManager;
import platform.thread.ProcessShutdownThread;
import platform.util.ApplicationConstants;

public class MOConfigureEmailManager extends BaseMOConfigureEmailManager {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public Message request_process(Session session, Message parentMessage) {
        // TODO Auto-generated method stub
        Reader reader = new Reader(ApplicationConstants.CONFIGURATION_FILE);
        reader.setString(ApplicationConstants.PROPERTY_CONNECT_URL, getConnect_url());
        reader.setString(ApplicationConstants.PROPERTY_NAME, getMo_name());
        reader.setString(ApplicationConstants.PROPERTY_LOCATION, getLocation());
        reader.setString(ApplicationConstants.PROPERTY_SELF_IP_ADDRESS, getSelf_ip_address());
        reader.save();
        ProcessShutdownThread.start();
        return null;
    }

    @Override
    public void process_aftersent(Session session) {
        // TODO Auto-generated method stub

    }

    @Override
    public void process_response(Session session) {
        // TODO Auto-generated method stub

    }

    @Override
    public void process_timeout(Session session) {
        // TODO Auto-generated method stub

    }

    @Override
    public void process_error(Session session, Message reply) {
        // TODO Auto-generated method stub

    }

}
