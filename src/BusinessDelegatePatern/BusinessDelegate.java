package BusinessDelegatePatern;

public class BusinessDelegate {
    private BusinessService businessService;
    private BusinessLookUp businessLookUp = new BusinessLookUp();
    private String type;

    public BusinessDelegate(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void doTask() {
        businessService = businessLookUp.getBusinessService(type);
        businessService.doProcess();
    }
}
