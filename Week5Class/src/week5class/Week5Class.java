

package week5class;
import java.util.Scanner;

public class Week5Class 
{   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        for(int c = 1; c <=3; c++)
        {
            int userGrade;
            System.out.println("Enter a test score between [1,10]: ");
            int userInput = input.nextInt();
            
            while(true)
            {
                if (userInput <= 10 && userInput >= 1)
                {
                    break;
                }
                else
                {
                System.out.println("Please enter a number between 1 and 10: ");
                userInput = input.nextInt();
                }
            }
            
            switch (userInput)
            {
                case 10:
                case 9:
                    System.out.println("You grade was an A. Score # " + c);
                    break;
                case 8:
                    System.out.println("You grade was an B. Score # " + c);
                    break;
                case 7:
                    System.out.println("You grade was an C. Score # " + c);
                    break;
                case 6:
                    System.out.println("You grade was an D. Score # " + c);
                    break;
                default:
                    System.out.println("You grade was an F. Score # " + c);
            }
            
            /**if      (userInput == 9 || userInput ==10)
             {
                 System.out.println("Your grade was an A.");
             }
             else if (userInput == 8)
             {
                 System.out.println("Your grade was an B.");
             }
              else if (userInput == 7)
             {
                 System.out.println("Your grade was an C.");
             }
              else if (userInput == 6)
             {
                 System.out.println("Your grade was an D.");
             }
              else
             {
                 System.out.println("Your grade was an F.");
             }
             */
        }
        
        System.out.print("What number should the list stop at: ");
        int stopNum = input.nextInt();
        
        for (int c = 1; c <= 10 && c <= stopNum;c++)
        {
            System.out.println(c);
        }
        
        System.out.print("What number should the list skip: ");
        stopNum = input.nextInt();
        
        for (int c = 1; c <= 10; c++)
        {
            if (c == stopNum)
                continue;
            System.out.println(c);
        }
    }
    
}
