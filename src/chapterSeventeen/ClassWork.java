package chapterSeventeen;

import java.util.*;
import java.util.stream.Collectors;

public class ClassWork {
    public static void main(String[] args) {
        Map<String, Integer> map =  new HashMap<>();
        map.put("Timo", 15);
        map.put("Sgreen",25);
        map.put("Idris",30);
        map.put("Joe",11);

        System.out.println(map.entrySet().stream().sorted(Comparator.comparing(x -> x.getValue())).collect(Collectors.toList()));
        var list = new ArrayList<>(map.entrySet());
//        list.sort(Comparator.comparing(Map.Entry::getValue));
        list.sort((x1, x2) -> x1.getValue().compareTo(x2.getValue()));
//        System.out.println(list);


        for (Map.Entry<String, Integer> names : list) {
            System.out.println(names.getKey() + " : " + names.getValue());
        }


    }
}
