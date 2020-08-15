package BusinessDelegatePatern;

public class JMSService implements BusinessService {
    @Override
    public void doProcess() {
        System.out.println("JMSService");
    }
}
