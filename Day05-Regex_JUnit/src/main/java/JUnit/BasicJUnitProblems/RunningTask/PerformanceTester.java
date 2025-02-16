package JUnit.BasicJUnitProblems.RunningTask;

public class PerformanceTester {

    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulates a long task (3 seconds)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }

    public static void main(String[] args) {
        System.out.println(longRunningTask());
    }
}