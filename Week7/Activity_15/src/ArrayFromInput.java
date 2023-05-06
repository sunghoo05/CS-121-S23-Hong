//**************************************************************
//                    Activity #15
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 03/01/23
// ***************************************************************
//      This program simply turns the user input into the array
//      and print the created array. The program first ask the number
//      of students to record. Then, ask the user for the students'
//      information. Then, print the array based on the user input
// *****************************************************************

import java.util.Scanner;

public class ArrayFromInput
{
    public static void main(String[] args)
    {
        // Ask the user for the number of students to record (AT LEAST 3)
        Scanner input = new Scanner(System.in);
        System.out.println("How many students do you want to record? (Please put at least 3)");
        int studentNumber = Integer.parseInt(input.nextLine());

        // Initiate 3 different arrays to record the students' information (Name, GPA, Grade Level)
        String[] studentNames = new String[studentNumber];
        double[] GPAs = new double[studentNumber];
        int[] gradeLevels = new int[studentNumber];

        // Ask the user to input the students' information
        // And put the values into the arrays
        for (int i = 0; i < studentNumber; i++)
        {
            System.out.println("Student " + (i + 1));

            System.out.println("Student Name: ");
            studentNames[i] = input.nextLine();

            System.out.println("Student's GPA: ");
            GPAs[i] = Double.parseDouble(input.nextLine());

            System.out.println("Student's Grade Level: ");
            gradeLevels[i] = Integer.parseInt(input.nextLine());

            System.out.println();
        }

        // Print the students' information with the arrays created
        System.out.printf("%-14s %-5s %s\n", "Student Names", "GPAs", "Grade Levels");
        for (int i = 0; i < studentNumber; i++)
        {
            System.out.printf("%-14s %-5.2f %d\n", studentNames[i], GPAs[i], gradeLevels[i]);
        }
        input.close();
    }
}