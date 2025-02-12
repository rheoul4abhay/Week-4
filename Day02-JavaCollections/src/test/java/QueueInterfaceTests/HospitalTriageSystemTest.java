package QueueInterfaceTests;

import QueueInterface.hospitalTriageSystem.Patient;
import org.junit.jupiter.api.*;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

public class HospitalTriageSystemTest {

    @Test
    void testPatientAdditionAndOrder() {
        // Arrange
        PriorityQueue<Patient> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.severityLevel, o1.severityLevel)); // Reverse order
        Patient p1 = new Patient("Abhay", 2);
        Patient p2 = new Patient("Kartik", 1);
        Patient p3 = new Patient("Mohan", 4);

        // Act
        queue.offer(p1);
        queue.offer(p2);
        queue.offer(p3);

        // Assert
        assertEquals("Mohan", queue.poll().name, "First patient should be the one with the highest severity (4).");
        assertEquals("Abhay", queue.poll().name, "Second patient should be the one with the next highest severity (2).");
        assertEquals("Kartik", queue.poll().name, "Third patient should be the one with the lowest severity (1).");
    }

    @Test
    void testEmptyQueueBehavior() {
        // Arrange
        PriorityQueue<Patient> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.severityLevel, o1.severityLevel));

        // Act & Assert
        assertNull(queue.poll(), "Polling from an empty queue should return null.");
        assertTrue(queue.isEmpty(), "Queue should remain empty.");
    }

    @Test
    void testPatientsWithSameSeverity() {
        // Arrange
        PriorityQueue<Patient> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.severityLevel, o1.severityLevel));
        Patient p1 = new Patient("Lavish", 2);
        Patient p2 = new Patient("Isha", 2);

        // Act
        queue.offer(p1);
        queue.offer(p2);

        // Assert
        assertEquals(2, queue.size(), "Queue size should be 2 after adding two patients with the same severity.");
        Patient firstPatient = queue.poll();
        assertTrue(firstPatient.name.equals("Lavish") || firstPatient.name.equals("Isha"), "First polled patient should be one of the two added.");
    }
}
