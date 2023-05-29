package chapterFourteen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.List;

public class LocalDateSample {
    public static void main(String[] args) {
        String date = "04/24/2023";

        try {
            System.out.println(parseDate(date));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
    public static LocalDate parseDate(String date) {
        if (date.split("/").length == 3 || date.split("-").length == 3) {

            DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder()
                    .append(DateTimeFormatter.ofPattern("[MM/dd/yyyy]" + "[dd-MM-yyyy]" + "[yyyy-MM-dd]"));
            DateTimeFormatter dateTimeFormatter = dateTimeFormatterBuilder.toFormatter();
            return LocalDate.parse(date, dateTimeFormatter);
        }
        throw new IllegalArgumentException("Date format is wrong");
    }
}
