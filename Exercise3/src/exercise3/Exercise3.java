/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;
import java.util.Scanner;
/**
 *
 * @author t212
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Item Name and Price(One at a time!): ");
        Grocery item1 = new Grocery(input.nextLine(),input.nextDouble());
        Grocery item2 = new Grocery("Ribeye", 19.99, 5, 2, 2018);
        
        System.out.printf("\nItem: %s",item1.getItemName());
        System.out.printf("\nPrice: $%,.2f\n",item1.getItemPrice());
        
         if (item1.isExpensive())
            System.out.println("This is a very expensive price.");
        else
            System.out.println("This is a normal price.");
         
         item1.setItemName("Rice");
         item1.setItemPrice(2.99);
         
        System.out.printf("\nItem: %s",item1.getItemName());
        System.out.printf("\nPrice: $%,.2f\n",item1.getItemPrice());
        
         if (item1.isExpensive())
            System.out.println("This is a very expensive price.");
        else
            System.out.println("This is a normal price.");
         
         
        
        System.out.printf("\nItem: %s",item2.getItemName());
        System.out.printf("\nPrice: $%,.2f\n",item2.getItemPrice());
        
    
         if (item2.isExpensive())
            System.out.println("This is a very expensive price.");
        else
            System.out.println("This is a normal price.");
         
        while(true)
        {
         if(item2.isExpiredY())
            System.out.println("Item is not expired");
         else
         { if(item2.isExpiredM())
             {System.out.println("Item is not expired");
            break;}
            else
                {if(item2.isExpiredD())
                {System.out.println("Item is not expired");
                break;}
                else
                    System.out.println("Item is expired");
                }
         }  
         break;
        }
        }
            
         }
    
         
         
         
    
    
    

