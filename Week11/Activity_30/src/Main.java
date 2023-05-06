public class Main
{
    public static void main(String[] args)
    {
        hashmap capitalMap = new hashmap();
        capitalMap.addKeyValuePair("South Korea", "Seoul");
        capitalMap.addKeyValuePair("France", "Paris");
        capitalMap.addKeyValuePair("Australia", "Canberra");

        capitalMap.displayKeyValuePairs();

        capitalMap.removeKeyValuePair("France");

        System.out.println();

        capitalMap.displayKeyValuePairs();
    }
}