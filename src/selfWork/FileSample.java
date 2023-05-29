package selfWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSample {
    public static void main(String[] args) throws IOException {
        File file = createFile("src/semicolon.txt");
        writeToFile(file,true);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }




    }
    private static void writeToFile(File file, boolean append) throws IOException {
        FileWriter fileWriter = new FileWriter(file,append);
        PrintWriter writer = new PrintWriter(file);
        writer.write("Green");
        writer.flush();
        writer.close();
    }

    private static File createFile(String path) throws IOException {
        File file = new File(path);
        if(!file.exists()){
            file.createNewFile();
        }
        return file;
    }
}
