//**************************************************************
//                    Activity #4
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 02/01/23
// ***************************************************************
//      This program simply let the user check information for their
//      chosen state.
// *****************************************************************

import java.util.Scanner;

public class SwitchActivity
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask the user input their choice
        String[] items = {"Indiana", "Illinois", "California", "New York"};
        System.out.println("Choose one of four states to see its properties");
        System.out.println(items[0] + ", " + items[1] + ", " + items[2] + ", " + items[3]);
        String state = input.nextLine();

        // Properties of each stat: Population, Size, Capital
        String[] Indiana = {"Population: 6.806 Million", "Size: 36,418 mi^2", "Capital: Indianapolis"};
        String[] Illinois = {"Population: 12.67 Million", "Size: 57,915 mi^2", "Capital: Springfield"};
        String[] California = {"Population: 39.24 Million", "Size: 163,696 mi^2", "Capital: Sacramento"};
        String[] NewYork = {"Population: 19.84 Million", "Size: 54,556 mi^2", "Capital: Albany"};

        // Print information for the user's choice
        System.out.println("You choose " + state);
        System.out.println("Following are " + state +"'s properties: ");
        if (state.equals("Indiana"))
        {
            for (int i = 0; i < Indiana.length; i++)
            {
                System.out.println(Indiana[i]);
            }
        }
        else if (state.equals("Illinois"))
        {
            for (int i = 0; i < Illinois.length; i++)
            {
                System.out.println(Illinois[i]);
            }
        }
        else if (state.equals("California"))
        {
            for (int i = 0; i < California.length; i++)
            {
                System.out.println(California[i]);
            }
        }
        else if (state.equals("NewYork"))
        {
            for (int i = 0; i < NewYork.length; i++)
            {
                System.out.println(NewYork[i]);
            }
        }
    }
}