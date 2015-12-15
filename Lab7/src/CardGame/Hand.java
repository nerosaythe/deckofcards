package CardGame;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Hand<ListArray> {
	
	public ArrayList<Character> handOne = new ArrayList<Character>(5);
	public ArrayList<Character> handTwo = new ArrayList<Character>(5);
	
	public Hand(ArrayList<Character> hand){
		hand = new ArrayList<Character>(5);
	}
	
	public void displayHand(ArrayList hand){
		if (hand.isEmpty()) {
			System.out.println("Your hand is empty, try drawing a card from the deck");
		}else{
			for (int i = 0;i<hand.size(); i++) {
				System.out.println(hand.listIterator());
			}
		}
	}
	
	
	public boolean isEmpty(ArrayList hand){
		if (hand.isEmpty()) {
		return true;
	} else {
		return false;}
	}
	
	public boolean isFull(ArrayList hand){
		if (hand.size() ==5){
		return true;
			
		} else {
		return false;}	
	}
	public ArrayList addCard(char card, ArrayList hand){
		hand.add(card);
		
		return hand;
		
	}
	
	public void dropCard(int i){
		
		Deck.insertCard('g');
	}
	
	
 
	public boolean sumAndProduct(Hand hand){
		
		
		
		return false;
		
	}
}
