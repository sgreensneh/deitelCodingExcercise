package chapterFourteen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class LocalDatePractice {
    public static void main(String[] args) {
        String date = "04-24-2023";
        List<String> dateFormats = Arrays.asList("MM/dd/yyyy", "dd.MM.yyyy", "yyyy-MM-dd");
        System.out.println(parseDate(date, dateFormats));




    }
    public static Date parseDate(String dateString, List<String> formatStrings) {
        for (String formatString : formatStrings) {
            try {
                return new SimpleDateFormat(formatString).parse(dateString);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }



}

