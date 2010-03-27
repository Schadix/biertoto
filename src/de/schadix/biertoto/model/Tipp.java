package de.schadix.biertoto.model;

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
