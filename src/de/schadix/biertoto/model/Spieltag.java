// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Spieltag.java

package de.schadix.biertoto.model;

import java.util.*;

// Referenced classes of package de.schadix.biertoto.model:
//            GameTipp

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
