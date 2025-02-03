/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deckofcards;

/**
 *
 * @author cmusick2025
 */
import java.util.*;

public class DeckOfCards {

    public static void main(String[] args) {
        //Establish suits and values
        String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        //Write 2D string array with 4 arrays, each of length 13
        String[][] deckOfCards = new String[4][13];
        
        //Fill the 2D array with cards
        for (int s = 0; s < 4; s++){
            for (int v = 0; v < 13; v++){
                deckOfCards[s][v] = values[v] + " of " + suits[s];
            }
        }
        
        //Shuffle the 2D array
        shuffleDeck(deckOfCards);
        
        //Create 2D array to deal 4 hands of 5 cards each without repetas
        String hands[][] = new String[4][5];
        int cardIndex = 0;
        for (int s = 0; s < 4; s++){
            for (int v = 0; v < 13; v++){
                //Find rows and columns in 2D array
                if (cardIndex < 20){
                    hands[cardIndex / 5][cardIndex % 5] = deckOfCards[s][v];
                    cardIndex++;
                }
            }
        }
        
        //Show hands with labels A, B, C, and D
        char label = 'A';
        for (int s = 0; s < 4; s++){
            System.out.println("Hand " + label + ":");
            for (int v = 0; v < 5; v++){
                System.out.println(hands[s][v]);
            }
            System.out.println();
            label++;
        }
    }
    
//Create shuffling method
    public static void shuffleDeck(String[][] deck){
        Random r = new Random();
        for (int s = 51; s > 0; s--){
            int v = r.nextInt(s + 1);
            //Conert row/column
            int row1 = s / 13, column1 = s % 13;
            int row2 = v / 13, column2 = v % 13;
            //Shuffle cards in 2D array
            String temp = deck[row1][column1];
            deck[row1][column1] = deck[row2][column2];
            deck[row2][column2] = temp;
        }
}
}
