//Exercise 3: Write a program that calculates
// the triangle number of a given number by the user
// and calculates it 3 times. Each time you must
// use a different loop

// The triangle number of any given number is
// the sum of all numbers from 1 to that number
// Ex. Triangle of 4 = 1 + 2 + 3 + 4 = 10
//
// The user number range is from 1 to 100 inclusive
package com.example.week3;
import java.util.Scanner;

public class Week3Exercises
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number to find it's triangle number");
        int userInput = input.nextInt();

        //while loop
        int userResult = 0;
        int counter = 1;
        while   (counter <= userInput)
        {
            userResult = userResult + counter++;
        }
        System.out.println("while Loop");
        System.out.println("The triangle number of " + userInput + " is " + userResult);
        System.out.println("");

        //do while loop
        userResult = 0;
        counter = 1;
        do {
            userResult = userResult + counter++;
        }
        while (counter <= userInput);
        System.out.println("do while Loop");
        System.out.println("The triangle number of " + userInput + " is " + userResult);
        System.out.println("");

        //for loop
        userResult = 0;
        for (int c = 1; c<= userInput; c++)
        {
            userResult = userResult + c;
        }
        System.out.println("for Loop");
        System.out.println("The triangle number of " + userInput + " is " + userResult);
        System.out.println("");


    }
}
