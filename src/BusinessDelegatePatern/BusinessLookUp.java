package BusinessDelegatePatern;

public class BusinessLookUp {
    public BusinessService getBusinessService(String type) {
        if(type.equalsIgnoreCase("JMS")) {
            return new JMSService();
        } else {
            return new EJBService();
        }
    }
}
