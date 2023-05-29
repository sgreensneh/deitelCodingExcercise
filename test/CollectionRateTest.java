import org.junit.jupiter.api.Test;
import tdd.CollectionRate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionRateTest {
    @Test
    public void collectionRateTest () {
        CollectionRate collectionRate = new CollectionRate();
        int rate = collectionRate.setRate(50);
        assertEquals(10000,rate);
    }
    @Test
    public void rangeTest(){
        CollectionRate collectionRate = new CollectionRate();
        int range = collectionRate.setRate(60);
        assertEquals(15000,range);
    }

    @Test
    public void rangesTest(){
        CollectionRate collectionRate = new CollectionRate();
        int ranges = collectionRate.setRate(70);
        assertEquals(35000,ranges);
    }


}
