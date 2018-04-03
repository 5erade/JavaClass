package com.example.week7;
import java.util.Scanner;
import java.util.Random;

public class DiceGame
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rolls = new Random();
        int dCount, dSide, dRolls, dRandom;
        int d1 = 0 , d2 = 0, d3= 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, d8 = 0, d9 = 0, d10 = 0;

        System.out.println("Welcome to Gambling Addiction Online™");
        System.out.print("Enter how many dice to roll (max 6): ");
        dCount = input.nextInt();
        while(dCount > 6 || dCount < 1)
        {
            System.out.println("Please enter a number between 1 and 6");
            dCount = input.nextInt();
        }
        System.out.print("Enter how many sides for each dice (max 10): ");
        dSide = input.nextInt();
        while(true)
        {
            if(dSide > 10 || dSide < 1)
            {
                System.out.println("Please enter a number between 1 and 10");
                dSide = input.nextInt();
            }
            else
                break;
        }
        System.out.print("How many times should we roll (max 10^7): ");
        dRolls = input.nextInt();
        while(true)
        {
            if (dRolls > 10000000 || dRolls < 1)
            {
                System.out.println("Please enter a number between 1 and 10,000,000");
                dRolls = input.nextInt();
            }
            else
                break;
        }
        //Rolls x amount of die based on dCount
        //j counts up to dCount
        for (int j = 1; j <= dCount; j++)
        {
            //Rolls dice x number of times based on dRolls
            //Switch statement tallies up dRandom function
            //i counts up to dRolls
            for (int i = 0; i < dRolls; i++)
            {
                dRandom = rolls.nextInt(dSide) + 1;
                switch (dRandom)
                {
                    case (1): d1++; break;
                    case (2): d2++; break;
                    case (3): d3++; break;
                    case (4): d4++; break;
                    case (5): d5++; break;
                    case (6): d6++; break;
                    case (7): d7++; break;
                    case (8): d8++; break;
                    case (9): d9++; break;
                    case (10): d10++; break;
                }
            }


            //Outputs Die # based on j counter going up to 6
            //If die tally is les than 0, will not print
            System.out.printf("Die %d\n", j);
            if (d1 > 0)
                System.out.printf(" 1:  %d \n", d1);
            if (d2 > 0)
                System.out.printf(" 2:  %d \n", d2);
            if (d3 > 0)
                System.out.printf(" 3:  %d \n", d3);
            if (d4 > 0)
                System.out.printf(" 4:  %d \n", d4);
            if (d5 > 0)
                System.out.printf(" 5:  %d \n", d5);
            if (d6 > 0)
                System.out.printf(" 6:  %d \n", d6);
            if (d7 > 0)
                System.out.printf(" 7:  %d \n", d7);
            if (d8 > 0)
                System.out.printf(" 8:  %d \n", d8);
            if (d9 > 0)
                System.out.printf(" 9:  %d \n", d9);
            if (d10 > 0)
                System.out.printf(" 10: %d \n", d10);

            //Reset dice tallies to 0
            d1 = 0; d2 = 0; d3 = 0; d4 = 0; d5 = 0; d6 = 0; d7 = 0; d8 = 0; d9 = 0; d10 = 0;
        }
    }
}
// Exercise 5:
//
// Write a program that asks the user for the
// following:
//
// 1) How many dice to roll (up to 6 dice)
// 2) How many sides per die (all dice can
//    be the same number of sides, maximum 10)
// 3) How many times to repeat rolling the dice
//    (maximum 10,000,000)
//
// After all information is received, simulate
// rolling the dice the specified number of times
// and show the tallied results
//
// When you show your results, show only
// the possible range of values based on
// the user's input
//
// Example: given 2 6-sided to roll, show
// tallies for the range of 2-12
