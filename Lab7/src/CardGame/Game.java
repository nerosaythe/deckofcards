package CardGame;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	 ArrayList<Character> start = new ArrayList<Character>(5);
  public Hand handOne = new Hand(start);
  public Hand handTwo = new Hand(start);
 
 public boolean gameON = true;
 
 Player PlayerOne = new Player("name");
 Player PlayerTwo = new Player("name");
	public void main(String[] args)  {
		//asks for player names, initializes players, then loops until ending conditions are met
		Scanner scan = null;
		System.out.println("Please enter a name for player one.");
		Player PlayerOne = new Player(scan.nextLine());
		System.out.println("Please enter a name for player two.");
		Player PlayerTwo = new Player(scan.nextLine());
		
	do {
		Player.takeTurn(gameON);
		 
	} while(gameON);
	
	
}
	 void gameOver(){
		gameON = false;
	}
	
	public void printname(Player player) {
	System.out.println(player.get)
	
	}
	
	 
	 }
