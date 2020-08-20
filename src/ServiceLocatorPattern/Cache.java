package ServiceLocatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Service> services = new ArrayList<>();

    public Service getService(String name) {
        for(Service service : services) {
            if(service.getName().equalsIgnoreCase(name))
                return service;
        }
        return null;
    }

    public void addService(Service service) {
        boolean exits = false;
        for(Service service1 : services) {
            if(service1.getName().equalsIgnoreCase(service.getName()))
                exits = true;
        }

        if(!exits) {
            services.add(service);
        }
    }
}

