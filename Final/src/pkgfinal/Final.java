package pkgfinal;
import java.util.*;
public class Final
{
    public static int inputMenu(int a)
    {
        Scanner in = new Scanner(System.in);
         while(true)
            {
                try 
                    {
                    a = in.nextInt();
                    while (a < -1 || a > 6 || a == 0)
                    {
                        System.out.print("Input Error! Try again: ");
                        a = in.nextInt();
                    }
                    
                     break;
                    } 
                    catch (InputMismatchException e) 
                    {
                        System.out.print("Input Error! Try again: ");
                         in.nextLine();
                    } 
                    catch (Exception e) 
                    {
                    throw e;
                    }
            }
         return a;
    }
    
    public static int input(int a)
    {
        Scanner in = new Scanner(System.in);
         while(true)
            {
                try 
                    {
                    a = in.nextInt();
                    
                     return a;
                    } 
                    catch (InputMismatchException e) 
                    {
                        System.out.print("Input Error! Try again: ");
                         in.nextLine();
                    } 
                    catch (Exception e) 
                    {
                    throw e;
                    }
            }
    }
    
    private static void menu()
    {
        System.out.print("\n  Main Menu");
        System.out.print("\n1) Create a new meeting");
        System.out.print("\n2) Show meetings for the week");
        System.out.print("\n3) Clear meetings for the week");
        System.out.print("\n4) View a meeting");
        System.out.print("\n5) Delete a meeting");
        System.out.print("\n6) Update a meeting.");
        System.out.print("\n7) To exit, enter -1.");
    }
    public static void main(String[] args)
    {
        Meeting[] meetings = new Meeting[1000];
        Time[] times = new Time[1000];
        Scanner in = new Scanner(System.in);
        int input = 0;
        int meetingCount = 1;
        int opt = 0;

        do {
            //<editor-fold desc="Main Menu">
            menu();
            System.out.print("\nEnter Option: ");
         
            input = inputMenu(input);

            //</editor-fold>

            switch(input){
                //<editor-fold desc="Opt 1 COMPLETE">
                case 1:
                    System.out.print("Enter Subject: ");
                    String s = in.nextLine();
                    System.out.print("Priority Level (1:High, 2:Normal, 3:Low): ");
                    int p = 0;
                    p = input(p);
                    int sd = 0;
                    int ed = 0;
                    int st = 0;
                    int et = 0;          
                        while(true)
                        {
                            System.out.print("Will this meeting span multiple days? (1: Yes, 2:No): ");
                            opt = input(opt);
                            if(opt ==1)
                            {
                                System.out.print("Enter Start Day: ");
                                sd = input(sd);
                                while(sd < 1 || sd > 7)
                                {
                                    System.out.print("Must be between 1 and 7, Enter Start Day: ");
                                    sd = input(sd);
                                }
                                System.out.print("Enter End Day: ");
                                ed = input(ed);
                                  while(ed < 1 || ed > 7 || ed < sd)
                                {
                                    if(ed < sd)
                                    {
                                        System.out.print("Must be after Start Day, Enter End Day: ");
                                        ed = input(ed);
                                    }
                                    else{
                                        System.out.print("Must be between 1 and 7, Enter End Day: ");
                                        ed = input(ed);
                                    }
                                }
                            }   
                             else
                            {
                             System.out.print("Enter Start Day: ");
                               sd = input(sd);
                               ed = sd;
                            }
                            System.out.print("Enter Start Time: ");
                            st = input(st);
                            while(st > 2359 || st < 0)
                            {
                                System.out.print("Enter Start between 0000 & 2359");
                                st = input(st);
                            }
                            int smt = (sd - 1) * 2400 + st;
                            System.out.print("Enter End Time: ");
                            et = input(et);
                             while(et > 2359 || et < 0)
                            {
                                System.out.print("Enter End between 0000 & 2359");
                                et = input(et);
                            }
                            int emt = (ed - 1) * 2400 + et;
                            boolean b = false;
                            for(Time time : times)
                            {
                                try{
                                    b = time.overlap(smt, emt, time.getStartTime(), time.getEndTime());
                                    if(b == true){
                                        System.out.println("Error! Time Overlap, reselect day(s) and times again.\n");
                                        break;
                                    }
                                    else
                                        b = false;
                                    
                                }
                                  catch(Exception e){
                                }
                            }
                            if(b == false)
                                break;
                                      
                        }
                    
                   
                    System.out.printf("Meeting ID: %d\n", meetingCount);
                    int id = meetingCount;
                    times[meetingCount] = new Time(sd, ed, st, et);
                    meetings[meetingCount++] = new Meeting(s, p, sd, ed, id, st, et);
                    break;
                //</editor-fold>
                //<editor-fold desc="Opt 2 INCOMPLETE">
                case 2:
                    for(int a = 1; a <= 7; a++)
                    {
                        
                        for (Meeting meeting : meetings) {
                            try {
                                int b = meeting.getDay();
                                if (meeting.checkDay(a, b))
                                    System.out.println("\n" + meeting);
                            } catch (Exception e) {
                            }
                        }
                    }
                    boolean empty = true;
                    for(Meeting meeting : meetings)
                    {
                        if(meeting != null){
                            empty = false;
                            break;
                        }
                    }
                    if(empty == true)
                        System.out.println("\nNo meetings scheduled.");
                    break;
                //</editor-fold>
                //<editor-fold desc="Opt 3">
                case 3:
                    System.out.print("Are you sure you want to clear all meetings? (1:Yes, 2:No): ");
                    opt = input(opt);
                    while(opt != 1 || opt != 2)
                    {
                        System.out.println("Enter 1 or 2!");
                        opt = input(opt);
                    }
                    if(opt == 2)
                        break;
                    for(int i = 0; i < meetings.length; i++)
                    {
                        meetings[i]= null;                   
                    }
                    
                    break;
                //</editor-fold>
                //<editor-fold desc="Opt 4 COMPLETE">
                case 4:
                    System.out.print("Enter Meeting ID: ");
                    opt = input(opt);
                    if (meetings[opt]!=null) {
                        System.out.print("\n");
                        System.out.print(meetings[opt]);
                    }
                    else
                        System.out.println("\nMeeting Does Not Exist.");
                    break;
                    //</editor-fold>
                //<editor-fold desc="Opt 5 COMPLETE">
                case 5:
                    System.out.print("Enter Meeting ID to Delete: ");
                    opt = input(opt);
                    if (meetings[opt]!=null) {
                        int m = 0;
                        System.out.print("Are you sure? (Yes = 1 , No =2): ");
                        m = input(m);

                        if(m == 1){
                            meetings[opt] = null;
                            times[opt] = null;
                            System.out.println("\nMeeting Deleted.");
                        }
                        else {
                            break;
                        }
                    }
                    else
                        System.out.println("\nNo Meeting Exists with ID.");
                    break;
                //</editor-fold>
                //<editor-fold desc="Opt 6 COMPLETE">
                case 6:
                    while(true)
                    {
                        System.out.print("Enter Meeting ID to Update: ");
                        int mid = in.nextInt();
                        if(meetings[mid] == null)
                        {
                            System.out.print("Meeting Not Found. Returning to Main Menu.\n ");
                            break;
                        }
                        System.out.println("1) Update days and times: ");
                        System.out.println("2) Update subject: ");
                        System.out.println("3) Update priority: ");
                        System.out.print("Option: ");

                        input = in.nextInt();
                        switch(input)
                        {
                            case 1:
                                 while(true)
                            {   
                            System.out.print("Will this meeting span multiple days? (1:Yes, 2:No): ");
                            opt = in.nextInt();
                            if(opt ==1)
                            {
                            System.out.print("Enter start Day: ");
                            sd=0;
                            sd = input(sd);
                            System.out.print("Enter end Day: ");
                            ed=0;
                            ed = input(ed);
                            }   
                             else
                            {
                             System.out.print("Day: ");
                               sd = in.nextInt();
                               ed = sd;
                            }
                            System.out.print("Start: ");
                            st=0;
                            st = input(st);
                            while(st > 2359 || st < 0)
                            {
                                System.out.print("Enter Start between 0000 & 2359: ");
                                st = in.nextInt();
                            }
                            int smt = (sd - 1) * 2400 + st;
                            System.out.print("End: ");
                            et=0;
                            et = input(et);
                             while(et > 2359 || et < 0)
                            {
                                System.out.print("Enter End between 0000 & 2359: ");
                                et = in.nextInt();
                            }
                            int emt = (ed - 1) * 2400 + et;
                                times[mid].setStartDay(0);
                                times[mid].setEndDay(0);
                                times[mid].setStartTime(0);
                                times[mid].setEndTime(0);
                            boolean b = false;
                            for(Time time : times)
                            {
                                try{
                                    b = time.overlap(smt, emt, time.getStartTime(), time.getEndTime());
                                    if(b == true){
                                        System.out.println("Error! Time Overlap, reselect day(s) and times again.");
                                        break;
                                    }
                                    else
                                        b = false;
                                    
                                }
                                  catch(Exception e){
                                }
                            }
                                if(b == false){
                                    meetings[mid].setDay(sd);
                                    meetings[mid].setDayEnd(ed);
                                    meetings[mid].setStart(st);
                                    meetings[mid].setEnd(et);
                                    times[mid].setStartDay(sd);
                                    times[mid].setEndDay(ed);
                                    times[mid].setStartTime(smt);
                                    times[mid].setEndTime(emt);
                                    break;
                                }
                                     
                            }
                            break;
                            case 2:
                                System.out.print("Enter new Subject: ");
                                String update = in.nextLine();
                                update = in.nextLine();
                                meetings[mid].setSubject(update);
                                break;
                            
                            case 3:
                                System.out.print("Enter new Priority (1:High, 2: Normal, 3: Low): ");
                                input = in.nextInt();
                                meetings[mid].setPriority(input);
                                break;
                                
                        }
                        break;
                    }
                    //</editor-fold>
            }

        }while(input != -1);

    }
}
