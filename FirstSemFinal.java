/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstsemfinal;

/**
 *
 * @author cmusick2025
 */

/**
 * Goal: Create a simple math quiz to test the user's math ability using classes, methods, loops, conditionals, etc.
 * Main Class (FirstSemFinal)
 *      Contain main method to start the math quiz game
 * Handle main logic of game in MathQuiz class
 *      Include methods like startQuiz
 *          Welcome user
 *          Ask the question
 *          Determine whether they want to continue playing
 *      askQuestion method
 *          Randomly generate num1 and num2
 *          Randomly generate operation (+, -, *, /)
 *          Print question
 *          Check user's answer
 *          Add to overall score
 *          Correct wrong answers
 *      checkInput method
 *          Ensure robustness by checking validity of input (making sure it's a number)
 */

import java.util.*;

public class FirstSemFinal {
    //Start math quiz game
    public static void main(String[] args) {
        MathQuiz quiz = new MathQuiz();
        quiz.startQuiz();
    }
}

//Establish private variables for score and input
class MathQuiz{
    private int score;
    private final Scanner scan;
    
    //Constructor
    public MathQuiz(){
        //Initialize variables
        score = 0;
        scan = new Scanner(System.in);
    }
    
    //Create method to start the quiz
    public void startQuiz(){
        System.out.println("Welcome to the Fun Math Quiz! Let's begin!");
        boolean keepPlaying  = true;
        //Determine whether or not user wants to keep playing
        while (keepPlaying){
            askQuestion();
            System.out.println("Keep playing? (y/n): ");
            String response = scan.next().toLowerCase();
            if (response.equals("n")){
                keepPlaying = false;
            }
        }
        //Print final score when done playing
        System.out.println("Thanks for playing! Final score: " + score);     
    }
    
    //Create method to make and ask quiz question
    public void askQuestion(){
        //Create variables for numbers, operation, correct answer, and symbol
        int num1 = (int) (Math.random() * 10 + 1);
        int num2 = (int) (Math.random() * 10 + 1);
        int operation = (int) (Math.random() * 4);
        int correct = 0;
        String symbol = "";
        
        //Create conditional to determine correct answer based on random operation
        if (operation == 0){
            correct = num1 + num2;
            symbol = "+";
        } else if (operation == 1){
            correct = num1 - num2;
            symbol = "-";
        } else if (operation == 2){
            correct = num1 * num2;
            symbol = "*";
        } else if (operation == 3){
            //Make sure division is possible and simple
            while (num2 == 0 || num1 % num2 != 0){
                num1 = (int) (Math.random() * 10 + 1);
                num2 = (int) (Math.random() * 10 + 1);
            }
            correct = num1 / num2;
            symbol = "/";
        }
        //Print question and get user's answer
        System.out.println("What is " + num1 + " " + symbol + " " + num2 + "?");
        //Check answer
        int userAnswer = checkInput();
        //Conditional for returning output
        if (userAnswer == correct){
            System.out.println("You got it right!");
            score++;
        } else 
            System.out.println("Incorrect! The right answer is " + correct); 
    }
    //Check user input to ensure validity
    private int checkInput(){
        while (true){
            if (scan.hasNextInt()){
                return scan.nextInt();
            } else {
                System.out.println("Invalid input. Please try again");
                scan.next();
            }
        }
    }
}
