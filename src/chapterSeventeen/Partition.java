package chapterSeventeen;

import java.util.List;
import java.util.stream.Collectors;

public class Partition {
    public static void main(String[] args) {
        List<String> words = List.of(
                "qwer",
                "fgh",
                "xcvbn",
                "cv"

        );

        var map = words.stream().collect(Collectors.partitioningBy((w) -> w.length() % 2 ==0));
        System.out.println(map);
    }
}
