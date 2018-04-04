package dicegamecorrection;
import java.util.Scanner;
import java.util.Random;

public class DiceGameCorrection 
{ 
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Random rolls = new Random();
        int [] inputArray = new int[4];
        System.out.println("Welcome to Gambling Addiction Online™");
        System.out.print("Enter how many dice to roll (max 6): ");
        inputArray[0] = input.nextInt();
        while(inputArray[0] > 6 || inputArray[0] < 1){
            System.out.print("Error! Input a number between 1 and 6: ");
            inputArray[0] = input.nextInt();
        }
        System.out.print("Enter how many sides for each dice (max 10): ");
        inputArray[1] = input.nextInt();
        while(inputArray[1] > 10 || inputArray[1] < 1){
            System.out.print("Error! Input a number between 1 and 10: ");
            inputArray[1] = input.nextInt();
        }
        System.out.print("How many times should we roll (max 10,000,000): ");
        inputArray[2] = input.nextInt();
        while(inputArray[2] > 10000000 || inputArray[2] < 1){
            System.out.print("Error! Input a number between 1 and 10,000,000: ");
            inputArray[2] = input.nextInt();
        }
        int [] rollTallies = new int[inputArray[0]*inputArray[1]];
        
        for (int i = 0; i < inputArray[2]; i++)
        {
            inputArray[3] = rolls.nextInt(inputArray[0]*inputArray[1]);
            rollTallies[inputArray[3]] += 1;
        }
        System.out.printf("%10s%15s\n", "Dice Total", "Rolled");
        for (int i = inputArray[0] - 1; i < rollTallies.length; i++) {
            System.out.printf("%10d%15d\n", i + 1, rollTallies[i]);
        }
       
    } 
}
