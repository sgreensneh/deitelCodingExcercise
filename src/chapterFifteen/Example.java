package chapterFifteen;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
       try {
           FileInputStream fileInputStream = new FileInputStream("C:\\Users\\sgreen\\IdeaProjects\\javaProjects\\src\\chapterFifteen\\text.txt");
           byte[] bytes = fileInputStream.readAllBytes();
           System.out.println(Arrays.toString(bytes));
           for (byte b:
                bytes) {
               System.out.print(Character.toString(b) + " ");
           }
       } catch (IOException e) {
           System.err.println(e.getMessage());
       }

    }
}
