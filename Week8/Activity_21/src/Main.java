public class Main {
    public static void main(String[] args)
    {
        Player student1 = new Player("Sung Hoo Hong", 16, "Male");
        Player student2 = new Player("Josh", 17, "Male");

        System.out.println(student1.getPlayerName() + "'s Round Number: " + student1.getRoundNumber());
        System.out.println(student2.getPlayerName() + "'s Round Number: " + student2.getRoundNumber());
        System.out.println("Round Number: " + Player.getRoundNumber());
    }
}