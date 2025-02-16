package JUnitTests.BasicProblemsTests;

import JUnit.BasicJUnitProblems.RunningTask.PerformanceTester;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

public class PerformanceTesterTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testLongRunningTaskTimeout() {
        // Act & Assert
        assertEquals("Task Completed", PerformanceTester.longRunningTask());
    }
}
