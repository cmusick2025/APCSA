/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interestrateassignment;

/**
 *
 * @author cmusick2025
 */
import java.util.*;
import java.text.*;

public class InterestRateAssignment {

    public static void main(String[] args) {
        //Prompt user to input financial amount
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter original financial amount: ");
        double principal = scan.nextDouble();
        
        InterestRateCalculator calc = new InterestRateCalculator();
        
        //Prompt user for number of months
        System.out.println("Enter # of months for repayment: ");
        int numMonths = scan.nextInt();
        calc.setMonths(numMonths);
        calc.setAmount(principal);
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        //Print each month and its corresponding payment
        System.out.println("Month 1 Total Amount Paid: " + fmt.format(calc.getMonthlyPayment(1)));
        System.out.println("Month 2 Total Amount Paid: " + fmt.format(calc.getMonthlyPayment(2)));
        System.out.println("Month 3 Total Amount Paid: " + fmt.format(calc.getMonthlyPayment(3)));
        System.out.println("Month 4 Total Amount Paid: " + fmt.format(calc.getMonthlyPayment(4)));
        System.out.println("Month 5 Total Amount Paid: " + fmt.format(calc.getMonthlyPayment(5)));
        System.out.println("Month 6 Total Amount Paid: " + fmt.format(calc.getMonthlyPayment(6)));
        System.out.println("Month 7 Total Amount Paid: " + fmt.format(calc.getMonthlyPayment(7)));
        System.out.println("Month 8 Total Amount Paid: " + fmt.format(calc.getMonthlyPayment(8)));
        System.out.println("Month 9 Total Amount Paid: " + fmt.format(calc.getMonthlyPayment(9)));
        System.out.println("Month 10 Total Amount Paid: " + fmt.format(calc.getMonthlyPayment(10)));
        System.out.println("Month 11 Total Amount Paid: " + fmt.format(calc.getMonthlyPayment(11)));
        System.out.println("Month 12 Total Amount Paid: " + fmt.format(calc.getMonthlyPayment(12))); 
    }
}

class InterestRateCalculator {
    //Establish permanent 10% interest rate
    public static final double RATE = 0.1;
    //Create private variables
    private double payment;
    private int months;
    private double total;
    private double amount;
    
    //Empty Constructor
    public InterestRateCalculator(){

}

    //Set corresponding payment to each month
    public void setPayments(double inPay){
        payment = inPay;
}
    //Set corresponding month
    public void setMonths(int inMonth){
        months = inMonth;
}
    //Set corresponding total to each month
    public void setTotal(double inTotal){
        total = inTotal;
}
    //Set amount
    public void setAmount(double inAmount){
        amount = inAmount;
}
    //Calculate monthly payment
    public double getMonthlyPayment(int months) {
        double monthlyPayment = amount / months;  
        double totalMonthly = monthlyPayment * RATE + monthlyPayment;
        double remainingTotal = amount - monthlyPayment;
        double totalAmount = remainingTotal * RATE + remainingTotal;
        return totalAmount;
}    

    
    //Use toString to represent objects as strings
    //Store all relevant information in a string variable and print accordingly
    public String toString(){
        String result;
        result = "";
        return result;
}
}

