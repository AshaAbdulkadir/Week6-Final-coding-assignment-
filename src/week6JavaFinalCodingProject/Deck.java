package week6JavaFinalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//1. b) Deck
	
	//Fields
	List<Card> cards =new ArrayList<Card>();
	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	
	
	
	//Methods
	public void Shuffle() {
		Collections.shuffle(cards);	
	}

	public Card draw() {
		return cards.remove(0);
	}
	
	public Deck() {
		for (int i= 2; i < 15; i++) {
			for (String suit : suits) {
				cards.add(new Card(i, suit));
			}
		}
	}

}
