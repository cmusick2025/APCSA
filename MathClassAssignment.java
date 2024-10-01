/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mathclassassignment;

/**
 *
 * @author cmusick2025
 */
import java.util.*;
public class MathClassAssignment {

    public static void main(String[] args) {
        //Part 1
        //Randomly generate a number from 0-90, inclusive
        Random generator = new Random();
        int num1;
        
        //Initialize variables and their rounded variants
        double sin = 0.0;
        double cos = 0.0;
        double tan = 0.0;
        double roundedSin = 0.0;
        double roundedCos = 0.0;
        double roundedTan = 0.0;
        
        //Perform claculations using the math class
        num1 = generator.nextInt(91);
        sin = Math.sin(num1);
        cos = Math.cos(num1);
        tan = Math.tan(num1);
        
        //Round the values to the third decimal place
        roundedSin = roundAvoid(sin, 3);
        roundedCos = roundAvoid(cos, 3);
        roundedTan = roundAvoid(tan, 3);
        
        //Print the results
        System.out.println("Part 1");
        System.out.println("Number: " + num1);
        System.out.println("Sin: " + roundedSin);
        System.out.println("Cos: " + roundedCos);
        System.out.println("Tan: " + roundedTan);
        System.out.println("");
        
        
        
        //Part 2
        //Generate another random number from 1.0 to 20.0
        double randomRadius = generator.nextDouble(1.0, 20.0);
        
        //Round this value
        double roundedRadius = 0.0;
        roundedRadius = roundAvoid(randomRadius, 3);
        
        //Find area of a circle using this random radius
        double circleArea = 0.0;
        circleArea = (Math.PI * (randomRadius * randomRadius));
        
        //Round this value
        double roundedArea = 0.0;
        roundedArea = roundAvoid(circleArea, 3);
        
        //Find volume of a sphere using this random radius
        double sphereVolume = 0.0;
        sphereVolume = ((4/3)*(Math.PI)*(randomRadius * randomRadius * randomRadius));
        
        //Round this value
        double roundedVolume = 0.0;
        roundedVolume = roundAvoid(sphereVolume, 3);
        
        //Print the results
        System.out.println("Part 2");
        System.out.println("Radius: " + roundedRadius);
        System.out.println("Circle Area: " + roundedArea);
        System.out.println("Sphere Volume: " + roundedVolume);
        System.out.println("");
        
        
        
        //Part 3
        //Generate another random number between 1000.0 and 100,000,000.0
        double randomLarge = generator.nextDouble(1000.0, 100000000.0);
        
        //Round this value
        double roundedLarge = 0.0;
        roundedLarge = roundAvoid(randomLarge, 5);
        
        //Take the square root of this number
        double sqrt = 0.0;
        sqrt = Math.sqrt(randomLarge);
        
        //Round this value
        double roundedSqrt = 0.0;
        roundedSqrt = roundAvoid(sqrt, 5);
        
        //Find the natural logarithm of this value
        double ln = 0.0;
        ln = Math.log(randomLarge);
        
        //Round this value
        double roundedLn = 0.0;
        roundedLn = roundAvoid(ln, 5);
        
        //Find the log10 of this number
        double log10 = 0.0;
        log10 = Math.log10(randomLarge);
        
        //Round this value
        double roundedLog10 = 0;
        roundedLog10 = roundAvoid(log10, 5);
        
        //Print all of the rounded values
        System.out.println("Part 3");
        System.out.println("Number: " + roundedLarge);
        System.out.println("Square Root: " + roundedSqrt);
        System.out.println("Natural Log: " + roundedLn);
        System.out.println("Log10: " + roundedLog10);
        System.out.println("");
        
        
        
        //Part 4
        //Calculate the mass required, in grams, to generate the amount of energy found above
        double mass = randomLarge / (-299792458 * 299792458);
        System.out.println("Part 4");
        System.out.println("Random large number: " + randomLarge);
        System.out.println("Original mass: " + mass);
        
        
        //Round this value to user-defined number of decimal places
        Scanner scan = new Scanner(System.in);
        int userRound = 0;
        System.out.println("Enter a number of decimal places: ");
        userRound = scan.nextInt();
        double finalRound = 0.0;
        finalRound = roundAvoid(mass, userRound);
        System.out.println("Rounded mass: " + finalRound);
        System.out.println("");
        
        
        
        //Part 5 
        //Get real number value and integer input from user
        //Output real number value to power of the integer
        //Round to user input number of decimal places
        double realNumber = 0.0;
        int integerValue = 0;
        System.out.println("Part 5");
        System.out.println("Input a real number value: ");
        realNumber = scan.nextDouble();
        System.out.println("Input an integer: ");
        integerValue = scan.nextInt();
        
        double power = 0.0;
        power = Math.pow(realNumber, integerValue);
        System.out.println("Real number to the power of the integer value: " + power);
        int userRound2 = 0;
        System.out.println("Enter a number of decimal places: ");
        userRound2 = scan.nextInt();
        double finalRound2 = 0.0;
        finalRound2 = roundAvoid(power, userRound2);
        System.out.println("Rounded result of real number to the power of the integer value: " + finalRound2);
        
        
   
    }
    
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
