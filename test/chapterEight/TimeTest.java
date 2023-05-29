package chapterEight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {

    @Test
    public void testTimeConstructor(){
        Time time = new Time(22,34,12);
        assertThrows(IllegalArgumentException.class, ()-> new Time(22,34,12));
    }

}