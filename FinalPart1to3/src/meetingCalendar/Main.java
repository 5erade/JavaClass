package meetingCalendar;
import java.util.*;
public class Main
{
    private static void menu()
    {
        System.out.print("\n  Main Menu");
        System.out.print("\n1) Create a new meeting");
        System.out.print("\n2) Show meetings for the week");
        System.out.print("\n3) Clear meetings for the week");
        System.out.print("\n4) View a meeting");
        System.out.print("\n5) Delete a meeting");
        System.out.print("\n6) Exit");
    }
    public static void main(String[] args)
    {
        Meeting[] meetings = new Meeting[10];
        Scanner in = new Scanner(System.in);
        int input;
        int meetingCount = 1;
        int opt = 0;

        do {
            //<editor-fold desc="Main Menu">
            menu();
            System.out.print("\nEnter Option: ");
            do{
                try {
                    input = in.nextInt();
                    while (input < 1 || input > 6){
                        System.out.print("Input must be a number between 1 and 6: ");
                        input = in.nextInt();
                    }
                     break;
                } catch (InputMismatchException e) {
                    System.out.println("Input Error!");
                    System.out.print("Option: ");
                    in.nextLine();

                } catch (Exception e) {
                    throw e;
                }
            }while(true);
            //</editor-fold>

            switch(input){
                //<editor-fold desc="Opt 1 COMPLETE">
                case 1:
                    in.nextLine();
                    System.out.print("Enter Subject: ");
                    String s = in.nextLine();
                    System.out.print("Priority Level: ");
                    int p = in.nextInt();
                    System.out.print("Day: ");
                    int d = in.nextInt();
                    System.out.print("Start: ");
                    int st = in.nextInt();
                    System.out.print("End: ");
                    int et = in.nextInt();
                    System.out.printf("Meeting ID: %d\n", meetingCount);
                    int id = meetingCount;
                    meetings[meetingCount++] = new Meeting(s, p, d, id, st, et);
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
                    break;
                //</editor-fold>
                case 3:
                //<editor-fold> desc="Opt 4 COMPLETE"
                case 4:
                    System.out.print("Enter Meeting ID: ");
                    opt = in.nextInt();
                    if (meetings[opt]!=null) {
                        System.out.print("\n");
                        System.out.print(meetings[opt]);
                    }
                    else
                        System.out.println("\nMeeting Does Not Exist.");
                    break;
                    //</editor-fold>
                //<editor-fold> desc="Opt 5 COMPLETE"
                case 5:
                    System.out.print("Enter Meeting ID to Delete: ");
                    opt = in.nextInt();
                    if (meetings[opt]!=null) {
                        int m;
                        System.out.print("Are you sure? (Yes = 1 , No =2): ");
                        m = in.nextInt();

                        if(m == 1){
                            meetings[opt] = null;
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
            }

        }while(input != 6);

    }
}

