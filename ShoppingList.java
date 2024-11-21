/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppinglist;

/**
 *
 * @author cmusick2025
 */
import java.util.*;

public class ShoppingList {

    public static void main(String[] args) {
        //Create an array list
        ArrayList al = new ArrayList();
        String input;
        String output;
        //Make a loop for shopping list items input by the user
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter shopping item: ");
            input = scan.next();
            al.add(input);
            int i = 0;
            //Print the numbered items
            while(i < al.size()){
                System.out.println((i+1) + ")" + " " + al.get(i));
                i++;
            }
            //Allow user to remove item
            System.out.println("Which item would you like to remove, if any?");
            output = scan.next();
            al.remove(output);
            i = 0;
            //Print out updated shopping list
            System.out.println("Updated list: ");
            while(i < al.size()){
                System.out.println((i+1) + ")" + " " + al.get(i));
                i++;
            }
        }
    }
}