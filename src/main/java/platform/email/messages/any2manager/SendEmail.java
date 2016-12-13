package platform.email.messages.any2manager;

import platform.communication.Session;
import platform.email.EmailDispatcher;
import platform.message.Message;
import platform.messages.BaseSendEmail;
import platform.util.ApplicationException;
import platform.util.Json;

import java.util.Map;

public class SendEmail extends BaseSendEmail {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public Message request_process(Session session, Message parentMessage) {
        // TODO Auto-generated method stub
        Map<String, String> map = Json.jsonToMap(getParamsEx());
        try {
            System.out.println("Received send mail message to " + getTo());
            EmailDispatcher.getInstance().sendMail(getToEx().split(","), null, getSubjectEx(),
                    getTypeEx().toLowerCase(), map);
        } catch (ApplicationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
