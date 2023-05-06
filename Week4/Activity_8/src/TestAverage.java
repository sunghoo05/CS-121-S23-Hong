//**************************************************************
//                    Activity #8
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 02/06/23
// ***************************************************************
//      This program simply calculate the average of test scores
//      First, the program gets the number of students and test
//      scores per student from the user. Then, the program uses
//      mathematical operations to divide the total score by the
//      number of the students
// *****************************************************************

import java.util.Scanner;

public class TestAverage
{
    public static void main(String[] args) {
        // Get the number of students and test scores per students from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int studentNumber = input.nextInt();
        System.out.println("");
        System.out.println("Enter number of tests per students");
        int testScoresPerS = input.nextInt();
        System.out.println("");

        // Calculate the average of test scores per students
        double averageScore = 0;
        double totalScore = 0;

        // Print the student number and his or her score
        // Then print the average score for the class
        for (int i = 1; i <= studentNumber; i++)
        {
            System.out.println("Student number " + i);
            System.out.println("--------------------");
            for (int j = 1; j <= testScoresPerS; j++)
            {
                System.out.println("Enter score " + j);
                int score = input.nextInt();
                totalScore = totalScore + (double) score;
            }
            averageScore = totalScore / testScoresPerS;
            System.out.println("The average score for student " + i + " is " + averageScore);
            System.out.println("");
            averageScore = 0;
            totalScore = 0;
        }
    }
}