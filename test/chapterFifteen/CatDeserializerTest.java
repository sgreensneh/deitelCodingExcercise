package chapterFifteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatDeserializerTest {
   private String catJSon;
    private DateTimeFormatter formatter;
    private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);


    @BeforeEach
    public  void  setUp(){
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        catJSon = "{\"name\":\"Tom\",\"age\":20,\"birthday\":"+ "\"" + formatter.format(dateOfBirth) + "\""+"}";
    }

    @Test
    public void  deserilizeJsonToCat(){
        Cat ologbo = CatDeserializer.deserializeJsonToCat(catJSon);
        assertNotNull(ologbo);
        System.out.println(ologbo);
        assertEquals("Tom", ologbo.getName());
        assertEquals(formatter.format(dateOfBirth), formatter.format(ologbo.getDateOfBirth()));
    }


}