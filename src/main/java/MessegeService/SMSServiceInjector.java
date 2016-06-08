package MessegeService;

/**
 * Created by Michał on 2016-05-19.
 */
public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }

}
