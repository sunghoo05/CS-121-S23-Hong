import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearchTester
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        BinarySearchDemo demo = new BinarySearchDemo();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(0, 23);
        array.add(1, 17);
        array.add(2, 12);
        array.add(3, 90);
        array.add(4, 84);
        array.add(5, 38);
        array.add(6, 5);
        array.add(7, 77);
        array.add(8, 44);
        System.out.print("unsorted: ");
        for (int i = 0; i < array.size(); i++)
        {
            System.out.print(array.get(i) + " ");
        }

        System.out.println();

        Collections.sort(array);

        System.out.print("sorted: ");
        for (int i = 0; i < array.size(); i++)
        {
            System.out.print(array.get(i) + " ");
        }

        System.out.println();

        System.out.println("What number would you like to sort for?");
        int key = Integer.parseInt(console.nextLine());

        int found = demo.binarySearch(key, array);
        if (found == -1)
        {
            System.out.println("Item not found");
        }
        else
        {
            System.out.printf("Item found at index %d, position %d", found, found + 1);
        }
    }
}