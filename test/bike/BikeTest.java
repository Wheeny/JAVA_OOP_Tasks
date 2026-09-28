package bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {


    @Test
    public void testThatIhaveAbike_ItIsOff_IturnItOn(){
        Bike myBike = new Bike();
        assertEquals(false, myBike.isOn());

        myBike.turnOn();
        assertEquals(true, myBike.isOn());
    }


    @Test
    public void testThatIhaveAbike_ItIsOff_IturnItOn_IturnItOff_ItIsOff(){
        Bike myBike = new Bike();
        assertEquals(false, myBike.isOn());

        myBike.turnOn();
        assertEquals(true, myBike.isOn());

        myBike.turnOff();
        assertEquals(false, myBike.isOn());
    }


    @Test
    public void testThatIhaveAbike_ItIsOff_IturnItOn_Iaccelerate_ItAccelerates(){
        Bike myBike = new Bike();
        assertEquals(false, myBike.isOn());

        myBike.turnOn();
        assertEquals(true, myBike.isOn());

       myBike.accelerate();
       assertEquals(1, myBike.checkGear());
    }


    @Test
    public void testThatIhaveAbike_ItIsOff_IturnItOn_IaccelerateToGearOne_ItAcceleratesInIncrementToGearOne(){
        Bike myBike = new Bike();
        assertEquals(false, myBike.isOn());

        myBike.turnOn();
        assertEquals(true, myBike.isOn());

        myBike.accelerate();
        assertEquals(1, myBike.checkGear());

        myBike.accelerate();
        assertEquals(2, myBike.checkGear());
    }


    @Test
    public void testThatIhaveAbike_ItIsOff_IturnItOn_IaccelerateToGearTwo_ItAcceleratesInIncrementToGearTwo(){
        Bike myBike = new Bike();
        assertEquals(false, myBike.isOn());

        myBike.turnOn();
        assertEquals(true, myBike.isOn());


        for(int count = 0; count < 21; count++) {
            myBike.accelerate();
            }
        assertEquals(21, myBike.checkGear());


        myBike.accelerate();
        assertEquals(23, myBike.checkGear());

    }



    @Test
    public void testThatIhaveAbike_ItIsOff_IturnItOn_IaccelerateToGearThree_ItAcceleratesInIncrementToGearThree(){
        Bike myBike = new Bike();
        assertEquals(false, myBike.isOn());

        myBike.turnOn();
        assertEquals(true, myBike.isOn());


        for(int count = 0; count < 26; count++) {
            myBike.accelerate();
        }
        assertEquals(31, myBike.checkGear());


        myBike.accelerate();
        assertEquals(34, myBike.checkGear());

    }


    @Test
    public void testThatIhaveAbike_ItIsOff_IturnItOn_IaccelerateToGearFour_ItAcceleratesInIncrementToGearFour(){
        Bike myBike = new Bike();
        assertEquals(false, myBike.isOn());

        myBike.turnOn();
        assertEquals(true, myBike.isOn());


        for(int count = 0; count < 30; count++) {
            myBike.accelerate();
        }
        assertEquals(43, myBike.checkGear());


        myBike.accelerate();
        assertEquals(47, myBike.checkGear());

    }


    @Test
    public void testThatIhaveAbike_ItIsOff_IturnItOn_Iaccelerate_ItAccelerates_Idecelerate_Itdecelerates(){
        Bike myBike = new Bike();
        assertEquals(false, myBike.isOn());

        myBike.turnOn();
        assertEquals(true, myBike.isOn());

        myBike.accelerate();
        assertEquals(1, myBike.checkGear());

        myBike.decelerate();
        assertEquals(0, myBike.checkGear());
    }




    @Test
    public void testThatIhaveAbike_ItIsOff_IturnItOn_IaccelerateToGearOne_ItAcceleratesInIncrementToGearOne_Idecelerate_ItDecelerates(){
        Bike myBike = new Bike();
        assertEquals(false, myBike.isOn());

        myBike.turnOn();
        assertEquals(true, myBike.isOn());

        myBike.accelerate();
        assertEquals(1, myBike.checkGear());

        myBike.accelerate();
        assertEquals(2, myBike.checkGear());

        myBike.decelerate();
        assertEquals(1, myBike.checkGear());
    }



    @Test
    public void testThatIhaveAbike_ItIsOff_IturnItOn_IaccelerateToGearTwo_IdecelerateToGearOne_ItDeceleratesInDecrementToGearOne(){
        Bike myBike = new Bike();
        assertEquals(false, myBike.isOn());

        myBike.turnOn();
        assertEquals(true, myBike.isOn());


        for(int count = 0; count < 21; count++) {
            myBike.accelerate();
        }
        assertEquals(21, myBike.checkGear());

        myBike.decelerate();
        assertEquals(19, myBike.checkGear());

    }



    @Test
    public void testThatIhaveAbike_ItIsOff_IturnItOn_IaccelerateToGearThree_ItAcceleratesInIncrementToGearThree_Idecelerate_Itdecelerates(){
        Bike myBike = new Bike();
        assertEquals(false, myBike.isOn());

        myBike.turnOn();
        assertEquals(true, myBike.isOn());


        for(int count = 0; count < 26; count++) {
            myBike.accelerate();
        }
        assertEquals(31, myBike.checkGear());


        myBike.accelerate();
        assertEquals(34, myBike.checkGear());

        myBike.decelerate();
        assertEquals(31, myBike.checkGear());

    }


    @Test
    public void testThatIhaveAbike_ItIsOff_IturnItOn_IaccelerateToGearFour_ItAcceleratesInIncrementToGearFour_Idecelerated_Itdecelerated(){
        Bike myBike = new Bike();
        assertEquals(false, myBike.isOn());

        myBike.turnOn();
        assertEquals(true, myBike.isOn());


        for(int count = 0; count < 30; count++) {
            myBike.accelerate();
        }
        assertEquals(43, myBike.checkGear());


        myBike.accelerate();
        assertEquals(47, myBike.checkGear());

        myBike.decelerate();
        assertEquals(43, myBike.checkGear());
    }


}
