package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExampleTwo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> filteredAndMappedStrings = strings.stream()
                .filter(s -> s.length() <= 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredAndMappedStrings);


        System.out.println(strings
                .stream()
                .collect(Collectors.toMap(x -> x, String::length)));



    }
}
