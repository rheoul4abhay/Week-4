package Annotations.CustomAnnotations.BeginnerLevel.MarkImportantMethods;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}

class TaskManager {
    @ImportantMethod
    public void criticalTask() {
        System.out.println("Critical task executed.");
    }

    @ImportantMethod(level = "LOW")
    public void lowPriorityTask() {
        System.out.println("Low priority task executed.");
    }
}

public class MarkImportantMethods {
    public static void main(String[] args) throws Exception {
        for (Method method : TaskManager.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod info = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + info.level());
            }
        }
    }
}