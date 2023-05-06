import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TotalCalories
{
    public static int calculateTotalCalories(int caloriesPerDay, String startDateString, String endDateString)
    {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date startDate = null;
        Date endDate = null;
        try
        {
            startDate = dateFormat.parse(startDateString);
            endDate = dateFormat.parse(endDateString);
        }
        catch (ParseException e)
        {
            System.out.println("Invalid date format. Please enter the date in mm/dd/yyyy format.");
            return -1;
        }

        long days = TimeUnit.DAYS.convert(endDate.getTime() - startDate.getTime(), TimeUnit.MILLISECONDS);
        int totalCalories = (int) days * caloriesPerDay;

        return totalCalories;
    }
}