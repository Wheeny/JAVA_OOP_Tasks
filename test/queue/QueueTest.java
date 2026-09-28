package queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private Queue queue;
    @BeforeEach
    public void setUp(){
        queue = new Queue();
    }


    @Test
    public void testThatIhaveaQueue_AndItIsEmpty(){
        assertTrue(queue.isEmpty());
    }


    @Test
    public void testThatIhaveaQueue_AndItIsEmpty_IaddToItAnd_ItIsNoLongerEmpty(){
        assertTrue(queue.isEmpty());

        queue.add(9);
        assertFalse(queue.isEmpty());
    }


    @Test
    public void testThatIhaveaQueue_AndItIsEmpty_IaddToItAnd_ItIsNoLongerEmpty_IremoveFromIt(){
        assertTrue(queue.isEmpty());

        queue.add(9);
        assertFalse(queue.isEmpty());

        queue.remove();
        assertTrue(queue.isEmpty());
    }


    @Test
    public void testThatIhaveaQueue_ItIsEmpty_IaddToIt_ItIsNoLongerEmpty_IpeekToSeeTheLastValueAdded(){
        assertTrue(queue.isEmpty());

        queue.add(9);
        queue.add(11);
        queue.add(15);

        assertEquals(9, queue.peek());
        assertEquals(9, queue.remove());
        assertEquals(11, queue.remove());
    }


    @Test
    public void testThatIhaveaQueue_AndItIsEmpty_IaddToItAnd_ItIsNoLongerEmpty_IremoveFromIt_IpeekToCheck(){
        assertTrue(queue.isEmpty());

        queue.add(9);
        queue.add(11);
        queue.add(15);
        queue.add(21);
        queue.add(30);
        assertFalse(queue.isEmpty());

        queue.remove();
        assertEquals(11, queue.peek());

    }


    @Test
    public void testThatIhaveaQueue_IpeekFromAnonExistentQueue_ItThrowsAnException(){
        assertTrue(queue.isEmpty());

        assertThrows(IllegalArgumentException.class, () -> queue.peek());
    }


    @Test
    public void testThatIhaveaQueue_ItryToRemoveAvalue_ItThrowsAnException(){
        assertTrue(queue.isEmpty());

        assertThrows(IllegalArgumentException.class, () -> queue.remove());
    }

}