import java.util.ArrayList;

public class GenericMethods
{
    public static <T> void printArrayList(ArrayList<T> list)
    {
        for (T element : list)
        {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}