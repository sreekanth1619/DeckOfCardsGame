package deckofcards;

import java.util.ArrayList;
/**
 * Purpose  - We have to Initialize the size of Deck of cards
 * @version - 16.0
 * 
 */
public class DeckOfCardsGame {
	 public ArrayList<String> cardsDeck = new ArrayList<>();
	  /*
      Simply created a Welcome Message Method without any return type.
      */
	    public void welcome(){
	        System.out.println("Welcome to the gaming world of Deck of Cards");
	    }
	    /*
        In this method we have initialized the size of cards.
        */
	    public void deckOfCards(){
	        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
	        
	        int numOfCards = suits.length * ranks.length;
	        
	        for (int i = 0; i < ranks.length; i++) {
	        for (int j = 0; j < suits.length; j++) {
	        	
	        cardsDeck.add(ranks[i] + "===>" + suits[j]);
	    }
	    }   
	    }	
        }
