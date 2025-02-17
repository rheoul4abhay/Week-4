package Reflection.AdvancedLevel.MethodExecutionTiming;

import java.lang.reflect.Method;

class TimedService {
    public void method1() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("method1 executed.");
    }

    public void method2() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("method2 executed.");
    }
}

public class MeasureMethodExecutionTiming {
    public static void main(String[] args) throws Exception {
        TimedService service = new TimedService();
        Class<?> clazz = service.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            long startTime = System.nanoTime();
            method.invoke(service);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
            System.out.println("Method " + method.getName() + " took " + duration + " ms.");
        }
    }
}