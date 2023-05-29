package reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        char[] chars = new char[1024];
       try {
           FileReader fileReader = new FileReader("C:\\Users\\sgreen\\IdeaProjects\\javaProjects\\src\\chapterFifteen\\text.txt");
           var numberOfCharacters = fileReader.read(chars);
           System.out.println(numberOfCharacters);
           System.out.print(Arrays.toString(chars));
       }catch (IOException e){
           System.out.println( e.getMessage());

       }
    }
}
