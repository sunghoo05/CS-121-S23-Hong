import java.util.Scanner;

public class Sorting
{
    public int[] getArray()
    {
        int array[] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter Interger " + (i + 1));
            int n = input.nextInt();
            array[i] = n;
        }
        return array;
    }

    public int[] sortArray(int[] array)
    {
        // SELECTION SORT
        for (int i = 0; i < array.length - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < array[min])
                {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}