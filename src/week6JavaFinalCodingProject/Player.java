package week6JavaFinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//1. c) Player
	
	//Fields
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	//Methods
	
	public Player(String name1) {
		name = name1;
		score = 0;
	}
	
	public void descibe() {
		System.out.println(name);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	//flip method
	public Card flip() {
		return hand.remove(0);
	}
	
	//draw method
	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}
	
	// increment by 1 
	public void incrementScore() {
		score++;
	}

	public int getScore() {
		return score;
	}
	
	

	



	



}
