package chapterFifteen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\sgreen\\Regnos\\");
        Path path2 = Paths.get("a", "b", "c.java");
        System.out.println(path2);
        Files.createFile(path);
        System.out.println("File name: " + path.getFileName());
        System.out.println("File system: " + path.getFileSystem());
        System.out.println("Normal path: " + path.normalize());
        System.out.println("Root: " + path.getRoot());
    }
}
