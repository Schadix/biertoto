package de.schadix.biertoto.model;

import java.util.*;

public class Spieltag
{

    public Spieltag()
    {
        games = new ArrayList<GameTipp>();
    }

    public List<GameTipp> getGames()
    {
        return games;
    }

    public void setGames(List<GameTipp> games)
    {
        this.games = games;
    }

    public void addGame(GameTipp gameTipp)
    {
        games.add(gameTipp);
    }

    public List<String> getPrintOrder()
    {
        return printOrder;
    }

    public void setPrintOrder(List<String> printOrder)
    {
        this.printOrder = printOrder;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        for (GameTipp gametipp : games){
        	sb.append(gametipp.getGame()).append(";");	
            for (String playername : printOrder) {
                sb.append(gametipp.getTipForTippername(playername)).append(";");
    		}
            sb.append("\n");
        }        
        return sb.toString();
    }

    private List<GameTipp> games;
    private List<String> printOrder;
}
