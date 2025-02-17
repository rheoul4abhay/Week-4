package Annotations.BasicExercises.CustomAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority() default "MEDIUM";
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = "HIGH", assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Task completed.");
    }
}

public class CustomAnnotationExample{

    public static void main(String[] args) throws Exception {
        TaskInfo info = TaskManager.class.getMethod("completeTask").getAnnotation(TaskInfo.class);
        System.out.println("Priority: " + info.priority() + ", Assigned To: " + info.assignedTo());
    }
}
