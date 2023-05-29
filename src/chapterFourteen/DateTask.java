package chapterFourteen;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTask {
    public static void main(String[] args) {
        String date = "17/04/1991";
//        String[] tokenizeDate = date.split("/");
//        System.out.println(convertDate2(date));
//        System.out.println(convert(date));

    }

//    public static String covertDate(String date){
//        String[] tokenizeDate = date.split("/");
//        LocalDate date = LocalDate.now();
//        String text = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//       return LocalDate parsedDate = LocalDate.parse(tokenizeDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

//    }

    public static  String convertDate2(String date){
        LocalDate  localDate = LocalDate.now();
        LocalDate parsedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int dayOfTheMonth = parsedDate.getDayOfMonth();
        String dayOfTheWeek = String.valueOf(parsedDate.getDayOfWeek());
        String month = String.valueOf(parsedDate.getMonth());
        int year = parsedDate.getYear();
        return  String.format("%s %s %s %s", dayOfTheWeek, dayOfTheMonth, month, year);
    }



}
