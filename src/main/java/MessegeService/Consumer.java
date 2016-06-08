package MessegeService;

/**
 * Created by Michał on 2016-05-19.
 */
public interface Consumer {

    void processMessages(String msg, String rec);
}