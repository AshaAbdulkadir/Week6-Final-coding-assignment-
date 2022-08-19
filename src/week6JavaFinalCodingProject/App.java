package week6JavaFinalCodingProject;

import java.util.Scanner;

//2. Class App with main method
public class App {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//3. Intantiate a deck and 2 players &call shuffle method
		
		Deck deck = new Deck();
		Player playerA = new Player("Player A");
		Player playerB = new Player("Player B");
		deck.Shuffle();
		
		//4. iterate 52 times using a traditional for loop
		
		for (int i= 0; i< 52; i++) {
			if (i%2 == 0) {
				playerA.draw(deck);
			} else {
				playerB.draw(deck);
			}
		}
		
		//5. iterate 26 times using traditional for loop
		
		for (int i= 0; i< 26; i++) {
			
			//call flip method on players
			Card playerACard = playerA.flip();
			Card playerBCard = playerB.flip();
			
			//call incrementScore method on players with higher value card
			if (playerACard.getValue() > playerBCard.getValue()) {
				playerA.incrementScore();
			} else if (playerACard.getValue() < playerBCard.getValue()){
				playerB.incrementScore();
			}
			
		}
		
		
		//final score after comparison
		
		if (playerA.getScore() > playerB.getScore()) {
			System.out.println("The winner is PlayerA!");
		} else if (playerA.getScore() < playerB.getScore()) {
			System.out.println("the winner is PlayerB");
		}else {
			System.out.println("It is a DRAW!");
		}

	}

}
