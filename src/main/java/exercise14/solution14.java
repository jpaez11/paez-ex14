/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Pseudocode:
 * Program that will ask user for an order amount and a state, if the state is Wisconsin
 * then it will be charged an extra tax. The output will be the tax itself and the total amount,
 * tax included. 
 */

package exercise14;
import java.util.*;

public class solution14 {
    public static void main(String [] args){
     Scanner userInput = new Scanner(System.in); //object to read user inputs

     System.out.print("What's the order amount? ");
     double amount = userInput.nextDouble();

     System.out.print("What's the state?");
     String UState= userInput.next(); //string to read the state, this will be the condition of the if statement

     double taxes = 0;
     if (UState.equalsIgnoreCase("WI")){ //begin the statement
         System.out.printf("The subtotal amount is ", amount);

         taxes = 5.5/10; //calculation of taxes
         System.out.printf("The tax is: ", taxes);
     }
     double result = amount + taxes; //full amount
        System.out.printf("The total is $ %.2f ", result);

    }
}
