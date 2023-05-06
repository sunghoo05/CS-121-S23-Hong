import java.util.Scanner;

public class CharacterCount
{
    private char[] characterCount;
    private int arrayLength;
    private int count = 0;

    public CharacterCount(int i)
    {
        characterCount = new char[i];
    }

    public void filloutArray()
    {
        for (int i = 0; i < characterCount.length; i++)
        {
            int j = i + 1;
            Scanner input = new Scanner(System.in);
            System.out.println("Fill out your " + j + "th place");
            String s = input.nextLine();
            char c = s.charAt(0);
            characterCount[i] = c;
        }
    }

    public void printArray()
    {
        System.out.print("[");
        for (int i = 0; i < characterCount.length; i++)
        {
            System.out.print(characterCount[i] + ", ");
        }
        System.out.print("]");
    }

    public int count(char c)
    {
        for (int i = 0; i < characterCount.length; i++)
        {
            if (Character.compare(c, characterCount[i]) == 0)
            {
                count++;
            }
        }
        return count;
    }
}