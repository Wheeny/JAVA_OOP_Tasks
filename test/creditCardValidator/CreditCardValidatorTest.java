package creditCardValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidatorTest {

    @Test
    public void  testToGetaCreditCardNumberAndReturnTheCardTypeMaster(){
        String expected = "Mastercard";
        String number = "5399831619690404";
        String actual = CreditCardValidator.cardType(number);
        assertEquals(expected, actual);
    }


    @Test
    public void  testToGetaCreditCardNumberAndReturnTheCardTypeVisa(){
        String expected = "Visa Cards";
        String number = "4399831619690404";
        String actual = CreditCardValidator.cardType(number);

        assertEquals(expected, actual);

    }


    @Test
    public void  testToGetaCreditCardNumberAndReturnTheCardTypeAMC(){
        String expected = "American Express Cards";
        String number = "3799831619690404";
        String actual = CreditCardValidator.cardType(number);

        assertEquals(expected, actual);

    }


    @Test
    public void  testToGetaCreditCardNumberAndReturnTheCardTypeDiscovercards(){
//        int expected = 13
//        int
        String expected = "Discover cards";
        String number = "6399831619690404";
        String actual = CreditCardValidator.cardType(number);

        assertEquals(expected, actual);

    }

    @Test
    public void  testToGetaCreditCardNumberGreaterThan16AndReturnTheCardType(){
        String expected = "Invalid Card";
        String number = "10399831619690404";
        String actual = CreditCardValidator.cardType(number);

        assertEquals(expected, actual);

    }


    @Test
    public void  testToGetaCreditCardNumberLessThan13AndReturnTheCardType(){
        String expected = "Invalid Card";
        String number = "1039983161";
        String actual = CreditCardValidator.cardType(number);

        assertEquals(expected, actual);

    }


    @Test
    public void  testToGetTheDoubleEverySecondDigitFromRightToLeft(){
        int[] expected = {4,4,8,2,3,1,7,8};
        String number = "4388576018402626";
        int[] actual = CreditCardValidator.digitDoubling(number);

        assertArrayEquals(expected, actual);

    }


    @Test
    public void  testToGetTheSumOfTheDoubleOfEverySecondDigitFromRightToLeft(){
        int expected = 37;
        String number = "4388576018402626";
        int actual = CreditCardValidator.digitAdding(number);

        assertEquals(expected, actual);

    }


    @Test
    public void  testToGetTheSumOfTheDigitsInTheOddPlacesFromRightToLeft(){
        int expected = 38;
        String number = "4388576018402626";
        int actual = CreditCardValidator.oddNumberSum(number);

        assertEquals(expected, actual);

    }


    @Test
    public void  testToGetTheSumOfTheTheDoubleOfEverySecondDigitAndTheDigitsInTheOddPlacesFromRightToLeft(){
        int expected = 75;
        String number = "4388576018402626";
        int actual = CreditCardValidator.finalSum(number);

        assertEquals(expected, actual);

    }


    @Test
    public void  testToGetTheValidityofTheCards(){
        String expected = "Invalid";
        String number = "4388576018402626";
        String actual = CreditCardValidator.cardValidity(number);

        assertEquals(expected, actual);

    }
}