import java.sql.SQLOutput;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");

        System.out.print("Enter the amount of calories allowed per day: ");
        int caloriesPerDay = input.nextInt();

        System.out.print("Enter the start date of the diet (mm/dd/yyyy): ");
        String startDateString = input.next();
        Date startDate = null;
        try
        {
            startDate = dateFormat.parse(startDateString);
        }
        catch (ParseException e)
        {
            System.out.println("Invalid date format. Please enter the date in mm/dd/yyyy format.");
            return;
        }

        System.out.print("Enter the end date of the diet (mm/dd/yyyy): ");
        String endDateString = input.next();
        Date endDate = null;
        try
        {
            endDate = dateFormat.parse(endDateString);
        }
        catch (ParseException e)
        {
            System.out.println("Invalid date format. Please enter the date in mm/dd/yyyy format.");
            return;
        }

        int t = TotalCalories.calculateTotalCalories(caloriesPerDay, startDateString, endDateString);
        System.out.println("Total calories consumed during the diet period: " + t);
    }
}