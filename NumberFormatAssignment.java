/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberformatassignment;

/**
 *
 * @author cmusick2025
 */
import java.util.*;
import java.text.*;
public class NumberFormatAssignment {

    
    public static void main(String[] args) {
        //Ask for # of students in a school, then # of girls
        //Output % of girls and % of boys
        Scanner scan = new Scanner(System.in);
        double numStudents;
        System.out.println("Input total student number: ");
        numStudents = scan.nextDouble();
        double numGirls;
        System.out.println("Input number of girls: ");
        numGirls = scan.nextDouble();
        
        double percentGirls = numGirls / numStudents;
        double percentBoys = (numStudents - numGirls) / numStudents;
        NumberFormat fmt1 = NumberFormat.getPercentInstance();
        NumberFormat fmt2 = NumberFormat.getPercentInstance();
        System.out.println("Percent girls: " + fmt1.format(percentGirls));
        System.out.println("Percent boys: " + fmt2.format(percentBoys));
        System.out.println("");
        
        
        //Ask for amount in dollars and cents
        //Convert and return value British pounds and pence, along with exchange rate
        double cash;
        System.out.println("Amount in dollars and cents: ");
        cash = scan.nextDouble();
        double pounds;
        pounds = 0.83 * cash;
        NumberFormat fmt3 = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("Current exchange rate: 0.83 pence to the dollar");
        System.out.println("Amount in pounds: " + fmt3.format(pounds));
        
        
        //Ask for integer from 0-15
        //Based on input, format pi to that number of decimal places
        //Print it out appropriately
        int numInput;
        System.out.println("Input a number between 0 and 15: ");
        numInput = scan.nextInt();
        DecimalFormat fmt4 = new DecimalFormat();
        if(numInput == 0){
            fmt4 = new DecimalFormat("0");
        }else if (numInput == 1){
            fmt4 = new DecimalFormat("0.#1");
        }else if (numInput == 2){
            fmt4 = new DecimalFormat("0.##");
        }else if (numInput == 3){
            fmt4 = new DecimalFormat("0.###");
        }else if (numInput == 4){
            fmt4 = new DecimalFormat("0.####");
        }else if (numInput == 5){
            fmt4 = new DecimalFormat("0.#####");
        }else if (numInput == 6){
            fmt4 = new DecimalFormat("0.######");
        }else if (numInput == 7){
            fmt4 = new DecimalFormat("0.#######");
        }else if (numInput == 8){
            fmt4 = new DecimalFormat("0.########");
        }else if (numInput == 9){
            fmt4 = new DecimalFormat("0.#########");
        }else if (numInput == 10){
            fmt4 = new DecimalFormat("0.##########");
        }else if (numInput == 11){
            fmt4 = new DecimalFormat("0.###########");
        }else if (numInput == 12){
            fmt4 = new DecimalFormat("0.############");
        }else if (numInput == 13){
            fmt4 = new DecimalFormat("0.#############");
        }else if (numInput == 14){
            fmt4 = new DecimalFormat("0.##############");
        }else if (numInput == 15){
            fmt4 = new DecimalFormat("0.###############");
        }
        
        double roundedPi;
        roundedPi = roundAvoid(Math.PI, numInput);
        System.out.println("Truncated pi: " + fmt4.format(roundedPi));
        System.out.println("");
        
        
        
        //Generate random number from 100,000,000 to 999e18 as a decimal number (no scientific notation)
        Random generator = new Random();
        double hugeNum = generator.nextDouble(100000000, 999e18);
        DecimalFormat fmt5 = new DecimalFormat("#,###.######");
        //fmt5.format(hugeNum);
        System.out.println("Large number: " + fmt5.format(hugeNum));
    }            
    
                
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
        
       
   }
}
