package blackJack;

import java.util.Collections;



public class Deck {
	
	public static void main(String[] args){
		

		CardCreation c = new CardCreation();
		c.addCard();
		c.addRoyal();
		Collections.shuffle(c.deck);
		c.blackJack();
	}

}

