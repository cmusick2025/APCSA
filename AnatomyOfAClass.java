/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anatomyofaclass;

/**
 *
 * @author cmusick2025
 * 1. A class serves as a blueprint that defines the state and behavior of an object. A single class can be used to create multiple objects. An object is a specific instance of a class with its own state and behavior.
2. When you pass an object to a print or println method, the toString method is automatically called, returning a string that represents the object’s state.
3. The scope of a variable is the area in a program where the variable can be referenced. A variable in a method can only be referenced in that method, while a variable at class level can be referenced anywhere in the class.
 */

public class AnatomyOfAClass {

    public static void main(String[] args) {
        //Use the Car class to add specifications for 2024 BMW i8 
        //Print this information
        Car bmw = new Car();
        bmw.setBrand("BMW (i8)");
        bmw.setSpeed(155);
        bmw.setEngine(369);
        bmw.setPrice(160850);
        System.out.println(bmw);
        
        //Use the Car class to add specifications for 2024 Volkswagen Bug 
        //Print this information
        Car bug = new Car();
        bug.setBrand("Volkswagen (Bug)");
        bug.setSpeed(110);
        bug.setEngine(174);
        bug.setPrice(47325);
        System.out.println(bug);
        
        //Use the Car class to add specifications for 2024 Toyota Prius 
        //Print this information
        Car prius = new Car();
        prius.setBrand("Toyota (Prius)");
        prius.setSpeed(112);
        prius.setEngine(196);
        prius.setPrice(27950);
        System.out.println(prius);
        
        //Use the Car class to add specifications for 2024 Tesla Model 3 
        //Print this information
        Car tesla = new Car();
        tesla.setBrand("Tesla (model 3)");
        tesla.setSpeed(162);
        tesla.setEngine(510);
        tesla.setPrice(40380);
        System.out.println(tesla);
    }
}

//Write car class
//Include string variable called "carBrand", int variable called "enginePower", double variable called "maxSpeed", and double variable called "price"
class Car {
    private String carBrand = "";
    private int enginePower = 0;
    private double maxSpeed;
    private double price;
    
    public Car(){
        
    }
    
    //Set the corresponding price to each car
    public void setBrand(String inBrand){ 
        carBrand = inBrand;
    }
    
    //Set the corresponding top speed to each car
    public void setSpeed(double inSpeed){
        maxSpeed = inSpeed;
    }
    
    //Set the corresponding engine power to each car
    public void setEngine(int inEngine){
        enginePower = inEngine;
    }
    
    //Set the corresponding price to each car
    public void setPrice(double inPrice){
        price = inPrice;
    }
    
    //Use toString to represent objects as strings
    //Store all relevant information in a string variable and print accordingly
    public String toString(){
        String result;
        result = "Car brand: " + carBrand + "\n" + "Speed: " + maxSpeed + " mph" + "\n" + "Engine power: " + enginePower + " Horse Power" + "\n" + "Price: $" + price + "\n";
        return result;
    }
}