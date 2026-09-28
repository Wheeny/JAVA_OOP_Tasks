package lowestCommonMultiple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonMultipleTest {

    @Test
    public void testForTheLowestCommonMultiplesOfTheNumbersInTheArray(){

        int[] numbers = {8,10,24};
        int expected = 120;
        int actual = LowestCommonMultiple.lcmCalculation(numbers);

        assertEquals(expected, actual);

    }


    @Test
    public void testAgainForTheLowestCommonMultiplesOfTheNumbersInTheArray(){

        int[] numbers = {2, 12, 15};
        int expected = 60;
        int actual = LowestCommonMultiple.lcmCalculation(numbers);

        assertEquals(expected, actual);

    }


    @Test
    public void testYetAgainForTheLowestCommonMultiplesOfTheNumbersInTheArray(){

        int[] numbers = {5, 15, 17};
        int expected = 255;
        int actual = LowestCommonMultiple.lcmCalculation(numbers);

        assertEquals(expected, actual);

    }

    @Test
    public void testOnceMoreForTheLowestCommonMultiplesOfTheNumbersInTheArray(){

        int[] numbers = {2, 3, 6};
        int expected = 6;
        int actual = LowestCommonMultiple.lcmCalculation(numbers);

        assertEquals(expected, actual);

    }

    @Test
    public void testOnceMoreForTheLowestCommonMultiplesOfTheNumbersInTheArrayAnother(){

        int[] numbers = {8, 10, 24};
        int expected = 120;
        int actual = LowestCommonMultiple.lcmCalculation(numbers);

        assertEquals(expected, actual);

    }
}
