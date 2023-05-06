//**************************************************************
//                    Activity #3-1
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 02/01/23
// ***************************************************************
//      This program simply asks the user for the number. Then,
//      check if the number is odd or even using "%"
// *****************************************************************

package Week3.Activity_3.src;

import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        // Asks the user for the number
        Scanner number = new Scanner(System.in);
        System.out.println("Input any number to check whether it is Even or Odd: ");
        int n = Integer.parseInt(number.nextLine());

        // Check if the number is even or odd
        if (n % 2 == 0)
        {
            System.out.println("Your number is EVEN");
        }
        else if (n % 2 == 1)
        {
            System.out.println("Your number is ODD");
        }
    }
}