import java.util.Scanner;

public class RestaurantSelector
{
    public static void main(String[] args)
    {
        // get input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a vegetarian? (Please answer with yes or no) ");
        String vege = input.nextLine();
        System.out.println("Are you a vegan? (Please answer with yes or no) ");
        String vegan = input.nextLine();
        System.out.println("Are you gluten-free? (Please answer with yes or no) ");
        String gluten = input.nextLine();

        // print the user's restaurant choices
        if (vege.equals("yes") && vegan.equals("yes") && gluten.equals("yes"))
        {
            System.out.println("Here are your restaurant choices: ");
            System.out.println("     The Chef's Kitchen");
            System.out.println("     Corner Cafe");
        }
        else if (vege.equals("yes") && vegan.equals("yes") && gluten.equals("no"))
        {
            System.out.println("Here are you restaurant choices: ");
            System.out.println("     The Chef's Kitchen");
            System.out.println("     Corner Cafe");
        }
        else if (vege.equals("yes") && vegan.equals("no") && gluten.equals("no"))
        {
            System.out.println("Here are you restaurant choices: ");
            System.out.println("     The Chef's Kitchen");
            System.out.println("     Corner Cafe");
            System.out.println("     Main Street Pizza Company");
            System.out.println("     Mama’s Fine Italian");
        }
        else if (vege.equals("no") && vegan.equals("no") && gluten.equals("no"))
        {
            System.out.println("Here are you restaurant choices: ");
            System.out.println("     The Chef's Kitchen");
            System.out.println("     Corner Cafe");
            System.out.println("     Main Street Pizza Company");
            System.out.println("     Mama’s Fine Italian");
            System.out.println("     Joe’s Gourmet Burgers");
        }
        else if (vegan.equals("no") && vegan.equals("no") && gluten.equals("yes"))
        {
            System.out.println("Here are you restaurant choices: ");
            System.out.println("     The Chef's Kitchen");
            System.out.println("     Corner Cafe");
            System.out.println("     Main Street Pizza Company");
        }
        else if (vegan.equals("no") && vegan.equals("yes") && gluten.equals("yes"))
        {
            System.out.println("Here are you restaurant choices: ");
            System.out.println("     The Chef's Kitchen");
            System.out.println("     Corner Cafe");
        }
    }
}