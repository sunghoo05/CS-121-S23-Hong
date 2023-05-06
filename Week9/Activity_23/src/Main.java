public class Main {
    public static void main(String[] args)
    {
        CharacterCount c = new CharacterCount(10);
        c.filloutArray();
        c.printArray();
        System.out.println("");
        System.out.println(c.count('c'));
    }
}

// I believe that the time complexity of my program will be "n" because my program just go through the array once