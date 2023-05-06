//**************************************************************
//                    Activity #16
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 03/01/23
// ***************************************************************
//      In this activity, I used different methods to make the
//      array and to print the array.
// *****************************************************************

public class ArrayDemo2
{
    public static void main(String[] args)
    {
        String[][] students = new String[4][3];
        students[0][0] = "Sami";
        students[0][1] = "Daniel";
        students[0][2] = "Sung Hoo";
        students[1][0] = "Indiana";
        students[1][1] = "Indiana";
        students[1][2] = "South Korea";
        students[2][0] = "Junior";
        students[2][1] = "Junior";
        students[2][2] = "Junior";
        students[3][0] = "Indiana Academy";
        students[3][1] = "Indiana Academy";
        students[3][2] = "Indiana Academy";

        for (String[] row : students)
        {
            for (String c : row)
            {
                System.out.printf("%s ", c);
            }
            System.out.println();
        }
    }
}