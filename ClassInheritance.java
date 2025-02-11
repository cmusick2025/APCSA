/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classinheritance;

/**
 *
 * @author cmusick2025
 */
public class ClassInheritance {

    public static void main(String[] args) {
        // Create and print a generic Vehicle
        Vehicle genericVehicle = new Vehicle("Generic Vehicle", 50.0, 2, 500.0);
        System.out.println(genericVehicle);
        System.out.println();

        // Create and print a Car (Base class for bus and fire truck)
        Car sportsCar = new Car("BMW", 150.0, 2, 200.0, 30.0);
        System.out.println(sportsCar);
        System.out.println();

        // Create and print a Bus
        Bus cityBus = new Bus("MTS Bus", 55.0, 50, 1000.0, 6.5, 20, true);
        System.out.println(cityBus);
        System.out.println();

        // Create and print a Fire Truck
        FireTruck ladderTruck = new FireTruck("Type 2 Firetruck", 65.0, 4, 1500.0, 5.0, 2000, true);
        System.out.println(ladderTruck);
        System.out.println();

        // Create and print a Boat (Base class for submarine and jet ski)
        Boat fishingBoat = new Boat("Yamaha Fishing Boat", 40.0, 6, 800.0, true);
        System.out.println(fishingBoat);
        System.out.println();

        // Create and print a Submarine
        Submarine sub = new Submarine("Attack Submarine", 25.0, 135, 20000.0, true, 800.0, true);
        System.out.println(sub);
        System.out.println();

        // Create and print a Jet Ski
        JetSki ski = new JetSki("Yamaha Jetski", 65.0, 2, 50.0, true, true);
        System.out.println(ski);
        System.out.println();

        // Create and print an Airplane (Base class for helicopter and blimp)
        Airplane plane = new Airplane("Boeing 747", 570.0, 416, 112000.0, 211);
        System.out.println(plane);
        System.out.println();

        // Create and print a Helicopter
        Helicopter chopper = new Helicopter("Black Hawk", 182.0, 2, 3000.0, 48, 4, true);
        System.out.println(chopper);
        System.out.println();

        // Create and print a Blimp
        Blimp goodyearBlimp = new Blimp("Goodyear Blimp", 35.0, 12, 1000.0, 246, 7500, true);
        System.out.println(goodyearBlimp);
        System.out.println();

        // Create and print a Forklift
        Forklift warehouseForklift = new Forklift("Toyota Forklift", 10.0, 1, 300.0, 5000.0);
        System.out.println(warehouseForklift);
        System.out.println();

        // Create and print a Hot Air Balloon
        HotAirBalloon adventureBalloon = new HotAirBalloon("Discovery Balloon", 15.0, 4, 500.0, 100000.0);
        System.out.println(adventureBalloon);
    }
}

    
    // The Base Vehicle Class, implements the Speedometer interface
class Vehicle implements Speedometer{
    //base (Class wide) variables
    protected String brandName = "";
    protected double speed = 0.0;
    protected int passengers = 0;
    protected double cargoWeight = 0.0;
    //Base default constructor 
    public Vehicle(){
        brandName = "";
        speed = 0.0;
        passengers = 0;
        cargoWeight = 0.0;
    }

    public Vehicle(String inBrand, double inSpeed, int inPassengers, double inCargo){
        brandName = inBrand;
        speed = inSpeed;
        passengers = inPassengers;
        cargoWeight = inCargo;
    }

    //getters and setters
    public Vehicle(String inBrand){
        brandName = inBrand;
    }

    public String getBrand(){
        return brandName;
    }

    public  void setBrandName(String inBrand){
        brandName = inBrand;
    }
    
    @Override
    public double getSpeed(){
        return speed;
    }
    
    @Override
    public void setSpeed(double inSpeed){
        speed = inSpeed;
    }

    public int getPassengers(){
        return passengers;
    }

    public void setPassengers(int inPassengers){
        speed = inPassengers;
    }

    public double getCargoWeight(){
        return cargoWeight;
    }

    public void setCargoWeight(double inCargoWeight){
        cargoWeight = inCargoWeight;
    }

    //Base toString
    @Override
    public String toString(){
        String result = "";
        result = "Brand: \t" + getBrand() + "\n" +
                "Speed (mph): \t" + getSpeed() + "\n" +
                "Passengers: \t" + getPassengers() + "\n" +
                "Cargo (lbs): \t" + getCargoWeight() + "\n";
        return result;
    }
}

// Car Class inherits from Vehicle Class
class Car extends Vehicle{
    int wheels = 4;
    String color = "White";
    boolean spoiler = false;
    boolean stereo = false;
    double mpg = 0.0; //has an extra variable, mpg

    public Car(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG){
        super(inBrand, inSpeed, inPassengers, inCargo); //uses the super constructor
        mpg = inMPG; //also include the extra variable in the Car constructor
    }
    //another additional variable
    public void setSpoiler(boolean inSpoiler){
        spoiler = inSpoiler;
    }

    public boolean getSpoiler(){
        return spoiler;
    }
    //another additional variable
    public void setStereo(boolean inStereo){
        stereo = inStereo;
    }

    public boolean getStereo(){
        return  stereo;
    }
    //overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (spoiler)
            return super.getSpeed() + 20;
        else
            return super.getSpeed();
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getMPG(){
        if(stereo)
            return mpg - (mpg / 10);
        else
            return mpg;
    }
    //usesd the super toString, as well as addingnthe new variable to it.
    public String toString(){
        String result = super.toString() +
                "MPG :\t" + this.getMPG();
        return  result ;
    }
}

//2 car-based vehicle classes
class Bus extends Car {
    final private int stops;
    final private boolean hasWiFi;

