package ServiceLocatorPattern;

public class ServiceLocator {
    private static Cache cache = new Cache();

    public static Service getService(String name) {
        Service service = cache.getService(name);
        if(service != null) return service;
        InitialContext initialContext = new InitialContext();
        service = (Service) initialContext.lookUp(name);
        cache.addService(service);
        return service;
    }
}
