package myAc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {


    @Test
    public void testThatIHaveAnAc_MyACIsOff_AndITurnItOn_ItIsOn(){
        AirConditioner myAc = new AirConditioner();
        assertEquals(false , myAc.isOn());

        myAc.turnOn();
        assertEquals(true, myAc.isOn());
    }


    @Test
    public void testThatIHaveAnAc_MyACIsOff_AndITurnItOn_ItIsOn_IturnItOff_ItIsOff(){
        AirConditioner myAc = new AirConditioner();
        assertEquals(false , myAc.isOn());

        myAc.turnOn();
        assertEquals(true, myAc.isOn());

        myAc.turnOff();
        assertEquals(false, myAc.isOn());
    }


    @Test
    public void testThatIHaveAnAc_MyACIsOff_AndITurnItOn_ItIsOn_IincreaseTheTemperature_ItIncreased(){
        AirConditioner myAc = new AirConditioner();
        assertEquals(false , myAc.isOn());

        myAc.turnOn();
        assertEquals(true, myAc.isOn());

        myAc.increaseTemp();
        assertEquals(17, myAc.checkTemp());
    }


    @Test
    public void testThatIHaveAnAc_MyACIsOff_AndITurnItOn_ItIsOn_IincreaseTheTemperature_ItIncreased_IdecreaseTheTemperature_Itdecreased(){
        AirConditioner myAc = new AirConditioner();
        assertEquals(false , myAc.isOn());

        myAc.turnOn();
        assertEquals(true, myAc.isOn());

        myAc.increaseTemp();
        assertEquals(17, myAc.checkTemp());

        myAc.decreaseTemp();
        assertEquals(16, myAc.checkTemp());
    }


    @Test
    public void testThatIHaveAnAc_MyACIsOff_AndITurnItOn_ItIsOn_IincreaseTheTemperatureBeyond30_ItRemainedAt30(){
        AirConditioner myAc = new AirConditioner();
        assertEquals(false , myAc.isOn());

        myAc.turnOn();
        assertEquals(true, myAc.isOn());

        assertEquals(16, myAc.checkTemp());

        for(int count = 16; count < 30; count++){
            myAc.increaseTemp();
        }
        assertEquals(30 ,myAc.checkTemp());

        myAc.increaseTemp();
        assertEquals(30, myAc.checkTemp());

    }


    @Test
    public void testThatIHaveAnAc_MyACIsOff_AndITurnItOn_ItIsOn_IdecreasedTheTemperatureBelow16_ItRemainedAt16(){
        AirConditioner myAc = new AirConditioner();
        assertEquals(false , myAc.isOn());

        myAc.turnOn();
        assertEquals(true, myAc.isOn());

        assertEquals(16, myAc.checkTemp());
        myAc.decreaseTemp();
        assertEquals(16, myAc.checkTemp());
    }

}
