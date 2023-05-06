package stringArraryList;

public class Main
{
    public static void main(String[] args)
    {
        // Create the instance to create a String Array List
        StringArrayList demo = new StringArrayList();

        // Add strings to the array list
        demo.addStrings("Sung Hoo Hong");
        demo.addStrings("Indiana Academy For Science, Math, and Humanities");

        // Print the created array list using the first way to print the array list
        System.out.printf("Array List contains %s elements. %n", demo.getSizeOfArrayList());
        demo.displayArrayList1();

        // Remove a string from the array list
        System.out.printf("%nRemove first element: %s%n", demo.getString(0));
        demo.removeStrings(demo.getString(0));

        // Print the changed array list using the second way to print the array list
        System.out.printf("%nArray List contains %s elements.%n", demo.getSizeOfArrayList());
        demo.displayArrayList2();
    }
}