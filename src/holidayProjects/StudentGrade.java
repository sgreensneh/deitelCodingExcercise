package holidayProjects;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students do you have?");
        int numberOfStudent = input.nextInt();

        System.out.println("How many subjects do they offer?");
        int numberOfSubject = input.nextInt();

        int[][] gradeBook = new int[numberOfStudent][numberOfSubject+3];
        int [] position = new int[numberOfStudent];

        for (int i = 0; i < gradeBook.length; i++) {
            System.out.println("Student " + (i + 1) + " scores:");
            int total = 0;
            for (int j = 0; j < gradeBook[i].length-3; j++) {
                System.out.println("Enter scores for subject " + (j + 1));
                int scores = input.nextInt();
                gradeBook[i][j] = scores;
                total += scores;
            }
            position[i] = total;
           gradeBook[i][gradeBook[i].length-3] = total;
           gradeBook[i][gradeBook[i].length-2] = total/numberOfSubject;

        }
        Arrays.sort(position);
        int [] positionCopy = new int[position.length];
        int count = 0;
        for (int index = position.length-1; index >= 0; index--, count++) {
            positionCopy[count] = position[index];
        }
        for (int studentIndex = 0; studentIndex < gradeBook.length; studentIndex++) {
            for (int positionIndex = 0; positionIndex < positionCopy.length; positionIndex++) {
                if (gradeBook[studentIndex][gradeBook[studentIndex].length-3] == positionCopy[positionIndex]) {
                    gradeBook[studentIndex][gradeBook[studentIndex].length-1] = positionIndex + 1;
                }
            }
        }


        System.out.println();
        System.out.printf("""
               ===============================================
               %-13s""", "StudentId");
        for (int i = 0; i <numberOfSubject ; i++) {
            System.out.printf("%-7s", "Score" + (i+1));
        }
        System.out.printf("""
                %-5s %-8s %-8s
                ==============================================
                 """, "Total", "Average", "Pos");
        for (int i = 0; i < gradeBook.length ; i++) {
            System.out.printf("student %d",i+1);
            for (int j = 0; j < gradeBook[i].length ; j++) {
                System.out.printf("%7d",gradeBook[i][j]);
            }
            System.out.println();
        }


        int highestScore = 0;
        int studentWithHighestScore =0;
        int lowestScore = Integer.MAX_VALUE;
        int studentWithLowestScore =0;
        for (int i = 0; i <gradeBook.length; i++) {
            for (int j = 0; j <gradeBook[i].length; j++) {
                int totalScores = gradeBook[i][gradeBook[i].length-3];
                if(totalScores > highestScore){
                    highestScore = totalScores;
                     studentWithHighestScore = i +1;
                }
                 if(totalScores < lowestScore ){
                    lowestScore = totalScores;
                    studentWithLowestScore = i+1;
                }
            }

        }
        System.out.printf("""
                ===============================================
                Student %d has the highest score ==> %d
                Student %d has the lowest score ==> %d
                ===============================================
                """, studentWithHighestScore, highestScore, studentWithLowestScore, lowestScore);






    }
}




