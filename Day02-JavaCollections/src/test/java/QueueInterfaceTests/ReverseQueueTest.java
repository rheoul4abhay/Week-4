package QueueInterfaceTests;

import QueueInterface.ReverseQueue.ReverseQueue;
import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseQueueTest {

    @Test
    void testReverseQueueWithElements() {
        // Arrange
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        Queue<Integer> expected = new LinkedList<>();
        expected.offer(40);
        expected.offer(30);
        expected.offer(20);
        expected.offer(10);

        // Act
        ReverseQueue.reverseQueue(queue);

        // Assert
        assertEquals(expected, queue, "The queue should be reversed.");
    }

    @Test
    void testReverseEmptyQueue() {
        // Arrange
        Queue<Integer> queue = new LinkedList<>();

        // Act
        ReverseQueue.reverseQueue(queue);

        // Assert
        assertTrue(queue.isEmpty(), "Reversing an empty queue should result in an empty queue.");
    }

    @Test
    void testReverseSingleElementQueue() {
        // Arrange
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);

        Queue<Integer> expected = new LinkedList<>();
        expected.offer(10);

        // Act
        ReverseQueue.reverseQueue(queue);

        // Assert
        assertEquals(expected, queue, "A single-element queue should remain unchanged after reversing.");
    }
}
