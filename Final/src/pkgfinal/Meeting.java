package pkgfinal;
import java.util.*;

public class Meeting {
    private String mSubject;
    private int mPriority;
    private int sDay;
    private int eDay;
    private int trueID;
    private int tStart;
    private int tEnd;


    //<editor-fold desc="constructors">
    public Meeting(String s, int p, int sd, int ed, int m, int ts, int te) {
        mSubject = s;
        mPriority = p;
        sDay = sd;
        eDay = ed;
        trueID = m;
        tStart = ts;
        tEnd = te;
    }

    public Meeting() {
        mSubject = "None";
        mPriority = 2;
        sDay = 0;
        eDay = 0;
        trueID = 0;
        tStart = 0000;
        tEnd = 1000;
    }

    //</editor-fold>
    //<editor-fold desc="set Methods">
    public void setSubject(String s) {
        mSubject = s;
    }

    public void setPriority(int p) {
        mPriority = p;
    }

    public void setDay(int d) {
        sDay = d;
    }
    public void setDayEnd(int d) {
        eDay = d;
    }
    public void setStart(int ts) {
        tStart = ts;
    }
    public void setEnd(int te) {
        tEnd = te;
    }
    //</editor-fold>
    //<editor-fold desc="get Methods">
    public String getSubject(String s) {
        return mSubject;
    }

    public int getPriority() {
        return mPriority;
    }

    public int getDay() {
        return sDay;
    }
    public int getStart() {
        return tStart;
    }
    public int getEnd() {
        return tEnd;
    }


    //</editor-fold>
    @Override
    public String toString() {
        if(sDay == eDay)
                return "Meeting ID: " + trueID + "\nSubject: " + mSubject + "\nPriority Level: " + mPriority + "\nDay: " + sDay + "\nStart: " + tStart + "\nEnd: " + tEnd;
        else 
              return "Meeting ID: " + trueID + "\nSubject: " + mSubject + "\nPriority Level: " + mPriority + "\nStart Day: " + sDay + "\nEnd Day: " + eDay + "\nStart: " + tStart + "\nEnd: " + tEnd;
    }
    
    //<editor-fold desc="Predicates">
    public boolean checkDay(int d, int c)
    {
        return d == c;
    }
    public boolean checkTime(int s, int s2, int st, int et)
    {
        return st <= s && et <= s2;
    }

    boolean overlap(int start1, int start2, int end1, int end2){
        return (start1 <= end2 && start2  <= end1);
    }
}
//</editor-fold>
