//**************************************************************
//                    Activity #17
//                    Name: Sung Hoo Hong
//                    Data Structures Date: 03/01/23
// ***************************************************************
//      This program simply creates an arraylist, let the user
//      add strings to the arraylist, remove strings from the
//      arraylist, get strings from the arraylist, and get size of
//      the arraylist
// *****************************************************************

package stringArraryList;

import java.util.ArrayList;

public class StringArrayList
{
    // Create an Array List
    private ArrayList<String> arrayList= new ArrayList<>();

    // Let the user add Strings to the arraylist
    public void addStrings (String s)
    {
        arrayList.add(s);
    }

    // Let the user remove Strings from the arraylist
    public void removeStrings (String s)
    {
        arrayList.remove(s);
    }

    // Let the user get String from the arraylist
    public String getString (int i)
    {
        return arrayList.get(i);
    }

    // Let the user get the size of the arraylist
    public int getSizeOfArrayList ()
    {
        return arrayList.size();
    }

    // Print the array list
    public void displayArrayList1()
    {
        System.out.printf("Strings: %n");
        for (Object string : arrayList)
        {
            System.out.printf("%s%n", string);
        }
    }

    // Different way to print the array list
    public void displayArrayList2()
    {
        System.out.printf("Strings: %n");
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.printf("%s%n", arrayList.get(i));
        }
    }
}