import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

public class StudentReader
{
    public static void main(String[] args)
    {
        try
        {
            Gson gson = new Gson();

            BufferedReader reader = new BufferedReader(new FileReader("students.json"));

            Student students = gson.fromJson(reader, Student.class);

            System.out.println("**** Student Details ****");
            System.out.printf("Student nameL %s\nStudent id: %d\nStudent Major: %s", students.getName(), students.getId(), students.getMajor());
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}