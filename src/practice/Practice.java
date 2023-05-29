package practice;

import java.time.LocalDate;

public class Practice {
    public static void main(String[] args) {
    LocalDate date =  LocalDate.now();
        System.out.println(date.getYear());

        int a = 10;
        int b = a;
        a = 100;
        System.out.println(a +" "+ b);
        

        Green green = new Green("sunny ");
        Green sunny = green;
        System.out.println(green.name +""+ sunny.name);
        green.name = "Sgreen";
        System.out.println(green.name +" "+ sunny.name);
    }
    static class Green {
        String name;
        Green(String name){
            this.name = name;

        }

    }

}
