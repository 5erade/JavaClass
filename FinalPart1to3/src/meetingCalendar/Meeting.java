package meetingCalendar;
import java.util.*;

public class Meeting
{
    private  String mSubject;
    private  int    mPriority;
    private  int    mDay;
    private  int    mWeek;
    private  int    trueID;

    //<editor-fold desc="constructors">
    public Meeting(String s, int p, int d, int w, int m)
    {
        mSubject  = s;
        mPriority = p;
        mDay      = d;
        mWeek     = w;
        trueID    = m;
    }
    public Meeting()
    {
        mSubject  = "None";
        mPriority = 2;
        mDay      = 0;
        mWeek     = 0;
        trueID    = 0;
    }
    //</editor-fold>
    //<editor-fold desc="set Methods">
    public void setSubject(String s)
    {
        mSubject = s;
    }

    public void setPriority(int p)
    {
        mPriority = p;
    }

    public void setDay (int d)
    {
        mDay = d;
    }

    public void setWeek(int w)
    {
        mWeek = w;
    }

    //</editor-fold>
    //<editor-fold desc="get Methods">
    public String getSubject(String s)
    {
        return mSubject;
    }

    public int getPriority(int p)
    {
        return mPriority;
    }

    public int getDay(int d)
    {
        return mDay;
    }

    public int getWeek(int w)
    {
        return mWeek;
    }

    //</editor-fold>
    @Override
    public String toString()
    {
        return "Meeting ID: " + trueID + "\nSubject: " + mSubject + "\nPriority Level: " + mPriority + "\nWeek: " + mWeek + "\nDay: " + mDay;
    }

}