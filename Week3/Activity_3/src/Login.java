//**************************************************************
//                    Activity #3-2
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 02/01/23
// ***************************************************************
//      This program simply let the user create their username,
//      password. Then, the program allows the user to log in if
//      they input the correct username and password. If one of
//      username and password is incorrect, the program will let
//      the user know that input is incorrect and the user rewrite
//      username and password to log in.
// *****************************************************************

package Week3.Activity_3.src;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class Login
{
    public static void main(String[] args)
    {
        // Let the user create their usernames and passwords
        String uN = showInputDialog("Please create your User Name: ");
        String pW = showInputDialog("Please create your Password: ");

        // Ask the user input their usernames and passwords to log in
        String userName = showInputDialog("Please input your User Name: ");
        String passWord = showInputDialog("Please input your Password: ");

        // Check if one of username and password is incorrect
        if (userName.equals(uN) && passWord.equals(pW))
        {
            JOptionPane.showMessageDialog (null, "Welcome to CS121!");
        }
        else if (!userName.equals(uN) && !passWord.equals(pW))
        {
            JOptionPane.showMessageDialog (null, "You input incorrect User Name and Password. Please try again");
        }
        else if (userName.equals(uN) || passWord.equals(pW))
        {
            if (!userName.equals(uN))
            {
                JOptionPane.showMessageDialog (null, "You input incorrect User Name. Please try again");
            }
            else if (!passWord.equals(pW))
            {
                JOptionPane.showMessageDialog (null, "You input incorrect Password. Please try again");
            }
        }
    }
}