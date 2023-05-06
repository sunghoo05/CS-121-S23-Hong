//**************************************************************
//                    Activity #17
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 03/01/23
// ***************************************************************
//      This program simply creates multiple arraylists to store
//      different information by using multiple methods and instances.
// *****************************************************************

package classArraylists;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseInfo
{
    // Create 4 array lists to store information for Course Name, GPAs, Scores, Letter Grades, respectively
    private ArrayList<String> courseName = new ArrayList<>();
    private ArrayList<Double> gpas = new ArrayList<>();
    private ArrayList<Integer> score = new ArrayList<>();
    private ArrayList<String> letterGrade = new ArrayList<>();

    // method "addCourseName": Let the user add the course name
    private void addCourseName(String s)
    {
        courseName.add(s);
    }

    // method "addGPAs": Let the user add the gpas
    private void addGPAs (double d)
    {
        gpas.add(d);
    }

    // method "addScore": Let the user add the scores
    private void addScore (int i)
    {
        score.add(i);
    }

    // method "addLetterGrade": Let the user add letter grades
    private void addLetterGrade (String c)
    {
        letterGrade.add(c);
    }

    // Print course name, GPAs, Scores, Letter Grades based on the array lists
    private void printTable()
    {
        System.out.println("Course Name     GPAs     Score     Letter Grade");
        for (int i = 0;  i < courseName.size(); i++)
        {
            System.out.printf("%s %18.2f %7d %7s", courseName.get(i), gpas.get(i), score.get(i), letterGrade.get(i));
            System.out.println("");
        }
    }

    // method "displayClassInfo": Ask the user to input different information using Scanner method
    public void displayClassInfo(Scanner input)
    {
        String s = null;
        while (true)
        {
            if (! "q".equals(s))
            {
                System.out.println("Please enter the Course Name");
                s = input.nextLine();
                if (s.equals("q"))
                {
                    printTable();
                    break;
                }
                addCourseName(s);

                System.out.println("Please enter the GPA score in the course");
                s = input.nextLine();
                if (s.equals("q"))
                {
                    printTable();
                    break;
                }
                addGPAs(Double.parseDouble(s));

                System.out.println("Please enter the score in the course");
                s = input.nextLine();
                if (s.equals("q"))
                {
                    printTable();
                    break;
                }
                addScore(Integer.parseInt(s));

                System.out.println("Please enter the Letter Grade in the course");
                s = input.nextLine();
                if (s.equals("q"))
                {
                    printTable();
                    break;
                }
                addLetterGrade(s);
            }
        }
    }
}