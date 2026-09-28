package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStackTest {

    private MyStack stack;

    @BeforeEach
    public void setUp(){
        stack = new MyStack();
    }

    @Test
    public void testThatIhaveAStack_ItIsEmpty() {

        assertEquals(true, stack.isEmpty());
    }


    @Test
    public void testThatIhaveAStack_ItIsEmpty_IpushIntoIt_ItIsNotEmpty(){

        assertEquals(true, stack.isEmpty());

        stack.push(10);
        assertEquals(false, stack.isEmpty());
    }



    @Test
    public void testThatIhaveAStack_ItIsEmpty_IpushAvalueIntoIt_ItIsNotEmpty_IpopSaidValueFromIt_ItIsEmpty(){

        assertEquals(true, stack.isEmpty());

        stack.push(10);
        assertEquals(false, stack.isEmpty());

        stack.pop();
        assertEquals(true, stack.isEmpty());
    }


    @Test
    public void testThatIhaveAStack_ItIsEmpty_IpushValuesIntoIt_ItIsNotEmpty_IpeekToSeeTheLastValuePushed(){

        assertEquals(true, stack.isEmpty());

        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        assertEquals(false, stack.isEmpty());

        int lastIn = 30;
        assertEquals(lastIn, stack.peek());

    }


    @Test
    public void testThatIhaveAStack_ItIsEmpty_IpushFiveValuesIntoIt_ItIsNotEmpty_IpeekToSeeEachValuePushed(){

        assertEquals(true, stack.isEmpty());

        stack.push(10);
        assertEquals(10, stack.peek());
        stack.push(15);
        assertEquals(15, stack.peek());
        stack.push(20);
        assertEquals(20, stack.peek());
        stack.push(25);
        assertEquals(25, stack.peek());
        stack.push(30);
        assertEquals(30, stack.peek());

    }

    @Test
    public void testThatIhaveAStack_ItIsEmpty_IpushThreeValuesIntoIt_ItIsNotEmpty_ISearchForAValueItGivesMeThePosition(){

        assertEquals(true, stack.isEmpty());

        stack.push(10);
        stack.push(15);
        stack.push(20);
        assertEquals(false, stack.isEmpty());

        assertEquals(2, stack.search(15));

    }


    @Test
    public void testThatIhaveAStack_ItIsEmpty_IpushThreeValuesIntoIt_ItIsNotEmpty_ISearchForAValueThatDoesNotExistInTHeStack_ItGivesMeThePosition(){

        assertEquals(true, stack.isEmpty());

        stack.push(10);
        stack.push(15);
        stack.push(20);
        assertEquals(false, stack.isEmpty());

        assertEquals(-1, stack.search(35));

    }

}
