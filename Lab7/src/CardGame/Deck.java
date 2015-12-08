package CardGame;

public class Deck {
	public static int [] scrap;
	public Deck() {
		
		
		
		//deck initialized
		int [] deck = new int [52];
	
		String[] ranks = {"Ace", "2", "3","4","5","6","7","8","9","10", "Jack", "Queen", "King"};
			for (int i = 0; i < deck.length; i++)
				deck[i]= i;
		//deck shuffled
		for (int i = 0; i < deck.length; i++) {
		      int index = (int)(Math.random() * deck.length);
		      int temp = deck[i];
		      deck[i] = deck[index];
		      deck[index] = temp;
		}

    public void insertCard(Player player) {
    	player.drop()
    }

	}
    public void drawCard(Player player) {
      player.dealTo(Deck.dealFrom());
      player.draw(draw);
      main.repaint();
    
    
    
   
    }    
}
	
