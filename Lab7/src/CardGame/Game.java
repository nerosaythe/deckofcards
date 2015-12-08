package CardGame;

public class Game {

	public static void main(String[] args)  {
		
	}
	boolean loop = true;
	do {
		printMenu();
		switch(getInteger("")){
			case 1:
				createPlayer();
				break;
			case 2:
				createStudent();
				break;
			case 3:
				createBuilding();
				break;
			case 4:
				createClass();
				break;
			case 5:
				assignStudentToClass();
				break;
			default:
				loop = false;
		} 
	} while(loop);
	input.close();
	
}
	
	
	 private void checkWinner() {
	        dealer.peak().reveal();        // time to reveal dealer's card
	        dealer.draw(draw);
	        main.repaint();
	        if      (gambler.value() >  21)             status.setText("Gambler busts");
	        else if (dealer.value()  >  21)             status.setText("Dealer busts");
	        else if (gambler.value() == dealer.value()) status.setText("Push");
	        else if (gambler.value() >  dealer.value()) status.setText("Gambler wins");
	        else                                        status.setText("Dealer wins");
	        System.out.println(status.getText());

}
	 }
	 }
