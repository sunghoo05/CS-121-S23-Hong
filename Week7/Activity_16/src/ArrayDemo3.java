//**************************************************************
//                    Activity #16
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 03/01/23
// ***************************************************************
//      In this activity, I used different methods to make the
//      array and to print the array.
// *****************************************************************

public class ArrayDemo3
{
    public static void main(String[] args)
    {
        String[][] APs = {{"AP Microeconomics", "AP Macroeconomics", "AP Psychology"},
                          {"AP Computer Science A", "AP Calculus BC", "AP Chemistry"},
                          {"AP Physics C", "AP Environmental Science", "AP Statistics"}};
        for (int r = 0; r < APs.length; r++)
        {
            for (int c = 0; c < APs[r].length; c++)
            {
                System.out.printf("%s", APs[r][c] + " ");
            }
            System.out.println();
        }
    }
}