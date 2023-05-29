package chapterFifteen;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CatDeserializer {

    public static Cat deserializeJsonToCat(String catJson) {
        ObjectMapper objectMapper = new ObjectMapper();
       try {
           return objectMapper.readValue(catJson.getBytes(), Cat.class);
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
        return null;
    }
}
