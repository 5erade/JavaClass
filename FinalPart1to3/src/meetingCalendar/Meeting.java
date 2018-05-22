package meetingCalendar;
import java.util.*;

public class Meeting {
    private String mSubject;
    private int mPriority;
    private int mDay;
    private int trueID;
    private int tStart;
    private int tEnd;


    //<editor-fold desc="constructors">
    public Meeting(String s, int p, int d, int m, int ts, int te) {
        mSubject = s;
        mPriority = p;
        mDay = d;
        trueID = m;
        tStart = ts;
        tEnd = te;
    }

    public Meeting() {
        mSubject = "None";
        mPriority = 2;
        mDay = 0;
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
        mDay = d;
    }


    //</editor-fold>
    //<editor-fold desc="get Methods">
    public String getSubject(String s) {
        return mSubject;
    }

    public int getPriority(int p) {
        return mPriority;
    }

    public int getDay() {
        return mDay;
    }


    //</editor-fold>
    @Override
    public String toString() {
        return "Meeting ID: " + trueID + "\nSubject: " + mSubject + "\nPriority Level: " + mPriority + "\nDay: " + mDay + "\nStart: " + tStart + "\nEnd: " + tEnd;
    }

    //<editor-fold desc="set Methods">
    public void setStart(int ts) {
        tStart = ts;
    }

    public void setEnd(int te) {
        tEnd = te;
    }

    //</editor-fold>
    //<editor-fold desc="get Methods">
    public int getStart() {
        return tStart;
    }

    public int getEnd() {
        return tEnd;
    }
    //</editor-fold

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

   /*   while(overlap)
              {
              for (Meeting meeting : meetings)
              {
              try
              {
              if (meeting.overlap(st, meeting.getStart(), et, meeting.getEnd()))
              {
              System.out.println("\nError! Start and End times overlap with another meeting!");
              System.out.print("Start: ");
              st = in.nextInt();
              System.out.print("End: ");
              et = in.nextInt();
              }
              }
              catch(Exception e)
              {
              System.out.println("No overlap.");
              continue;
              }
              finally
              {
              break;
              }
              }

              }*/