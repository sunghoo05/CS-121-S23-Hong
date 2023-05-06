package classArraylists;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Create the instance to input the course information
        Scanner input = new Scanner(System.in);
        CourseInfo arrayList = new CourseInfo();

        arrayList.displayClassInfo(input);

    }
}