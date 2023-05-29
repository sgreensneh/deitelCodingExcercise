package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LcmTest {

    @Test
    public  void lcmCheckTest(){
        int number = 20;
        assertEquals(Arrays.toString(new int[] {2,2,5}), Arrays.toString(Lcm.lcmChecker(number)));
    }


}