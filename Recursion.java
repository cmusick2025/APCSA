/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursion;

/**
 *
 * @author cmusick2025
 */
import java.util.*;

public class Recursion {
    //
    public static List<Integer> getRow(int x){
        //First row is always just 1
        if (x == 1){
            List<Integer> baseRow = new ArrayList<>();
            baseRow.add(1);
            return baseRow;
        }
        
        //Use recursion to calculate previous row
        List<Integer> previousRow = getRow(x - 1);
        
        //Make a new list for the current row
        List<Integer> currentRow = new ArrayList<>();
        
        //First number is always 1
        currentRow.add(1);
        
        //Calculate middle value of current row using sum of values from previous row
        for (int i = 1; i < previousRow.size(); i++){
            currentRow.add(previousRow.get(i - 1) + previousRow.get(i));
        }
        
        //Last number is also always 1 
        currentRow.add(1);
        
        return currentRow;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int n = scan.nextInt();
        scan.close();
        
        //Robustness
        if (n < 1){
            System.out.println("Please enter an integer that is greater than or equal to one next time.");
            return;
        }
        
        //Calculate and print nth row
        List<Integer> result = getRow(n);
        System.out.println(result);
    }
}
