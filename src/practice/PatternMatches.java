package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PatternMatches {
    public static void main(String[] args) {

//
        String date = "17/04/1970";
        String[] dates = date.split("/");
//        String[] dates = date.split("/");
//        String month = "";
//
//        switch (dates[1]) {
//            case "01" -> month = "JANUARY";
//            case "02" -> month = "FEBRUARY";
//            case "03" -> month = "MARCH";
//            case "04" -> month = "APRIL";
//            case "05" -> month = "MAY";
//            case "06" -> month = "JUNE";
//            case "07" -> month = "JULY";
//            case "08" -> month = "AUGUST";
//            case "09" -> month = "SEPTEMBER";
//            case "10" -> month = "OCTOBER";
//            case "11" -> month = "NOVEMBER";
//            case "12" -> month = "DECEMBER";
//        }
//
//        System.out.printf("%s %s, %s", dates[0], month, dates[2]);

        System.out.println(covertDate(date));



    }

    public  static String covertDate(String date){
        return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy").format(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MMMM/yyyy")));
    }


}
