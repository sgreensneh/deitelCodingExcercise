package forLoop;

import java.util.Scanner;

public class StudentGradeCollation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("How many students do you have?");
            int numberOfStudent = scanner.nextInt();

            System.out.println("How many subjects do they offer?");
            int numberOfSubject = scanner.nextInt();

            int[][] gradeBook = new int[numberOfStudent][numberOfSubject+1];

            for (int i = 0; i < gradeBook.length; i++) {
                System.out.printf("COLLATING STUDENT %d GRADE%n", (i+1));
                int total = 0;
                for (int j = 0; j < gradeBook[i].length-1; j++) {
                    System.out.println("Enter score for subject " + (j+1));
                    int grade = scanner.nextInt();
                    gradeBook[i][j] = grade;
                    total+=grade;
                }
                gradeBook[i][gradeBook[i].length-1] = total;
            }
            System.out.println();
            System.out.println();

            System.out.printf("""
                ============================================================
                %-13s""", "STUDENT ID");
            for (int i = 0; i < numberOfSubject; i++) {
                System.out.printf("%-7s", "SCORE"+ (i+1));
            }
            System.out.printf("""
                %-7s
                ============================================================
                """, "TOTAL"    );

            for (int i = 0; i < gradeBook.length; i++) {
                System.out.printf(" %10d", i+1);
                for (int j = 0; j < gradeBook[i].length; j++) {
                    System.out.printf("%7d", gradeBook[i][j]);
                }
                System.out.println();
            }
            System.out.printf("""
                =============================================================
                """);

            int highestNumber = 0;
            int studentWithHighestNumber = 0;
            int lowestNumber = 0;
            int studentWithLowestNumber = 0;
            for (int i = 0; i < gradeBook.length; i++) {
                for (int j = 0; j < gradeBook[i].length; j++) {
                    int total = gradeBook[i][gradeBook[i].length-1];
                    if (total > highestNumber){
                        highestNumber = total;
                        studentWithHighestNumber = i + 1;
                    }
                    else {
                        lowestNumber = total;
                        studentWithLowestNumber = i + 1;
                    }
                }
            }
            System.out.printf("""
                ===========================================
                Student %d has the highest score of %d
                Student %d has the lowest score of %d
                ===========================================
                """, studentWithHighestNumber, highestNumber, studentWithLowestNumber, lowestNumber);

}
    }

