/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doandforloops;

/**
 *
 * @author cmusick2025
 */
public class DoAndForLoops {
    // Prints a triangle shape using asterisk (star) characters
    public static void main(String[] args)
    {
        //Part A
        //Set constant for max rows
        final int MAX_ROWS = 10;
        System.out.println("a.");
        //For each row
        for (int row = 1; row <= MAX_ROWS; row++){
            //Print out the appropriate number of stars for that row
            for (int star = MAX_ROWS; star >= row; star--){
                System.out.print("*");
            }
            //New line for a new row
            System.out.println();
        }
        //Part B
        System.out.println("b.");
        //For each row
        for (int row = 1; row <= MAX_ROWS; row++){
            //Print appropriate number of spaces
            for (int space = MAX_ROWS; space > row; space--){
                System.out.print(" ");
            } 
            //Print appropriate number of stars
            for (int star = 1; star <= row; star++){
                System.out.print("*");
            }
            //New line for a new row
            System.out.println();
        }    
        //Part C
        System.out.println("c.");
        //For each row
        for (int row = 1; row <= MAX_ROWS; row++){
            //Print appropriate number of spaces
            for (int space = 1; space < row; space++){
                System.out.print(" ");
            }
            //Print appropriate number of stars
            for (int star = MAX_ROWS; star >= row; star--){
                System.out.print("*");
            }   
            //New line for a new row
            System.out.println();
        }
        //Part D
        System.out.println("d.");
        //For each row in first half
        for (int row = 1; row <= MAX_ROWS; row = row + 2){
            //Print appropriate number of spaces
           for (int space = MAX_ROWS; space > row + 1; space = space - 2){
               System.out.print(" ");
           } 
           //Print appropriate number of stars
           for (int star = 1; star <= row; star++){
               System.out.print("*");
           }
           //Empty line
           System.out.println();
        }
        //For each row in second half
        for (int row = 1; row <= MAX_ROWS; row = row + 2){
            //Print appropriate number of spaces
            for (int space = 2; space < row + 1; space = space + 2){
                System.out.print(" ");
            }
            //Print appropriate number of stars
            for (int star = MAX_ROWS; star > row; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
};
