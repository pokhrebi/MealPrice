

import java.util.Scanner;

/*
Group of friends went to a Resturant

When the Bill comes they would like to divide the bill equally upon each other

MenuPrice = price when Waiter brings the check

Tip Rate = percent group decided to tip == 5% = .05, 10% = .10 so on

Tax Rate = fixed tax rate for that city ex Cincinnati tax rate = 7% = .07;

*/

/**
 *
 * @author bhakti
 */
public class MealPrice 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        double MenuPrice;
        double tipRate;
        double taxRate;
        int totalMembers;
        
        System.out.println("What is the price on check? ");
        MenuPrice = in.nextDouble();
       
        System.out.println("What is the tip rate? ");
        tipRate = in.nextDouble();
        
        System.out.println("What is the tax rate? ");
        taxRate = in.nextDouble();
        
        System.out.println("How many members are there? ");
        totalMembers = in.nextInt();
        
        TotalMealPrice(MenuPrice, tipRate, taxRate);
        
       double groupMealCost = TotalMealPrice(MenuPrice, tipRate, taxRate);
       double individualCost = groupMealCost / totalMembers;
       
        System.out.printf("\n Total individual Cost is: $%.2f", individualCost);
        System.out.println("\n");
    }
    public static double TotalMealPrice(double MenuPrice, double tipRate, double taxRate)
    {
        double tip = tipRate * MenuPrice;
        double tax = taxRate * MenuPrice;
        double totalMealPrice = MenuPrice + tip + tax;
        return totalMealPrice;
    }
    
}
