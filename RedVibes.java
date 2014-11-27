import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RedVibes {
	static int totalCards = 53; 
	static ArrayList<Integer> cards= new ArrayList<Integer>();
	
	/**
	 * Red = 0
	 * Black = 1 
	 * Joker = 2
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Insert the cards. 
		for(int i = 0; i < totalCards; i++) {
			if(i < 26) {
				cards.add(0); //Red cards
			} 
			else if (i > 26){
				cards.add(1); //Black cards
			}
		}
		
		//Inserting the joker.
		cards.add(2);

		//Shuffle the cards
		Collections.shuffle(cards);
			
		game(cards);
	
	}
	
	public static void game(ArrayList<Integer> cards) {
		int pick; 
		int redCount = 0;
		int blackCount = 0;
		int guesses = 0; 
		int correctGuesses = 0; 
		int guess = 0; //Red guess
		for(int i = 0; i < cards.size(); i++) {
			pick = cards.get(i);
			
			if(pick == 0) {
				redCount++;
			} 
			else if(pick == 1) {
				blackCount++; 
			}
			
			if(blackCount < redCount-1 && i > 30) {
				System.out.println("Guessing red: " + guess); 
				System.out.println("Actual card: " + pick);
				if(pick == guess) {
					correctGuesses++;
				}
				guesses++;
			}
		}
		System.out.println("Guesses: " + guesses + ". Correct guesses: " + correctGuesses);
		System.out.println(blackCount + " " + redCount);
	}
}
