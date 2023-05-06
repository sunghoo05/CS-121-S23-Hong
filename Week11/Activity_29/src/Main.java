import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        GenericMethods a = new GenericMethods();
        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<Character> charArrayList = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));

        System.out.print("Integer ArrayList: ");
        a.printArrayList(intArrayList);
        System.out.print("Double ArrayList: ");
        a.printArrayList(doubleArrayList);
        System.out.print("Character ArrayList: ");
        a.printArrayList(charArrayList);
        System.out.print("String ArrayList: ");
        a.printArrayList(stringArrayList);
    }
}