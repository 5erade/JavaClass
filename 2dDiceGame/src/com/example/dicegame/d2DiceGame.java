package com.example.dicegame;
import java.util.Scanner;
import java.util.Random;

public class d2DiceGame{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rolls = new Random();
        int [][] diceT = {{0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        System.out.println("Welcome to Gambling Addiction Online™");
        System.out.print("Enter how many dice to roll (max 6): ");
        diceT[0][0] = input.nextInt();
        while(diceT[0][0] > 6 || diceT[0][0] < 1){
            System.out.print("Error! Input a number between 1 and 6: ");
            diceT[0][0] = input.nextInt();
        }
        System.out.print("Enter how many sides for each dice (max 10): ");
        diceT[0][1] = input.nextInt();
        while(diceT[0][1] > 10 || diceT[0][1] < 1){
            System.out.print("Error! Input a number between 1 and 10: ");
            diceT[0][1] = input.nextInt();
        }
        System.out.print("How many times should we roll (max 10^7): ");
        diceT[0][2] = input.nextInt();
        while(diceT[0][2] > 10000000 || diceT[0][2] < 1){
            System.out.print("Error! Input a number between 1 and 10,000,000: ");
            diceT[0][2] = input.nextInt();
        }
        for(int c = 1; c <= diceT[0][0]; c++) {
            System.out.printf("Die %d\n", c);
            for (int i = 0; i < diceT[0][2]; i++) {
                diceT[0][3] = rolls.nextInt(diceT[0][1]);
                diceT[1][diceT[0][3]] += 1;
            }
            System.out.printf("%10s%15s\n", "Side", "Rolled");
            for (int i = 0; i < diceT[0][1]; i++) {
                System.out.printf("%10d%15d\n", i + 1, diceT[1][i]);
                }
                for (int j = 0; j < diceT[0][1]; j++) {
                    diceT[1][j] = 0;
                }
        }
    }
}

//a(0,0)  : Total Dice
//a(0,1)  : Total Sides
//a(0,2)  : Total Rolls
//a(0,4)  : Random Storage
//a(1,0-9): Roll Tallies