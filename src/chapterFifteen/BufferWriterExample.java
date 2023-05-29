package chapterFifteen;

import java.io.*;

public class BufferWriterExample {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        String[] words = {"QWERTY","ASDFG", "ZXCVB","PIOUY","LKJD","MSDGF"};
       try {
           OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("C:\\Users\\sgreen\\IdeaProjects\\javaProjects\\src\\chapterFifteen\\text.txt"));
           bufferedWriter = new BufferedWriter(writer);
           bufferedWriter.write(words[0]+ " " +words[3]+ " ");
           bufferedWriter.flush();
           bufferedWriter.write(words[1]);
           bufferedWriter.close();
       }catch (IOException e){
           System.err.println(e.getMessage());
       }


    }
}
