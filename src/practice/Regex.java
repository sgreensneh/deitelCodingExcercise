package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String userInput = "email@gmail.com";
        System.out.println(userInput.matches("[[a-z]+@[a-z]+\\.[a-z]{2,}]{2,}"));
        System.out.println(Pattern.matches("[a-z]+@[a-z]+\\.[a-z]{2,}", userInput));


        Pattern pattern = Pattern.compile("[a-z]+@[a-z]+\\.[a-z]{2,}");
        Matcher matcher = pattern.matcher(userInput);
        System.out.println(matcher.matches());
//        System.out.println(pattern.matcher(userInput).matches());


    }


}
