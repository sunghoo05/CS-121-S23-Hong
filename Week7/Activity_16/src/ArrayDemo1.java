//**************************************************************
//                    Activity #16
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 03/01/23
// ***************************************************************
//      In this activity, I used different methods to make the
//      array and to print the array.
// *****************************************************************

public class ArrayDemo1
{
    public static void main(String[] args)
    {
        String[][] studentsInformation = {{"Sami", "Daniel", "Sung Hoo"},
                {"Indiana", "Indiana", "South Korea"},
                {"Junior", "Junior", "Junior"},
                {"Indiana Academy", "Indiana Academy", "Indiana Academy"}};

        for (int r = 0; r < studentsInformation.length; r++)
        {
            for (int c = 0; c < studentsInformation[r].length; c++)
            {
                System.out.printf("%s", studentsInformation[r][c] + " ");
            }
            System.out.println();
        }
    }
}