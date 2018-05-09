package pkgfinal.v1;
import java.util.Scanner;

public class FinalV1 
{
    
     
    public static void menu()
    {
        System.out.printf("\nMain Menu");
        System.out.printf("\n1) View Calendar");
        System.out.printf("\n2) View Meeting");
        System.out.printf("\n3) Create a meeting");
        System.out.printf("\n4) Delete a meeting");
        System.out.printf("\n5) Clear week");
        System.out.printf("\n6) Exit");        
    }
    public static void main(String[] args) 
    {
        
       Meeting[]        meeting     = new Meeting[100000];
       MeetingWeek[]    meetingWeek = new MeetingWeek[50];
       int[]            meetingID   = new int[10000];
       Scanner          input       = new Scanner(System.in);
       int              userInput   = 0;
       int              totalMeet   = 0;
       
       do
       {
          
           menu();
           System.out.printf("\nEnter option:");
           userInput = input.nextInt();
        switch(userInput)
            {
            case 1:
                
            case 2:
                System.out.print("Enter Meeting ID: ");
                int n = input.nextInt();
                System.out.printf("\n");
                System.out.println(meeting[meetingID[n]]);
                break;
            case 3:
                System.out.print("Enter Meeting Subject:");
                String subject = input.nextLine();
                subject = input.nextLine();
                
                System.out.printf("Enter Week:");
                int week = input.nextInt();
                
                System.out.printf("Enter Day:");
                int day = input.nextInt();
                
                System.out.printf("Enter Start Time:");
                int start = input.nextInt();
                
                System.out.printf("Enter End Time:");
                int end = input.nextInt();
                
                System.out.print("Enter Priority Level (1:High,2:Normal,3:Low):");
                int priority = input.nextInt();
                
                String mID = priority + "" + week + "" + day;
                System.out.printf("Meeting ID: %s\n",mID);
                int trueID = Integer.parseInt(mID);
                meetingID[trueID] = totalMeet;
                
                meeting[totalMeet++] = new Meeting(subject, priority, week, day, start, end, trueID);
                break;
            case 4:
            case 5:
            case 6:
           }
       }while(userInput !=6);
    }    
}
