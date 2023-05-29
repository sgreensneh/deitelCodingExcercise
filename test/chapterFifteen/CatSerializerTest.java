package chapterFifteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatSerializerTest {
    private Cat cat;
    private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);
    private DateTimeFormatter dateTimeFormatter;

    @BeforeEach
    public  void  setUp(){
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        cat = new Cat();
        cat.setAge(20);
        cat.setName("Tom");
        cat.setDateOfBirth(dateOfBirth);
    }

    @Test
    public void  testConvertCatToJson(){
        String catJson = CatSerializer. convertCatToJson(cat);
        System.out.println(catJson);
        assertNotNull(catJson);
        assertEquals("{\"name\":\"Tom\",\"age\":20,\"dateOfBirth\":"+"\""+ dateTimeFormatter.format(dateOfBirth)+"\""+"}", catJson);
    }

}