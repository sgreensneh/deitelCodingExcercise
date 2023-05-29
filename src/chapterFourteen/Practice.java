package chapterFourteen;

import java.time.LocalDate;

public class Practice {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 4, 17);

        LocalDate nextMonth = date.plusMonths(1);

        LocalDate yesterday = date.minusDays(1);

        LocalDate twoYearsLater = date.plusYears(2);

    }
}
