package QueueInterface.circularBufferSimulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferSimulationTest {

    @Test
    void addAndRemoveTest() {
        // Arrange
        MyCircularBuffer buffer = new MyCircularBuffer(3);

        // Act
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        int removed = buffer.remove();

        // Assert
        assertEquals(1, removed, "Removed element should be the oldest (1)");
        assertArrayEquals(new int[]{2, 3}, buffer.getBuffer(), "Buffer should contain [2, 3] after removing 1");
    }

    @Test
    void overwriteWhenFullTest() {
        // Arrange
        MyCircularBuffer buffer = new MyCircularBuffer(3);

        // Act
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.add(4); // Overwrites the oldest element (1)

        // Assert
        assertArrayEquals(new int[]{2, 3, 4}, buffer.getBuffer(), "Buffer should overwrite oldest when full");
    }

    @Test
    void emptyBufferTest() {
        // Arrange
        MyCircularBuffer buffer = new MyCircularBuffer(3);

        // Act & Assert
        assertTrue(buffer.empty(), "Buffer should be empty initially");
        buffer.add(1);
        assertFalse(buffer.empty(), "Buffer should not be empty after adding an element");
    }

    @Test
    void isFullTest() {
        // Arrange
        MyCircularBuffer buffer = new MyCircularBuffer(2);

        // Act
        buffer.add(1);
        buffer.add(2);

        // Assert
        assertTrue(buffer.isFull(), "Buffer should be full after adding elements equal to capacity");
    }

    @Test
    void removeFromEmptyBufferTest() {
        // Arrange
        MyCircularBuffer buffer = new MyCircularBuffer(3);

        // Act & Assert
        assertThrows(IllegalStateException.class, buffer::remove, "Removing from an empty buffer should throw exception");
    }

    @Test
    void circularBehaviorTest() {
        // Arrange
        MyCircularBuffer buffer = new MyCircularBuffer(3);

        // Act
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.remove(); // Removes 1
        buffer.add(4);
        buffer.add(5); // Overwrites 2

        // Assert
        assertArrayEquals(new int[]{3, 4, 5}, buffer.getBuffer(), "Buffer should behave circularly");
    }
}
