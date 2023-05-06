import java.util.Scanner;

public class Sorting
{

    public int[] getArray()
    {
        int array[] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter Integer " + (i+1));
            int n = input.nextInt();
            array[i] = n;
        }
        return array;
    }

    public int[] sortArray(int[] arr)
    {
        // BUBBLE SORT
        int temp;
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int index = 0; index < arr.length - i - 1; index++)
            {
                if (arr[index] > arr[index + 1])
                {
                    temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                }
            }
        }
        return arr;
    }
}