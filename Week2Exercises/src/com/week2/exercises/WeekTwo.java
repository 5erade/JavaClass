//Brought to you by...
//         _      _
//        (_)    | |
//    __ _ _ _ __| |__   ___  __ _ _ __
//   / _` | | '__| '_ \ / _ \/ _` | '__|
//  | (_| | | |  | |_) |  __/ (_| | |
//   \__,_|_|_|  |_.__/ \___|\__,_|_|
//
//
package com.week2.exercises;
import java.util.Scanner;

public class WeekTwo
{
    public static void main(String[] args)
    {
        //Initial user prompt.
        System.out.println("Enter a negative number any time to end.");
        System.out.println("Enter a positive number:");

        //Declare Variables and set min/max to first userInput.
        Scanner input = new Scanner(System.in);
        int min = input.nextInt();
        int max = min;
        int userInput = 0;

        //While Loop ; Program Repeats until a negative entered.

        while (userInput >= 0)
        {
            //Prompt user and store value as userInput.
            System.out.println("Enter a positive number:");
            userInput = input.nextInt();

            //If userInput is NOT a negative and less than current value for min
            //replace min with that value.
            if      (userInput <= min && userInput >= 0)
            {
                min = userInput;
            }
            //If userInput is NOT a negative and greater than current value for max
            //replace max with that value.
            else if (userInput >= max && userInput >= 0)
            {
                max = userInput;
            }

        }

        //Displays largest & smallest stored value to user when loop ends.
        System.out.println("The largest number was: " + max);
        System.out.println("The smallest number was: " + min);
    }

}
