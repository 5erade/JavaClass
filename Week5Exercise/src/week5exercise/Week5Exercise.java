 // Exercise 4: Calculating Sales exercise
    // in the book (5.17 in 9th edition)
    //
    // An online retailer sells item5 products
    // whose retail prices are as follows:
    //
    // Product 1, $2.98
    // Product 2, $4.50
    // Product 3, $9.98
    // Product 4, $4.49
    // Product 5, $6.87
    //
    // Write a program that reads a series of pairs of numbers
    // as follows:
    //
    // Product number
    // Quantity sold
    //
    // Your program should use a switch statement
    // to determine the retail price for each
    // product. It should calculate and display
    // the total retail value of all products sold.
    // Use a loop to determine when the program
    // should stop looping and display the
    // final results
package week5exercise;
import java.util.Scanner;
public class Week5Exercise 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int productNum = 0, productQuant = 0;
        int item1 = 0, item2 = 0, item3 = 0, item4 = 0, item5 = 0;
        double totalSale = 0;
        System.out.println((char)27 + "[31;47m" + "Welcome to Generic Online Retailer!");
        System.out.println("Please choose from our options below. ");
        System.out.println("To end your transaction, enter a negative value anytime\n");

        while(productNum >= 0 && productQuant >= 0)
        {
            System.out.println("1) A used tissue:        $2.98");
            System.out.println("2) Jar of pee:           $4.50");
            System.out.println("3) Broken Glass:         $9.98");
            System.out.println("4) Glazed Ham:           $4.49");
            System.out.println("5) Dead Rat:             $6.87");
            System.out.print("Item Number: ");
            productNum      = input.nextInt();
            if (productNum < 0)
                continue;
            System.out.print("Item Quantity: ");
            productQuant    = input.nextInt();
            if (productQuant < 0)
                continue;
            switch(productNum)
            {
                case(1):
                    totalSale = totalSale + (productQuant * 2.98);
                    item1 = item1 + productQuant;
                    break;
                case(2):
                    totalSale = totalSale + (productQuant * 4.50);
                    item2 = item2 + productQuant;
                    break;
                case(3):
                    totalSale = totalSale + (productQuant * 9.98);
                    item3 = item3 + productQuant;
                    break;
                case(4):
                    totalSale = totalSale + (productQuant * 4.49);
                    item4 = item4 + productQuant;
                    break;
                case(5):
                    totalSale = totalSale + (productQuant * 6.87);
                    item5 = item5 + productQuant;
            }
            System.out.printf("Your current total is:   $%,.2f \n\n", totalSale);
        }
        System.out.print("\n" + (char)27 + "[34;47m" + "Your total is:           ");
        System.out.printf("$%,.2f ", totalSale);
        System.out.println("\nItems Purchased: ");
        if (item1 > 0)
            System.out.println("A used tissue............" + item1);
        if (item2 > 0)
            System.out.println("Jar of pee..............." + item2);
        if (item3 > 0)
            System.out.println("Broken Glass............." + item3);
        if (item4 > 0)
            System.out.println("Glazed Ham..............." + item4);
        if (item5 > 0)
            System.out.println("Dead Rat................." + item5);
    }
}
