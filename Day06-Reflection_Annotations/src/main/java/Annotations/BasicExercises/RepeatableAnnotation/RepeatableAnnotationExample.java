package Annotations.BasicExercises.RepeatableAnnotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

class BugTracker {
    @BugReport(description = "Fix login issue")
    @BugReport(description = "Add validation")
    public void trackBugs() {
        System.out.println("Tracking bugs...");
    }
}

public class RepeatableAnnotationExample {
    public static void main(String[] args) throws Exception {
        BugReport[] reports = BugTracker.class.getMethod("trackBugs").getAnnotationsByType(BugReport.class);
        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}