package tdd;

import chapterThree.AutomaticBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutomaticBikeTest {
    @Test
    public void BikeOn() {
        // given I have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // when I set the bike on
        automaticBike.setOn();
        // check that the bike is on
        assertTrue(automaticBike.getOn());
    }

    @Test
    public void BikeOff() {
        // given I have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // given the bike is on
        automaticBike.setOn();
        // when I set the bike off
        automaticBike.setOff();
        // check that the bike is off
        assertTrue(automaticBike.getOn());

    }
    @Test
    public void accelerateTest() {
        // given I have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // given an initial speed
        automaticBike.setSpeed(15);
        // when i accelerate
        automaticBike.setAccelerate(1);
        // check that the bike accelerates
        assertEquals(16,automaticBike.getAccelerate());
    }

    @Test
    public void accelerateTwoTest()  {
        // given i have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // given an initial speed
        automaticBike.setSpeed(24);
        // when i accelerate
        automaticBike.setAccelerate(2);
        // check that the bike accelerates
        assertEquals(26, automaticBike.getAccelerate());
    }

    @Test
    public void deccelerateTest() {
        // given i have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // given an initial speed
        automaticBike.setSpeed(15);
        // when i decelerate
        automaticBike.setDeccelerate(1);
        // check that the bike decelerates
        assertEquals(14, automaticBike.deccelerate());



    }




}
