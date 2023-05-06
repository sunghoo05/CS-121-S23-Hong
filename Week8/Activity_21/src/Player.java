public class Player
{
    private String playerName;
    private int playerAge;
    private String playerSex;
    private static int roundNumber;

    public Player (String playerName, int playerAge, String playerSex)
    {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerSex = playerSex;
        roundNumber++;
    }

    public static int getRoundNumber()
    {
        return roundNumber;
    }

    public String getPlayerName()
    {
        return playerName;
    }
}