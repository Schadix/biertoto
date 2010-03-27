package de.schadix.biertoto.model;

import java.util.*;

public class GameTipp
{

    private Game game;
    private List<Tipp> tippList;

    public GameTipp(Game game, List<Tipp> tippList)
    {
        this.tippList = new ArrayList<Tipp>();
        this.game = game;
        this.tippList = tippList;
    }

    public Game getGame()
    {
        return game;
    }

    public void setGame(Game game)
    {
        this.game = game;
    }

    public List<Tipp> getTippList()
    {
        return tippList;
    }

    public void setTippList(List<Tipp> tippList)
    {
        this.tippList = tippList;
    }

    public Tipp getTipForTippername(String tippername)
    {
        for(Iterator<Tipp> iter = getTippList().iterator(); iter.hasNext();)
        {
            Tipp tipp = iter.next();
            if(tipp.getTippername().equals(tippername))
                return tipp;
        }

        return null;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append(game.toString()).append(";");
        Tipp tipp;
        for(Iterator<Tipp> iter = tippList.iterator(); iter.hasNext(); sb.append(tipp.toString()).append(";"))
            tipp = iter.next();

        return sb.toString();
    }

}
