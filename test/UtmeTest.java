import org.junit.jupiter.api.Test;
import tdd.Utme;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtmeTest {
    @Test
    public void firstTest (){
        Utme green = new Utme();
        int copies = green.setCopies(4);
        assertEquals(8000,copies);
    }
}
