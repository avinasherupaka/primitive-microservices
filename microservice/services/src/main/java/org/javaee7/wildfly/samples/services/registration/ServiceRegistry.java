package org.javaee7.wildfly.samples.services.registration;

/**
 * @author avinash
 */
public interface ServiceRegistry {
    public void registerService(String name, String uri);
    
    public void unregisterService(String name, String uri);
    
    public String discoverServiceURI(String name);
}
