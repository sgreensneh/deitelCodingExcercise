package chapterFifteen;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
      try {
          FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\sgreen\\IdeaProjects\\javaProjects\\src\\chapterFifteen\\text_output.txt");
          byte[] bytes ={72, 101,108,108,111,32,87,111,114,108,100 };
          fileOutputStream.write(bytes);
      }
      catch (IOException e){
          System.out.println(e.getMessage());
      }



    }
}
