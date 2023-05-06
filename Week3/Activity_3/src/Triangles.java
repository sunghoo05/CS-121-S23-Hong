//**************************************************************
//                    Activity #3-3
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 02/01/23
// ***************************************************************
//      This program simply let the user input the length of three
//      sides of the triangle. Then, the program will compare the
//      length of three sides and print if the triangle is
//      equilateral, isosceles, or scalene.
// *****************************************************************

package Week3.Activity_3.src;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class Triangles
{
    public static void main(String[] args)
    {
        String fS = showInputDialog("Please input the length of the first side: ");
        String sS = showInputDialog("Please input the length of the second side: ");
        String tS = showInputDialog("Please input the length of the third side: ");

        int firstSide = Integer.parseInt(fS);
        int secondSide = Integer.parseInt(sS);
        int thirdSide = Integer.parseInt(tS);

        if (firstSide == secondSide && firstSide == thirdSide && secondSide == thirdSide)
        {
            JOptionPane.showMessageDialog(null, "Your triangle is an Equilateral Triangle");
        }
        else if (firstSide == secondSide && firstSide != thirdSide && secondSide != thirdSide)
        {
            JOptionPane.showMessageDialog(null, "Your triangle is an Isosceles Triangle");
        }
        else if (firstSide != secondSide && firstSide != thirdSide && secondSide != thirdSide)
        {
            JOptionPane.showMessageDialog(null, "Your triangle is a Scalene Triangle");
        }
    }
}