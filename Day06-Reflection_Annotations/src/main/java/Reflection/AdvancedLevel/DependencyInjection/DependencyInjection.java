package Reflection.AdvancedLevel.DependencyInjection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class DependencyContainer {
    public <T> T getInstance(Class<T> clazz) throws Exception {
        T instance = clazz.getDeclaredConstructor().newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency = getInstance(field.getType());
                field.set(instance, dependency);
            }
        }
        return instance;
    }
}

class ServiceA {
    @Inject
    private ServiceB serviceB;

    public void execute() {
        System.out.println("ServiceA is executing.");
        serviceB.execute();
    }
}

class ServiceB {
    public void execute() {
        System.out.println("ServiceB is executing.");
    }
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        DependencyContainer container = new DependencyContainer();
        ServiceA serviceA = container.getInstance(ServiceA.class);
        serviceA.execute();
    }
}