    //Constructor
    public Bus(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int stops, boolean hasWiFi) {
        super(inBrand, inSpeed, inPassengers, inCargo, inMPG);
        this.stops = stops;
        this.hasWiFi = hasWiFi;
    }

    //Include specific bus details
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nThis bus makes " + stops + " stops";
        
        if (hasWiFi) {
            result += "\nWiFi is available on this bus";
        } else {
            result += "\nWiFi isn't available on this bus";
        }

        return result;
    }
}

class FireTruck extends Car {
    final private int waterCapacity;
    final private boolean hasSirens;

    public FireTruck(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int waterCapacity, boolean hasSirens) {
        super(inBrand, inSpeed, inPassengers, inCargo, inMPG);
        this.waterCapacity = waterCapacity;
        this.hasSirens = hasSirens;
    }

    //Include firetruck-specific details
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nThis fire truck can carry " + waterCapacity + " gallons of water";
        
        if (hasSirens) {
            result += "\nThis fire truck has sirens";
        } else {
            result += "\nThis fire truck doesn't have sirens";
        }

        return result;
    }
}

//Boat class for submarine and jetski to inherit from
class Boat extends Vehicle {
    protected boolean hasMotor;

    public Boat(String brand, double speed, int passengers, double cargo, boolean hasMotor) {
        super(brand, speed, passengers, cargo);
        this.hasMotor = hasMotor;
    }

    //Specific to boats
    @Override
    public String toString() {
        String result = super.toString();
        if (hasMotor) {
            result += "\nThis boat has a motor";
        } else {
            result += "\nThis boat doesn't have a motor";
        }

        return result;
    }
}


//2 boat-based vehicle classes
class Submarine extends Boat {
    final private double maxDepth;
    final private boolean hasRadar;

    public Submarine(String brand, double speed, int passengers, double cargo, boolean hasMotor, double maxDepth, boolean hasRadar) {
        super(brand, speed, passengers, cargo, hasMotor);
        this.maxDepth = maxDepth;
        this.hasRadar = hasRadar;
    }

    //Sub-specific details
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nThis submarine can travel down " + maxDepth + " meters";
        
        if (hasRadar) {
            result += "\nThis submarine has radar technology";
        } else {
            result += "\nThis submarine doesn't have radar technology";
        }

        return result;
    }
}


class JetSki extends Boat {
    final private boolean canBoost;

    public JetSki(String brand, double speed, int passengers, double cargo, boolean hasMotor, boolean canBoost) {
        super(brand, speed, passengers, cargo, hasMotor);
        this.canBoost = canBoost;
    }

    //Jetski specific details
    @Override
    public String toString() {
        String result = super.toString();
        
        if (canBoost) {
            result += "\nThis jet ski can activate turbo boost";
        } else {
            result += "\nThis jet ski doesn't have turbo boost";
        }

        return result;
    }
}

//Airplane class for helicopter and blimp to inherit from
class Airplane extends Vehicle {
    protected int wingspan;

    public Airplane(String brand, double speed, int passengers, double cargo, int wingspan) {
        super(brand, speed, passengers, cargo);
        this.wingspan = wingspan;
    }

    //Override for airplanes specifically
    @Override
    public String toString() {
        return super.toString() + "\nWingspan: " + wingspan + " feet";
    }
}

//2 airplane-based classes
class Helicopter extends Airplane {
    final private int rotors;
    final private boolean hasAutopilot;

    public Helicopter(String brand, double speed, int passengers, double cargo, int wingspan, int rotors, boolean hasAutopilot) {
        super(brand, speed, passengers, cargo, wingspan);
        this.rotors = rotors;
        this.hasAutopilot = hasAutopilot;
    }

    //Helicopter information
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nThis helicopter has " + rotors + " rotors";
        
        if (hasAutopilot) {
            result += "\nThis helicopter has autopilot";
        } else {
            result += "\nThis helicopter doesn't have autopilot";
        }

        return result;
    }
}

// Blimp Class - A lighter-than-air aircraft
class Blimp extends Airplane {
    final private int maxHeight;
    final private boolean hasAdvertisement;

    public Blimp(String brand, double speed, int passengers, double cargo, int wingspan, int maxHeight, boolean hasAdvertisement) {
        super(brand, speed, passengers, cargo, wingspan);
        this.maxHeight = maxHeight;
        this.hasAdvertisement = hasAdvertisement;
    }

    //Specific to blimp
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nThis blimp can fly " + maxHeight + " ft above sea level";
        
        if (hasAdvertisement) {
            result += "\nThis blimp displays advertisements";
        } else {
            result += "\nThis blimp doesn't display advertisements";
        }

        return result;
    }
}
//Unique vehicle classes - forklift and hot air balloon
class Forklift extends Vehicle {
    final private double liftCapacity;

    public Forklift(String brand, double speed, int passengers, double cargo, double liftCapacity) {
        super(brand, speed, passengers, cargo);
        this.liftCapacity = liftCapacity;
    }

    //forklift specifics
    @Override
    public String toString() {
        return super.toString() + "\nLift Capacity: " + liftCapacity + " lbs";
    }
}

class HotAirBalloon extends Vehicle {
    final private double balloonVolume;

    public HotAirBalloon(String brand, double speed, int passengers, double cargo, double balloonVolume) {
        super(brand, speed, passengers, cargo);
        this.balloonVolume = balloonVolume;
    }

    //Hot air ballon specifics
    @Override
    public String toString() {
        return super.toString() + 
               "\nBalloon Volume " + balloonVolume + " cubic meters";
    }
}

//the Speedometer interface to show the speed of any vehicle in the same way
interface Speedometer{
    public void setSpeed(double inSpeed);
    public double getSpeed();
}
