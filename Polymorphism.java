/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphism;

/**
 *
 * @author cmusick2025
 */

import java.util.*; 

//Main class
public class Polymorphism {
    public static void main(String[] args) {
        ArrayList<Aircraft> aircraftList = new ArrayList<>();
        
        Aircraft generalAircraft = new Aircraft("General Aircraft", 2);
        //Add Single Engine Plane and Helicopter to array list
        aircraftList.add(generalAircraft);
        aircraftList.add(new SingleEnginePlane());
        aircraftList.add(new Helicopter());
        
        //Print specific details for each aircraft in the list
        for (Aircraft aircraft : aircraftList) {
            System.out.println(aircraft);
        }
    }
}

//Base aircraft class
class Aircraft {
    protected String type;
    protected int wings;
    
    public Aircraft(String type, int wings) {
        this.type = type;
        this.wings = wings;
    }
    
    public String getDetails(){
        return "Type: " + type + "\n" + "Wings: " + wings + "\n";
    }
    
    public void printDetails(){
        System.out.println("Aircraft Details: " + getDetails());
    }
    
    //toString
    @Override
    public String toString() {
        return getDetails();
    }
}

// SingleEnginePlane inherits from Aircraft
class SingleEnginePlane extends Aircraft {
    protected String engineType;
    
    public SingleEnginePlane() {
        super("Single Engine Plane", 2);
        this.engineType = "Rotary Engine";
    }
    
    @Override
    public String getDetails() {
        return "Type: " + type + "\n" + "Wings: " + wings + "\n" + "Engine: " + engineType + "\n";
    }
}

// Helicopter inherits from SingleEnginePlane
class Helicopter extends SingleEnginePlane {
    final private String rotorType;
    
    public Helicopter() {
        super();
        this.type = "Helicopter";
        this.wings = 0;
        this.rotorType = "Rotating Blades";
    }
    
    @Override
    public String getDetails() {
        return "Type: " + type + "\n" + "Wings: " + wings + "\n" + "Engine: " + engineType + "\n" + "Rotor: " + rotorType;
    }
}


