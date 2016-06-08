package MessegeService;

import com.google.inject.Inject;

public class MyDIApplication implements Consumer{

    private MessageService service;

    @Inject
    public MyDIApplication(MessageService svc){
        this.service=svc;
    }

    @Override
    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }

}
