//**************************************************************
//                    Activity #10
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 02/13/23
// ***************************************************************
//      This program simply print the text file
// *****************************************************************

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Get the particular file to print
        File inputFile = new File("textFile.txt");

        try
        {
            Scanner input = new Scanner(inputFile);

            String header = input.nextLine();
            System.out.println(header);

            // While there is text on the next line
            // Print the text file
            while (input.hasNextLine())
            {
                String course = input.next();
                int credits = Integer.parseInt(input.next());
                int scores = Integer.parseInt(input.next());
                System.out.printf("%-7s %3d %7d\n", course, credits, scores);
            }
            input.close();
        }
        catch(FileNotFoundException e)
        {
            System.err.println("File not found.");
        }
    }
}