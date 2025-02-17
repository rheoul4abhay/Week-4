package Annotations.CustomAnnotations.IntermediateLevel.MeasureMethodExecutionTime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

class Service {
    @LogExecutionTime
    public void performTask() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Task performed.");
    }
}

public class LoggingMethodExecution {
    public static void main(String[] args) throws Exception {
        Service service = new Service();
        for (Method method : Service.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(service);
                long endTime = System.nanoTime();
                System.out.println("Execution time: " + (endTime - startTime) / 1_000_000 + " ms");
            }
        }
    }
}