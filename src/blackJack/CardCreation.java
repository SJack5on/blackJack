package blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class CardCreation {

	ArrayList<Card> deck = new ArrayList<Card>();

	public void addCard() {

		String suit = null;
		int value;
		int x = 2;

		for (int i = 0; i < 36; i++) {
			if (x > 10) {
				x = 2;
			}
			value = x;
			x = x + 1;
			if (i < 9) {
				suit = "Hearts";
			}
			if (i >= 9 && i < 18) {
				suit = "Diamonds";
			}
			if (i >= 18 && i < 27) {
				suit = "Clubs";
			}
			if (i >= 27 && i < 36) {
				suit = "Spades";
			}

			Card card = new Card(suit, value);

			deck.add(card);

		}
	}

	public void addRoyal() {
		String suit = null;
		int value = 10;
		String royalCard = null;


		for (int i = 0; i < 16; i++) {

			if ((i == 0 || i == 4) || (i == 8 || i == 12)) {
				royalCard = "Ace";
			}
			if ((i == 1 || i == 5) || (i == 9 || i == 13)) {
				royalCard = "Jack";
			}
			if ((i == 2 || i == 6) || (i == 10 || i == 14)) {
				royalCard = "Queen";
			}
			if ((i == 3 || i == 7) || (i == 11 || i == 15)) {
				royalCard = "King";
			}
			if (i < 4) {
				suit = "Hearts";
			}
			if (i >= 4 && i < 8) {
				suit = "Diamonds";
			}
			if (i >= 8 && i < 12) {
				suit = "Clubs";
			}
			if (i >= 12 && i < 16) {
				suit = "Spades";
			}

			RoyalCard royal = new RoyalCard(suit, value, royalCard);

			deck.add(royal);
			
		}
	}
	
	public void removeCard(String suit, int value){
		
		for(Card c : deck){
			if((c.suit == suit) && (c.value == value)){
				deck.remove(c);
			}
		}
		
	}
	
	public void blackJack(){
		Scanner s = new Scanner(System.in);
		boolean deal = true;
		int  i = 0;
		int sum = 0;
		while (deal == true) {
		    sum = sum + deck.get(i).getValue();
		    System.out.println(sum);
		    if(sum > 21){
		    	System.out.println("You Lose!");
		    	break;
		    }
		    if(sum == 21){
		    	System.out.println("Winner!");
		    	break;
		    }
		    i++;
		    System.out.println("Do you want a new card?");
		    deal = s.nextBoolean();
		    if(deal == false){
			    sum = sum + deck.get(i).getValue();
			    System.out.println("Next card: " + sum);
			    if(sum > 21){
			    	System.out.println("Good Job!");
			    }
			    if(sum < 21){
			    	System.out.println("Aah well...");
			    }
		    }
		}
	    s.close();
	}

}
