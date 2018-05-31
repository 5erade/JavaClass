/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author amrod
 */
public class Time 
{
    private int startDay;
    private int endDay;
    private int startTime;
    private int endTime;

    
    public Time(int sd,int ed,int st,int et)
    {
        startDay = sd;
        endDay = ed;
        startTime = (startDay - 1) * 2400 + st;
        endTime = (endDay - 1) * 2400 + et;
    }  
    //Predicate
    public boolean overlap(int stA, int etA, int stB, int etB)
    {
        if(stA <= etB && etA >= stB)
            return true;
        else
            return false;
    }
    
    
//<editor-fold desc="Gets">
        public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }
        
        public int getStartDay() {
        return startDay;
    }

    public int getEndDay() {
        return endDay;
    }
    //</editor-fold>
//<editor-fold desc="Sets">
    public void setStartDay(int a) {
        startDay = a;
    }
    public void setEndDay(int b) {
        endDay = b;
    }
    public void setEndTime(int c) {
        endTime = c;
    }
    public void setStartTime(int d) {
        startTime = d;
    }
//</editor-fold>
    
  
}
