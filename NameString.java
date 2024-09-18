/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.namestring;

/**
 *
 * @author cmusick2025
 */
public class NameString {

    public static void main(String[] args) {
        //Create a variable for my name
        String StringName = new String("Connor Musick");
        //Print my name (in quotes) to the command line
        System.out.println("My name is \"Connor Musick\"");
        //Print the length of my name
        System.out.println("My name length is \"" + StringName.length() + "\"");
        //Print my name in upper case
        System.out.println("My name in upper case is \"" + StringName.toUpperCase() + "\"");
        //Print my name in lower case
        System.out.println("My name in lower case is \"" + StringName.toLowerCase() + "\"");
        //Print the first letter of my name
        System.out.println("The first letter in my name is \"" + StringName.charAt(0) + "\"");
        //Print the last letter of my name
        System.out.println("The last letter in my name is \"" + StringName.charAt(12) + "\"");
        //Print the index at which the space between my first and last names is located
        System.out.println("The index of the space between the names is \"" + StringName.indexOf(" ") + "\"");
        
    }
}
