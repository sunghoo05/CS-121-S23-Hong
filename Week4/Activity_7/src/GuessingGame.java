//**************************************************************
//                    Activity #7
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 02/06/23
// ***************************************************************
//      This program simply is a Guessing Game
//      First, the program will allow the user to input their first
//      guess and the program will let the user know if the guess
//      is too high, too low, or correct
// *****************************************************************

import java.util.Scanner;
import java.util.Random;

public class GuessingGame
{
    public static void main(String[] args)
    {
        // Get input from the user for their guess
        Scanner userInput = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100, or enter q if you give up");
        String input;
        input = userInput.nextLine();

        // Generate the Random Number
        Random randNumber = new Random();
        int randomNumber = randNumber.nextInt(1, 100);

        int numberOfGuesses = 0;

        // Compare the input from the user with the Random Number
        // Let the user know if their guess is correct, too high, or too low
        // Also print the number of guesses
        while (! input.equals("q"))
        {
            if (Integer.parseInt(input) > randomNumber)
            {
                System.out.println("Too high. Guess again:");
                input = userInput.nextLine();
                numberOfGuesses ++;
            }
            else if (Integer.parseInt(input) < randomNumber)
            {
                System.out.println("Too low. Guess again: ");
                input = userInput.nextLine();
                numberOfGuesses ++;
            }
            else if (Integer.parseInt(input) == randomNumber)
            {
                numberOfGuesses++;
                System.out.println("Correct!");
                System.out.println("Number of guesses: " + numberOfGuesses);
                break;
            }
        }
        if (input.equals("q"))
        {
            System.out.println("Quitter! The number was " + randomNumber);
        }
    }
}