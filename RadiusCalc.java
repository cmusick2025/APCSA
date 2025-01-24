/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radiuscalc;

/**
 *
 * @author cmusick2025
 */
import java.util.Scanner;

public class RadiusCalc {

    /**
     * @param args the command line arguments
     */
    //carry out calculations or circular items
    //such as a circle, a sphere, a cone, a column
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This program calculates round item numbers such as \n" +
                "1 - Area of a circle (pi r^2)\n" +
                "2 - Volume of a sphere (4/3 pi r^3)\n" +
                "3 - Volume of a cone (pi r^2 h/3)\n" +
                "4 - Volume of a column (pi r^2 h)");
        System.out.println("Type the number for which one you want to calculate");
        int i = s.nextInt();
        if (i == 1){
            cCalc();
        }else if (i == 2){
            sCalc();
        }else if(i == 3){
            cCalc2();
        }else if(i == 4){
            cCalc3();
        }
    }
    
    public static void cCalc3(){
        //Change "cone" to "column"
        System.out.println("enter the radius of your column, then height of your column");
        //Add a scanner
        Scanner column = new Scanner (System.in);
        int r = column.nextInt();
        int h = column.nextInt();
        double result = Math.PI * Math.pow(r, 2) * h;
        System.out.println(result);
    }
    
    public static void cCalc2(){
        System.out.println("enter the radius of your cone, then height of your cone");
        //Add a scanner
        Scanner cone = new Scanner (System.in);
        int r = cone.nextInt();
        int h = cone.nextInt();
        //Correct formula by dividing by 3
        double result = (Math.PI * Math.pow(r, 2) * h) / 3;
        System.out.println(result);
    }
    
    public static void cCalc(){
        System.out.println("enter the radius of your circle");
        //Add a scanner
        Scanner circle = new Scanner (System.in);
        int r = circle.nextInt();
        double result = Math.PI * Math.pow(r, 2);
        //Changed r to result
        System.out.println(result);
    }
    
    public static void sCalc(){
        //Change "circle" to "sphere"
        System.out.println("enter the radius of your sphere");
        //Add a scanner
        Scanner sphere = new Scanner (System.in);
        int r = sphere.nextInt();
        //Rearrange operations/parentheses
        double result = (4 * (Math.PI * Math.pow(r, 3))) / 3;
        //Changed r to result
        System.out.println(result);
    }
}