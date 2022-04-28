package co.edu.unbosque.wresweb.api;

import co.edu.unbosque.wresweb.resources.UsersResource;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add( UsersResource.class );
        return set;
    }
}