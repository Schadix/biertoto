package de.schadix.biertoto.model;


public class Result
{

    public Result()
    {
    }

    public Result(int home, int guest)
    {
        homeGoals = new Integer(home);
        guestGoals = new Integer(guest);
    }

    public Result(String result)
    {
        String n = parseAndCheck(result);
        try
        {
            if(n != null)
            {
                homeGoals = new Integer(onlyNumber(n.substring(0, n.indexOf(':'))));
                guestGoals = new Integer(onlyNumber(n.substring(n.indexOf(':') + 1, n.length())));
            }
        }
        catch(NumberFormatException nfe)
        {
            homeGoals = null;
            guestGoals = null;
        }
    }

    private static String parseAndCheck(String result)
    {
        String normString = result.trim();
        normString = normString.replaceAll(" ", "");
        if(normString.indexOf(':') == -1)
            normString = null;
        return normString;
    }

    public Integer getGuestGoals()
    {
        return guestGoals;
    }

    public void setGuestGoals(Integer guestGoals)
    {
        this.guestGoals = guestGoals;
    }

    public Integer getHomeGoals()
    {
        return homeGoals;
    }

    public void setHomeGoals(Integer homeGoals)
    {
        this.homeGoals = homeGoals;
    }

    private String onlyNumber(String string)
    {
        String number = string.replaceAll("[^0-9]", "");
        return number;
    }

    public String toString()
    {
        return (homeGoals != null ? homeGoals.toString() : "") + ";" + (guestGoals != null ? guestGoals.toString() : "");
    }

    private Integer homeGoals;
    private Integer guestGoals;
}
