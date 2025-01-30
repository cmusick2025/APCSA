/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

/**
 *
 * @author cmusick2025
 */

import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        //Initialize "weekDays" array with all 7 days of the week
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        //Print days of the week with one per row
        System.out.println("All days of the week: ");
        for (int i = 0; i < weekDays.length; i++){
            System.out.println(weekDays[i]);
        }
        
        //Resize array to 5, copying only weekdays
        String[] temp = new String[5];
        for (int i = 0; i < 5; i++){
            temp[i] = weekDays[i];
        }
        weekDays = temp;
        
        //Print only weekdays
        System.out.println("\nWeekdays only: ");
        for (int i = 0; i < 5; i++){
            System.out.println(weekDays[i]);
        }
        
        //Shuffle the weekdays-only array
        shuffle(weekDays);
        
        //Print shuffled weekdays only
        System.out.println("\nShuffled weekdays: ");
        for (int i = 0; i < weekDays.length; i++){
            System.out.println(weekDays[i]);
        }
    }
    
    //Shuffling method
    public static void shuffle(String[] array){
        Random r = new Random();
        for (int i = array.length - 1; i > 0; i--){
            int n = r.nextInt(i + 1);
            String temp = array[i];
            array[i] = array[n];
            array[n] = temp;
        }
    }
}
