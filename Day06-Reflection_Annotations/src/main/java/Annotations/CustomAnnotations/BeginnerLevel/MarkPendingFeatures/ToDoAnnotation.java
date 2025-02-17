package Annotations.CustomAnnotations.BeginnerLevel.MarkPendingFeatures;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Fix bug", assignedTo = "Alice")
    public void fixBug() {
        System.out.println("Fixing bug...");
    }

    @Todo(task = "Add feature", assignedTo = "Bob", priority = "HIGH")
    public void addFeature() {
        System.out.println("Adding feature...");
    }
}

public class ToDoAnnotation {
    public static void main(String[] args) throws Exception {
        for (Method method : Project.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task() + ", Assigned To: " + todo.assignedTo() + ", Priority: " + todo.priority());
            }
        }
    }
}
