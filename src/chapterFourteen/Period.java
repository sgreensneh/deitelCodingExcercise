package chapterFourteen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Period {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 4, 17);
        String dateString = date.format(DateTimeFormatter.ISO_DATE);

        LocalDate date1 = LocalDate.of(2023, 4, 17);
        LocalDate date2 = LocalDate.of(2023, 4, 18);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is equal to " + date2);
        }


    }


}
