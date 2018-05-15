package meetingCalendar;

public class Time
{
    private  int    tStart;
    private  int    tEnd;
    //<editor-fold desc="constructors">
    public Time(int ts, int te)
    {
        tStart    = ts;
        tEnd      = te;
    }
    public Time()
    {
        tStart    = 1;
        tEnd      = 2;
    }
    //</editor-fold>
    //<editor-fold desc="set Methods">
    public void setStart(int ts)
    {
        tStart = ts;
    }

    public void setEnd(int te)
    {
        tEnd = te;
    }
    //</editor-fold>
    //<editor-fold desc="get Methods">
    public int getStart(int ts)
    {
        return tStart;
    }

    public int getEnd(int te)
    {
        return tEnd;
    }
    //</editor-fold>
    @Override
    public String toString()
    {
        return "\nStart: " + tStart + "\nEnd: " + tEnd;
    }

}