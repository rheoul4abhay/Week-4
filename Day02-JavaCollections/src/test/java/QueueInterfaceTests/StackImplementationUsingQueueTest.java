package QueueInterface.implementStackUsingQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackImplementationUsingQueueTest {

    @Test
    void pushTest() {
        // Arrange
        MyStack stack = new MyStack();

        // Act
        stack.push(1);
        stack.push(2);
        stack.push(5);

        // Assert
        assertEquals("[5, 2, 1]", stack.toString(), "Push operation should add elements in stack order");
    }

    @Test
    void popTest() {
        // Arrange
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);

        // Act
        stack.pop();

        // Assert
        assertEquals("[1]", stack.toString(), "Pop operation should remove the top element");
    }

    @Test
    void topTest() {
        // Arrange
        MyStack stack = new MyStack();
        stack.push(3);
        stack.push(4);

        // Act & Assert
        assertEquals(4, stack.top(), "Top should return the last pushed element");
    }

    @Test
    void emptyTest() {
        // Arrange
        MyStack stack = new MyStack();

        // Act & Assert
        assertTrue(stack.empty(), "Stack should be empty initially");

        stack.push(1);
        assertFalse(stack.empty(), "Stack should not be empty after pushing elements");
    }

    @Test
    void pushPopSequenceTest() {
        // Arrange
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);

        // Act
        stack.pop();
        stack.push(30);

        // Assert
        assertEquals("[30, 10]", stack.toString(), "Push and Pop sequence should maintain stack behavior");
    }
}
