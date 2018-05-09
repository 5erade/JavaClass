
package pkgfinal.v1;

public class MeetingWeek 
{
    private int wNumber;
    private int wDay1;
    private int wDay2;
    private int wDay3;
    private int wDay4;
    private int wDay5;
    private int wDay6;
    private int wDay7;
    
    public MeetingWeek(int w, int d1, int d2, int d3, int d4, int d5, int d6, int d7)
        {
            wNumber = w;
            wDay1 = d1;
            wDay2 = d2;
            wDay3 = d3;
            wDay4 = d4;
            wDay5 = d5;
            wDay6 = d6;
            wDay7 = d7;
        }
     public MeetingWeek()
        {
            wNumber = 0;
            wDay1 = 0;
            wDay2 = 0;
            wDay3 = 0;
            wDay4 = 0;
            wDay5 = 0;
            wDay6 = 0;
            wDay7 = 0;
        }
}
