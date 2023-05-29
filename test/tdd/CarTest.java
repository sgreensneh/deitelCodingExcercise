package tdd;

import chapterThree.Car;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarTest {
    @Test
    public void toyotaTest() {
        Car toyota = new Car("G_990", "2022", 50.00);
        assertNotNull(toyota);

    }
    @Test
    public void  carAttributeInitialized() {
        Car toyota = new Car("G-990", "2022", 50.00);
        assertEquals("G-990", toyota.getModel());
        assertEquals("2022", toyota.getYear());
        assertEquals(50.00, toyota.getPrice(),0.0);
    }

    @Test
    public void carPositive(){
        Car toyota = new Car("G-990", "2022", 50.00);
        toyota.setPrice(-2000000.0);
        assertEquals(50.00, toyota.getPrice(),0.0);

    }

    @Test
    public void discountTest (){
        Car toyota = new Car("G-990", "2022", 50.00);
        toyota.applyDiscount(10);

    }




}

