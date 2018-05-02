/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author t212
 */
public class Grocery 
{
    private String ItemName;
    private double ItemPrice;
    private int ItemExp_m;
    private int ItemExp_d;
    private int ItemExp_y;
    private String ItemExp;
    
    public Grocery(String n, double p) 
    {
        ItemName = n;
        ItemPrice = p;
      
    }
    public Grocery(String n, double p, int e, int j, int u) 
    {
        ItemName  = n;
        ItemPrice = p;
        ItemExp_m = e;
        ItemExp_d = j;
        ItemExp_y = u;
    }
    public Grocery() 
    {
        ItemName = "";
        ItemPrice = 0;
        ItemExp_m = 1;
        ItemExp_d = 1;
        ItemExp_y = 1992;
    }
    
    //Set Properties
    public void setItemName(String n)
    {
        ItemName = n;
    }
    public void setItemPrice(double p)
    {
        ItemPrice = p;
    }
    public void setItemExp_m(int m)
    {
        ItemExp_m = m;
    }
    public void setItemExp_d(int d)
    {
        ItemExp_m = d;
    }
    public void setItemExp_y(int y)
    {
        ItemExp_m = y;
    }
    
    
    //Get&Set Properties
    public String getItemName()
    {
        return ItemName;
    }
     public double getItemPrice()
    {
        return ItemPrice;
    }
      public int getItemExp_m()
    {
        return ItemExp_m;
    }
     public int getItemExp_d()
     {
         return ItemExp_d;
     }
    public int getItemExp_y()
     {
         return ItemExp_y;
     }
    
    
    //Predicates
    public boolean isExpensive()
    {
        if (ItemPrice > 7.99)
            return true;
        else
            return false;
    }
    
      public boolean isExpiredY()
    {
        if (ItemExp_y > 2018)
            return true;
        if (ItemExp_y == 2018)
            return false;
        else
            return false;
    }
      public boolean isExpiredM()
    {
        if (ItemExp_m > 5)
            return true;
        if (ItemExp_m == 5)
            return false;
        else
            return false;
    }
      public boolean isExpiredD()
    {
        if (ItemExp_d > 3)
            return true;
        if (ItemExp_d == 3)
            return false;
        else
            return false;
    }
}


