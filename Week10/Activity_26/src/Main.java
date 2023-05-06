public class Main {
    public static void main(String[] args)
    {
        Sorting array = new Sorting();
        int[] unsortedArray = array.getArray();

        System.out.println("");
        System.out.println("Unsorted Array: ");
        for (int i = 0; i < unsortedArray.length; i++)
        {
            System.out.print(unsortedArray[i] + " ");
        }

        int[] sortedArray = array.sortArray(unsortedArray);
        System.out.println("");
        System.out.println("Sorted Array: ");
        for (int i = 0; i < sortedArray.length; i++)
        {
            System.out.print(sortedArray[i] + " ");
        }
    }
}