package CardGame;

import java.util.ArrayList;


public class Player {
    
	
	// Declare private variables
	private static ArrayList handOne;
	private static ArrayList handTwo;
	private static int pickUp;
	private static int drop;
    private static int turnOver;
    private static int sum;
    public int playercount =0  ;
    // Constructor.  Create an empty hand of cards.
	public Player(){
	
		Hand hand = new Hand(handOne);
	}
	
	 /**
     * Constructor.  Create an empty hand of cards with the 
     * name variable.
     */
	public Player(String name){
		if (playercount == 0){
			Hand hand = new Hand(handOne);
			playercount ++;
		}else{ 
		  Hand hand = new Hand(handTwo);
		}
	}
	// Method takeTurn to add a card and to remove a card
	public static boolean takeTurn(boolean score){
	
		ArrayList <Integer>handOne = new ArrayList<Integer>();
	
		ArrayList<Integer>handTwo = new ArrayList<Integer>();
	
		handOne.add(0);
		handOne.add(1);
		handOne.add(2);
		handOne.add(3);
		handOne.add(4);
		handOne.size();
	
		handTwo.add(0);
		handTwo.add(1);
		handTwo.add(2);
		handTwo.add(3);
		handTwo.add(4);
		handTwo.size();
		
		
		for (int i = 0; handOne.size() < 4; i++){
			for (int j = 0; handTwo.size() < 4; j++){
				if (handOne.isEmpty() && handTwo.isEmpty()){
					handOne.remove(i - 4);
					handTwo.remove(i - 4);
				} else {
					handOne.get(i + 1);
					handTwo.get(j + 1);
					System.out.println(handOne.get(i + 1) + handTwo.get(j + 1));
				
				}
				if (handOne.get(i + 4) == handTwo.get(i + 4)){
					handOne.get(i + 0);
					handTwo.get(j + 0);
				} else {
					handOne.remove(i - 1);
					handTwo.remove(j - 1);
					System.out.println(handOne.remove(i - 1) + handTwo.remove(j - 1));
				}
			}
		}	
		return score = false;
	}
	
	// Method displayHand to display the hand to player one and player two
	public static boolean displayHand(ArrayList hand, ArrayList hand1){
		ArrayList playerOne = new ArrayList(4);
		playerOne.add(0);
		playerOne.add(1);
		playerOne.add(2);
		playerOne.add(3);
		playerOne.add(4);
		playerOne.size();
		
		ArrayList playerTwo = new ArrayList(4);
		playerTwo.add(0);
		playerTwo.add(1);
		playerTwo.add(2);
		playerTwo.add(3);
		playerTwo.add(4);
		playerTwo.size();
		
		for (int i = 0; playerOne.size() < 4; i++){
			for (int j = 0; playerTwo.size() < 4; j++){
				if (playerOne.size() == 0){
					playerOne.get(i + 4);
				}else{
					if (playerOne.size() == 1){
						playerOne.get(i + 3);
					}else{
						if (playerOne.size() == 2){
							playerOne.get(i + 2);
							}else{
								if (playerOne.size() == 3){
									playerOne.get(i + 1);
								}else{
									if (playerOne.size() == 4){
										playerOne.get(i + 0);					}
									}
									if (playerTwo.size() == 0){
										playerTwo.get(j + 4);
										}else{
											if (playerTwo.size() == 1){
												playerTwo.get(j + 3);
											}else{
												if (playerTwo.size() == 2){
													playerTwo.get(j + 2);
													}else{
														if (playerOne.size() == 3){
															playerTwo.get(j + 1);
														}else{
															if (playerOne.size() == 4){
																playerTwo.get(j + 0);
										
															}
														}
												}		
											}
										}
							}
					}
				}
			}
		}
		return false;
	}
	
	// getName method
	public String getName(String name){
		return name;
	}
	
	// pickUpAndDrop method to pick up or drop a card
	public static int pickUpAndDrop(int card){
		
		switch(card){
			case 1: pickUp = 1;
			break;
			default: drop = 2;
		
			if (card != 1 && card != 2){
				System.out.println("You have enterend an incorrect number. "
						+ "Please choose 1 to pick up a card or 2 to drop a card.  " + 
						card);
		
			break;
			}
		}
		return card;
	}
	
	// Drop method to either draw or drop a card
	public static void Drop(ArrayList droppedCard){
		ArrayList dropped = new ArrayList(4);
		
		dropped.add(0);
		dropped.add(1);
		dropped.add(2);
		dropped.add(3);
		dropped.add(4);
		dropped.size();
		
		for (int i = 0; dropped.size() < 4; i++){
			for(int j = 0; dropped.size()< 4; j++){
				if (dropped.size() == (i)){
					System.out.println("Which card would you like to take? ");
					switch(dropped.size()){
		 			case 1: dropped.remove(i - 1);
						break;
					case 2: dropped.get(i + 1);
						break;
					default: if(dropped.size() == (i - 1)){
								System.out.println("You have dropped a card from the player's hand. ");
							}else{
								if (dropped.size() == (i + 1)){
									System.out.println("You have picked a card from the player's hand. " );
								}else{
									System.out.println("Invalid Entry. Please pick from the player's hand. ");
								}
							}
								
					}
					if (dropped.size() == (j)){
						System.out.println("Which card would you like to take? ");
						switch(dropped.size()){
			 			case 1: dropped.remove(j - 1);
							break;
						case 2: dropped.get(j + 1);
							break;
						default: if(dropped.size() == (j - 1)){
									System.out.println("You have dropped a card from the player's hand. ");
								}else{
									if (dropped.size() == (j + 1)){
										System.out.println("You have picked a card from the player's hand. " );
									}else{
										System.out.println("Invalid Entry. Please pick from the player's hand. ");
									}
								}
						}
					}
				}
			}
		}
	}
	
	// CompleteTurn method to return true if target is met and false if target is not met
	public static boolean completeTurn(boolean target){
		target = true;
		if (target){
			turnOver += sum;
			return target;
			}else{
				return false;
			}
	}
}
 