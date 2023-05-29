package dsa;

import org.junit.jupiter.api.Test;

import static dsa.ClassWork.countArray;
import static org.junit.jupiter.api.Assertions.*;

class ClassWorkTest {
    @Test
    public  void countTheNumber(){

        String[] words = {"Ab1396", "Q2RBS", "G381AC"};
        int expected = 8;
        assertEquals(expected, countArray(words));

    }



}