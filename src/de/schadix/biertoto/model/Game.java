package de.schadix.biertoto.model;

public class Game
{

    public Game(String nameHomeTeam, String nameGuestTeam, Result result2)
    {
        homeName = nameHomeTeam.trim().replace("\n", " ").replace("\n\r", " ").replaceAll("  ", "");
        guestName = nameGuestTeam.trim().replace("\n", " ").replace("\n\r", " ").replaceAll("  ", "");;
        result = result2;
    }

    public String getGuestName()
    {
        return guestName;
    }

    public void setGuestName(String guestName)
    {
        this.guestName = guestName;
    }

    public String getHomeName()
    {
        return homeName;
    }

    public void setHomeName(String homeName)
    {
        this.homeName = homeName;
    }

    public Result getResult()
    {
        return result;
    }

    public void setResult(Result result)
    {
        this.result = result;
    }

    public String toString()
    {
        return homeName + ";" + guestName + ";" + result.toString();
    }

    private String homeName;
    private String guestName;
    private Result result;
}
