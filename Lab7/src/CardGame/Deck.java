package CardGame;
import java.util.ArrayList;
import java.util.Collections;
public class Deck {
	public ArrayList<Character> deck = new ArrayList(52);
	public ArrayList<Character> scrap = new ArrayList(52);

	@SuppressWarnings("unchecked")
	public Deck() {
		//deck initialized
		
		deck.add(0, 'A');
		deck.add(1, 'A');
	    deck.add(2, 'A');
	    deck.add(3, 'A');
	    deck.add(4, '2');
	    deck.add(5, '2');
	    deck.add(6, '2');
	    deck.add(7 ,'2');
	    deck.add(8, '3');
	    deck.add(9, '3');
	    deck.add(10,'3');
	    deck.add(11,'3');
	    deck.add(12,'4');
	    deck.add(13,'4');
	    deck.add(14,'4');
	    deck.add(15,'4');
	    deck.add(16,'5');
	    deck.add(17,'5');
	    deck.add(18,'5');
	    deck.add(19,'5');
	    deck.add(20,'6');
	    deck.add(21,'6');
	    deck.add(22,'6');
	    deck.add(23,'6');
	    deck.add(24,'7');
	    deck.add(25,'7');
	    deck.add(26,'7');
	    deck.add(27,'7');
	    deck.add(28,'8');
	    deck.add(29,'8');
	    deck.add(30,'8');
	    deck.add(31,'8');
	    deck.add(32,'9');
	    deck.add(33,'9');
	    deck.add(34,'9');
	    deck.add(35,'9');
	    deck.add(36,'0');
	    deck.add(37,'0');
	    deck.add(38,'0');
	    deck.add(39,'0');
	    deck.add(40,'J');
	    deck.add(41,'J');
	    deck.add(42,'J');
	    deck.add(43,'J');
	    deck.add(44,'Q');
	    deck.add(45,'Q');
	    deck.add(46,'Q');
	    deck.add(47,'Q');
	    deck.add(48,'K');
	    deck.add(49,'K');
	    deck.add(50,'K');
	    deck.add(51,'K');	 
			//deck shuffled
	    shuffle();
		}

	
    public void insertCard(char insert) {
    	//should be invoked with a character, adds that character to the scrap deck
    	scrap.add(insert);	
    }

	
    public char drawCard(Player player) {
   // draws card from deck, returns as a character, will shuffle in scrap deck if needed
      if (deck.isEmpty()) {
    	  swapDecks();
    	    }
      char draw = (char) deck.get(0);
      deck.remove(0);
	return draw;
   
      
      
      
    }    
    public boolean isEmpty() {	
    	//performs an .isEmpty check on the deck ArrayList and returns a boolean
    	boolean empty = false;
    	if (deck.isEmpty())
    		empty = true;
    	return empty;
    }
    
    public void swapDecks (){
    	//swaps deck for scrap deck and shuffles, complete with feedback
        for(int i = 0; i<51; i++) 
       	 deck.add(i, scrap.get(i));
         System.out.println("Deck has been swapped!");
         shuffle();
         scrap.clear();
     
    }
    public void shuffle() {
    	//shuffles the deck three times as instructed, prints a message
    	Collections.shuffle(deck);
    	Collections.shuffle(deck);
    	Collections.shuffle(deck);
    	System.out.println("Deck has been shuffled!");
    }
    
}
	
