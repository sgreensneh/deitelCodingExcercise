package tdd;

import chapterThree.AirCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionTest {
    @Test
    public void AirConditionOnTest(){
      // given i have an ac
        AirCondition greenAc = new AirCondition();
        // when i set the ac on
        greenAc.setOn();
        // check that ac is on
        assertTrue(greenAc.getPower());

    }

    @Test
    public void AirConditionOffTest() {
        // given i have an ac
        AirCondition greenAc = new AirCondition();
        // given my ac is set on
        greenAc.setOn();
        // when i set my ac off
        greenAc.setOff();
        // check that ac is off
        assertTrue(greenAc.getPower());

    }

    @Test
    public void IncreaseTemperatureTest(){
        // given I have an ac
        AirCondition greenAc = new AirCondition();
        // given that the ac is set on
        greenAc.setOn();
        // given an initial temperature of 16 degree
         greenAc.initialTemperature(16);
        // when I increase the temperature by 1 degree
         greenAc.increaseTemperature(1);
        // check if the temperature increased by 1
        assertEquals( 17, greenAc.getTemperature());
    }
    @Test
    public void DecreaseTemperature(){
        // given i have an ac
        AirCondition greenAc = new AirCondition();
        // given that the ac is on
        greenAc.setOn();
        // given an initial temperature
        greenAc.initialTemperature(17);
        // when the temperature decreases
        greenAc.decreaseTemperature(1);
        // check if the temperature decreased
        assertEquals(16, greenAc.getTemperature());
    }

    @Test
    public void IncreaseTemperatureBeyondTest() {
        // given i have an ac
        AirCondition greenAc = new AirCondition();
        // given the ac is on
        greenAc.setOn();
        // given an initial temperature 30 degree
        greenAc.initialTemperature(30);
        // when i increase the temperature beyond 30 degree
        greenAc.increaseTemperature(1);
        // check that temperature is still 30 degree
        assertEquals(30,greenAc.getTemperature());

    }
    @Test
    public void DecreaseTemperatureBelowTest() {
        // given i have an ac
        AirCondition greenAc = new AirCondition();
        // given the ac  is on
        greenAc.setOn();
        // given an initial temperature 16 degree
        greenAc.initialTemperature(16);
        // when i decrease the temperature
        greenAc.decreaseTemperature(1);
        // check that the temperature is still 16
        assertEquals(16, greenAc.getTemperature());




    }


}
