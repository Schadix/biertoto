// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Tipp.java

package de.schadix.biertoto.model;


// Referenced classes of package de.schadix.biertoto.model:
//            Result

public class Tipp
{

    public Tipp(String tippername, Result r)
    {
        result = r;
        this.tippername = tippername;
    }

    public Result getResult()
    {
        return result;
    }

    public void setResult(Result result)
    {
        this.result = result;
    }

    public String getTippername()
    {
        return tippername;
    }

    public void setTippername(String tippername)
    {
        this.tippername = tippername;
    }

    public String toString()
    {
        return result.toString();
    }

    private Result result;
    private String tippername;
}
