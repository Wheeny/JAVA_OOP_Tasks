package arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    private ArrayList  arraylist ;
    @BeforeEach
    public void setUp(){
        arraylist = new ArrayList();
    }

    @Test
    public void testThatArrayListIsEmpty(){
        assertTrue(arraylist.isEmpty());
    }

    @Test
    public void testThatAnArrayIsEmpty_IaddToIt_ItIsNoLongerEmpty(){
        assertTrue(arraylist.isEmpty());

        arraylist.add(5);
        assertFalse(arraylist.isEmpty());
    }

    @Test
    public void testThatAnArrayIsEmpty_IaddToIt_ItIsNoLongerEmpty_AnElementAtaSpecifiedIndexIsReturned(){
        assertTrue(arraylist.isEmpty());

        assertTrue(arraylist.add(5));
        assertTrue(arraylist.add(10));
        assertTrue(arraylist.add(15));
        assertFalse(arraylist.isEmpty());

        assertEquals(10, arraylist.get(1));
    }

    @Test
    public void testThatAnArrayIsEmpty_IaddMultipleValuesToIt_ItIsNoLongerEmpty(){
        assertTrue(arraylist.isEmpty());

        arraylist.add(5);
        arraylist.add(10);
        arraylist.add(15);
        assertFalse(arraylist.isEmpty());

        assertEquals(10, arraylist.get(1));
    }

    @Test
    public void testThatTheArrayIsExpanded(){
        assertTrue(arraylist.isEmpty());

        arraylist.add(5);
        arraylist.add(10);
        arraylist.add(15);
        arraylist.add(15);
        arraylist.add(15);
        arraylist.add(15);
        arraylist.add(100);

        assertEquals(100, arraylist.get(6));
        assertEquals(15, arraylist.get(2));

    }


    @Test
    public void testThatAnArrayIsEmpty_IaddMultipleValuesToIt_ItIsNoLongerEmpty_IaddAvalueAtAspecificIndex_AndReturnThatValue(){
        assertTrue(arraylist.isEmpty());

        arraylist.add(5);
        arraylist.add(10);
        arraylist.add(15);
        arraylist.add(20);
        arraylist.add(25);

        assertFalse(arraylist.isEmpty());
        arraylist.add(2,30);

        assertEquals(30, arraylist.get(2));
    }
}
