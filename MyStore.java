/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mystore;

/**
 *
 * @author cmusick2025
 */

import java.util.*;

public class MyStore {

    public static void main(String[] args) {
        //Set constant variable for the max budget
        final double MAX_BUDGET = 250.00;
        //Total price of all items
        double totalSpent = 0.00;
        //Increment an item count
        int itemCount = 0;
        //Remaining amount
        double amt = 0.00;
        
        //Establish item objects
        Item tShirt = new Item();
        tShirt.setStrName("T-Shirt");
        tShirt.setDblPrice(29.99);
       
        Item shoes = new Item();
        shoes.setStrName("Shoes");
        shoes.setDblPrice(125.99);
       
        Item jeans = new Item();
        jeans.setStrName("Jeans");
        jeans.setDblPrice(60.99);
       
        Item jacket = new Item();
        jacket.setStrName("Jacket");
        jacket.setDblPrice(250.00);
        
        Item hat = new Item();
        hat.setStrName("Hat");
        hat.setDblPrice(25.99);
        
        Item shorts = new Item();
        shorts.setStrName("Shorts");
        shorts.setDblPrice(75.99);
        
        Item blouse = new Item();
        blouse.setStrName("Blouse");
        blouse.setDblPrice(88.99);
        
      
        //Create a while true loop
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter item name: ");
            String itemName = scan.nextLine();
            
            if (itemName.equalsIgnoreCase("T-shirt")){
                System.out.println(tShirt);
                totalSpent = totalSpent + tShirt.getDblPrice();
                amt = MAX_BUDGET - totalSpent;
                itemCount++;
            } else if (itemName.equalsIgnoreCase("Shoes")){
                System.out.println(shoes);
                totalSpent = totalSpent + shoes.getDblPrice();
                amt = MAX_BUDGET - totalSpent;
                itemCount++;
            } else if (itemName.equalsIgnoreCase("jeans")){
                System.out.println(jeans);
                totalSpent = totalSpent + jeans.getDblPrice();
                amt = MAX_BUDGET - totalSpent;
                itemCount++;
            } else if (itemName.equalsIgnoreCase("Jacket")){
                System.out.println(jacket);
                totalSpent = totalSpent + jacket.getDblPrice();
                amt = MAX_BUDGET - totalSpent;
                itemCount++; 
            } else if (itemName.equalsIgnoreCase("Hat")){
                System.out.println(hat);
                totalSpent = totalSpent + hat.getDblPrice();
                amt = MAX_BUDGET - totalSpent;
                itemCount++;  
            } else if (itemName.equalsIgnoreCase("Shorts")){
                System.out.println(shorts);
                totalSpent = totalSpent + shorts.getDblPrice();
                amt = MAX_BUDGET - totalSpent;
                itemCount++;   
            } else if (itemName.equalsIgnoreCase("Blouse")){
                System.out.println(blouse);
                totalSpent = totalSpent + blouse.getDblPrice();
                amt = MAX_BUDGET - totalSpent;
                itemCount++;    
            } else {
                System.out.println("We don't sell that.");
            }
            //Print out values
            System.out.println("Total Spent So Far: " + totalSpent);
            System.out.println("Item Count: " + itemCount);
            System.out.println("Remaining Budget: " + amt);
            
            //Warn customer if they go over budget
            if (totalSpent > MAX_BUDGET){
                System.out.println("You're over budget!");
            }
            System.out.println("\n");
            }
        }
    }
            
    
    
    
class Item {
    private String strName;
    private double dblPrice;
        
    //Create getters and setters
    public String getStrName(){
        return strName;
    }
        
    public double getDblPrice(){
        return dblPrice;
    }
        
    public void setStrName(String inName){
        strName = inName;
    }
        
    public void setDblPrice(double inPrice){
        dblPrice = inPrice;
    }
    
    //Create toString    
    public String toString(){
        String result = "";
        result = "Item: " + strName + "\n" + "Price: " + dblPrice;
        return result;
    }
}
