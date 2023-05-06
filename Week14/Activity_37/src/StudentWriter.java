import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

public class StudentWriter {
    public static void main(String[] args)
    {
        try
        {
            Student student = new Student ("John Smith", 12345, "Computer Science");

            Gson gson = new Gson();

            String jsonString = gson.toJson(student);

            FileWriter fileWriter = new FileWriter("student1.json");
            fileWriter.write(jsonString);
            fileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}