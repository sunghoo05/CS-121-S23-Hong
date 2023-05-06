//**************************************************************
//                    Activity #11
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 02/13/23
// ***************************************************************
//      This program simply get the input from the user for the values
//      of the length and width. Then, the program will display the
//      data and area by using the mathematical operation
// *****************************************************************

import java.util.Scanner;

public class MethodActivity
{
    static Scanner scanner = new Scanner(System.in);
    double getLength;
    double getWidth;
    double getArea;

    // accepts the length, width, and area as arguments and displays each on a separate line with label
    static void displayData(double length, double width, double area)
    {
        System.out.println("rectangle length: " + length);
        System.out.println("rectangle width: " + width);
        System.out.println("rectangle area: " + area);
    }

    public static void main(String[] args)
    {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
        scanner.close();
    }

    // asks the user to enter the rectangle's length and return the value as a double
    static double getLength()
    {
        double length;
        System.out.println("Enter the length of a rectangle");
        length = scanner.nextDouble();
        return length;
    }

    // asks the user to enter the rectangle’s width and return the value as a double
    static double getWidth()
    {
        double width;
        System.out.println("Enter the width of a rectangle");
        width = scanner.nextDouble();
        return width;
    }

    // accepts the length and width as arguments and returns the rectangle’s area (l * w) as a double.
    static double getArea(double length, double width)
    {
        return (length * width);
    }
}