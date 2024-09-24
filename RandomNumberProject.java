/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumberproject;

/**
 *
 * @author cmusick2025
 */
import java.util.*;
public class RandomNumberProject {

    public static void main(String[] args) {
        //Randomly generate first 3 digits -- cannot contain 8 or 9
        Random generator = new Random();
        //Create a loop so that a new phone number is generated when "p" is input by the user
        Scanner scan = new Scanner(System.in);
        String input = "p";
        while(true){
            input = scan.next();
            int num1;
            int num2;
            int num3;
            num1 = generator.nextInt(8);
            num2 = generator.nextInt(8);
            num3 = generator.nextInt(8);

            //Randomly generate middle 3 digits -- cannot go higher than 655
            int num4;
            int num5;
            int num6;
            num4 = generator.nextInt(7);
            num5 = generator.nextInt(6);
            num6 = generator.nextInt(6);

            //Randomly generate last 4 digits
            int num7;
            int num8;
            int num9;
            int num10;
            num7 = generator.nextInt(10);
            num8 = generator.nextInt(10);
            num9 = generator.nextInt(10);
            num10 = generator.nextInt(10);
            System.out.println("Random Phone Number: " + num1 + num2 + num3 + "-" + num4 + num5 + num6 + "-" + num7 + num8 + num9 + num10);
        }
    }
}
