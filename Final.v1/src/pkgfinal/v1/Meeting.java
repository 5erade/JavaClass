package pkgfinal.v1;

public class Meeting 
{
    private  String mSubject;
    private  int    mPriority;
    private  int    mDay;  
    private  int    mWeek;     
    private  int    tStart;
    private  int    tEnd;
    private  int    trueID;
    
    public Meeting(String s, int p, int d, int w, int ts, int te, int m)
    {
        mSubject  = s;
        mPriority = p;
        mDay      = d;  
        mWeek     = w;
        tStart    = ts;
        tEnd      = te;
        trueID    = m;
    }
    public Meeting()
    {
        mSubject  = "None";
        mPriority = 2;
        mDay      = 0;  
        mWeek     = 0; 
        tStart    = 1200;
        tEnd      = 1300;
        trueID    = 0000;
    }
    
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
    
    public void setStart(int ts)
    {
        tStart = ts;
    }
    
    public void setEnd(int te)
    {
        tEnd = te;
    }
    
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
    
    public int getStart(int ts)
    {
        return tStart;
    }
    
    public int getEnd(int te)
    {
          return tEnd;
    }
    
   public String toString() 
    {
         return "Meeting ID: " + trueID + "\nSubject: " + mSubject + "\nPriority Level: " + mPriority + "\nWeek: " + mWeek + "\nDay: " + mDay + "\nStart: " + tStart + "\nEnd: " + tEnd;
    }
}
