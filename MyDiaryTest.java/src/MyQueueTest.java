import MyTasks.MyQueue;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {
    MyQueue myQueue = new MyQueue(5);

    @Test
    @DisplayName("Test that my queue is empty")
    public void myQueueIsEmpty() {
        assertTrue(myQueue.isEmpty());
    }

    @Test
    @DisplayName("Test that queue is no longer empty after peek an element")
    public void myQueueIsNotEmptyAfterAddingAnElement() {
        myQueue.add(5);
        assertFalse(myQueue.isEmpty());

    }

    @Test
    @DisplayName("Test that peek returns true if an element is successfully added")
    public void addReturnsTrueIfAnElementIsSuccessfullyAdded() {
        assertTrue(myQueue.add(5));
    }

    @Test
    @DisplayName("Test that peek returns the first element in the queue ")
    public void peekReturnsTheFirstElementInTheQueue() {
        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(7);
        assertEquals(5, myQueue.peek());
    }
}
