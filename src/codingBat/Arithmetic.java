package codingBat;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
     
      
        // Write your calculation code here.
        
        double tip = mealCost * (tipPercent/100);
        double tax = mealCost * (taxPercent/100);
       // double totalCost = mealCost+tip+tax ;
        
        //System.out.println(totalCost);
        
      
        // cast the result of the rounding operation to an int and save it as totalCost 
       int totalCost = (int) Math.round(mealCost+(mealCost * (tipPercent/100))+mealCost * (taxPercent/100));
      
        // Print your result
        System.out.println(totalCost);
           scan.close();
    }
}