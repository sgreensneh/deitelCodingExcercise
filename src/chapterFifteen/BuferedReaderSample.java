package chapterFifteen;

import java.io.*;

public class BuferedReaderSample {
    public static void main(String[] args) {
       try(InputStreamReader reader = new InputStreamReader(System.in);
           BufferedReader bufferedReader = new BufferedReader(reader);
           FileWriter writer = new FileWriter("C:\\Users\\sgreen\\IdeaProjects\\javaProjects\\src\\chapterFifteen\\text.txt");) {
           String input =bufferedReader.readLine();
           writer.write(input);
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
