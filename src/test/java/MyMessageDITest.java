import MessegeService.Consumer;
import MessegeService.EmailServiceInjector;
import MessegeService.MessageServiceInjector;
import MessegeService.SMSServiceInjector;

/**
 * Created by Michał on 2016-05-19.
 */
public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "Hi Pankaj";
        String email = "pankaj@abc.com";
        String phone = "4088888888";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }

}