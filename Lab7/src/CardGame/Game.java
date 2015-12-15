package CardGame;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	 ArrayList<Character> start = new ArrayList<Character>(5);
 Hand handOne = new Hand(start);
 Hand handTwo = new Hand(start);
 
 public boolean gameON = true;
 
 Player PlayerOne = new Player(null, "name");
 Player PlayerTwo = new Player(null, "name");
	public void main(String[] args)  {
		//asks for player names, initializes players, then loops until ending conditions are met
		Scanner scan = null;
		System.out.println("Please enter a name for player one.");
		Player PlayerOne = new Player(handOne, scan.nextLine());
		System.out.println("Please enter a name for player two.");
		Player PlayerTwo = new Player(handTwo, scan.nextLine());
		
	do {
		Player.takeTurn();
		 
	} while(gameON);
	
	
}
	 void gameOver(){
		gameON = false;
	}
	
	
	 
	 }
