package chapterSeventeen;

import chapterSixteen.Customer;

import java.util.*;

public class MainStudent {
    public static void main(String[] args) {


        List<Student> students = new ArrayList<>(List.of(
                new Student("jerry", 40),
                new Student("idris", 20),
                new Student("felix", 50),
                new Student("timo", 35),
                new Student("sam", 20),
                new Student("jerry", 40)));


        Comparator<Student> comparator = Comparator.comparingInt(Student::getAge);
        comparator.thenComparing(Student::getName);
        students.sort(comparator);


    }
}
