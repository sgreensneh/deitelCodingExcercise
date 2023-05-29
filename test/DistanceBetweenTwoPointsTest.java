import org.junit.Test;
import chapterTwo.DistanceBetweenTwoPoints;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DistanceBetweenTwoPointsTest {
    @Test
    public void twoPointsTest(){
        assertTrue(DistanceBetweenTwoPoints.isPerpendicular(2, 2,4,5));

    }
    @Test
    public void coordinateWithoutSlopedonTest (){
        assertFalse(DistanceBetweenTwoPoints.isPerpendicular(3,3,4,4));
    }
}
