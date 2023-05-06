//**************************************************************
//                    Activity #10
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 02/13/23
// ***************************************************************
//      This program simply let the user create the text file
//      and write on it
// *****************************************************************

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FileWrite
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Create the text file
        File outputFile = new File("textFile.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String course;
        String credits;
        String score;

        output.printf("%s %s %s\n", "course", "credits", "score");
        // Let the user write "Course Name", "Course Credits", and "Scores"
        for (int i = 1; i <= 3; i++)
        {
            course = JOptionPane.showInputDialog(String.format("Enter name of course %d", i));
            credits = JOptionPane.showInputDialog("Enter the course credits");
            score = JOptionPane.showInputDialog("Enter the course score");
            output.printf("%s %s %s\n", course, credits, score);
        }
        output.close();
    }
}