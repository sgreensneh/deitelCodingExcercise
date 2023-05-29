package chapterSix;

public class EnumerateExercise {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
        if (day == DaysOfTheWeek.THURSDAY) {
            System.out.println("Yay it's almost Friday!");
    }
        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
            System.out.println(myDay);
        }
    }
}
