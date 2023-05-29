package chapterSixteen;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Green");
        names.add("Idris");
        names.add("Timo");
        names.add("Moyin");


        Iterator<String> nameIterator = names.iterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }
        System.out.println();

        names.forEach(System.out::println);

        System.out.println();

        names.forEach(System.out::println);

        System.out.println();

        for(String name : names){
            System.out.println(name);
        }


    }
}
