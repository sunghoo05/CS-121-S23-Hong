//**************************************************************
//                    Activity #10
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 02/13/23
// ***************************************************************
//      This program simply adds the values to the existing Text File
// *****************************************************************

import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            // Make sure that the user input goes to the particular text file
            FileWriter fileWriter = new FileWriter("textFile.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            // Ask the user for the course names, course credits, and course scores to put into the text file
            String course = JOptionPane.showInputDialog("Enter course name");
            String credits = JOptionPane.showInputDialog("Enter course credits");
            String score = JOptionPane.showInputDialog("Enter course score");

            output.printf("\n%s %s %s", course, credits, score);
            fileWriter.close();
            output.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println("File Not Found");
        }
    }
}