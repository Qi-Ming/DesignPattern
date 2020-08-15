package BusinessDelegatePatern;

public class EJBService implements BusinessService {
    @Override
    public void doProcess() {
        System.out.println("EJBService");
    }
}
