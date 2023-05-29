package writer;

import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
      try(  FileWriter writer = new FileWriter("C:\\Users\\sgreen\\IdeaProjects\\javaProjects\\src\\chapterFifteen\\text.txt")) {
          writer.append("Thank God is friday");
      } catch (IOException e){
          System.out.println(e.getMessage());
      }

    }
}
