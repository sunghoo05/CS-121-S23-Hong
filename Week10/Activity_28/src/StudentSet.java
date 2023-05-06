import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentSet
{
    Set<String> students = new HashSet<>();

    public void addStudents()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name or 'q' to quit:");

        String input = scanner.nextLine();

        while (!input.equals("q"))
        {
            students.add(input);
            System.out.println("Enter student name or 'q' to quit:");
            input = scanner.nextLine();
        }
    }

    public void displayStudents()
    {
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext())
        {
            String student = iterator.next();
            System.out.println(student);
        }
    }
}