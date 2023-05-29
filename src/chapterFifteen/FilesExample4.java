package chapterFifteen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FilesExample4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++) {
            Path path = Path.of("C:\\Users\\sgreen\\Desktop\\Regnos\\Files" + "\\" + args[i] + ".java");
            try {
                Files.createFile(path);
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
