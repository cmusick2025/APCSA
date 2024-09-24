/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diceroller;

/**
 *
 * @author cmusick2025
 */
import java.util.*;
public class DiceRoller {

    public static void main(String[] args) {
        //Initialize the random generator
        Random generator = new Random();
        //Loop whenever the user inputs "r"
        Scanner scan = new Scanner(System.in);
        String input = "r";
        while(true){       
            input = scan.next();
            //Create a 6-sided die generator
            int die;
            die = generator.nextInt(1, 7);
            System.out.println("You rolled a " + die + "!");
        }
    }
}    

