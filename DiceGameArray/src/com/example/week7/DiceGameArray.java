package com.example.week7;
import java.util.Scanner;
import java.util.Random;

public class DiceGameArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random roll = new Random();
        int dSides, dCount, dRolls, dRandom;
        System.out.println("Welcome to Gambling Addiction Online™");
        System.out.print("Enter how many dice to roll (max 6): ");
        dCount = input.nextInt();
        while(true) {
            if(dCount > 6 || dCount < 1)
            {
                System.out.print("Please enter a number between 1 and 6: ");
                dCount = input.nextInt();
            }
            else
                break;
        }
        System.out.print("Enter how many sides for each dice (max 10): ");
        dSides = input.nextInt();
        while(true) {
            if(dSides > 10 || dSides < 1)
            {
                System.out.print("Please enter a number between 1 and 10: ");
                dSides = input.nextInt();
            }
            else
                break;
        }
        int[] aSides = new int[dSides];

        System.out.print("How many times should we roll (max 10^7): ");
        dRolls = input.nextInt();
        while(true) {
            if (dRolls > 10000000 || dRolls < 1)
            {
                System.out.print("Please enter a number between 1 and 10,000,000: ");
                dRolls = input.nextInt();
            }
            else
                break;
        }
        for(int dC = 1; dC <= dCount; dC++) {
            System.out.printf("Die %d\n", dC);
            for (int i = 0; i < dRolls; i++)
            {
                dRandom = roll.nextInt(dSides);
                aSides[dRandom] += 1;
            }
            System.out.printf("%10s%15s\n", "Side", "Rolled");
            for (int i = 0; i < aSides.length; i++) {
                System.out.printf("%10d%15d\n", i + 1, aSides[i]);
            }
            for (int i = 0; i < dSides; i++) {
                aSides[i] = 0;
            }
        }
    }
}
