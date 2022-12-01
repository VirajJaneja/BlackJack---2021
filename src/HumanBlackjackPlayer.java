import java.util.*;

public class HumanBlackjackPlayer extends BlackjackPlayer {
	
	public boolean hit(blackJackHand dealerHand, blackJackHand playerHand) {
		System.out.println("  Dealer Hand:");
		dealerHand.print();
		System.out.println("  Player Hand:");
		playerHand.print();
		int i = 0;
		while(i == 0) {
			System.out.println("Would you like to hit? (please enter yes or no)");
			String input = inputString();
			if(input.equalsIgnoreCase("yes")) {
				i++;
				return true;
			}
			if(input.equalsIgnoreCase("no")) {
				i++;
				return false;
			}
			System.out.println("Please enter either yes or no");
		}
		System.out.println();
		return false;
	}
	
	public void dealerHit(blackJackHand dealerHand) {
		System.out.println("The dealer hit!");
		System.out.println("  Dealer Hand:");
		dealerHand.print();
		System.out.println();

	}
	
	public void playerBusts(blackJackHand playerHand) {
		System.out.println("You busted!");
		System.out.println("  Player Hand:");
		playerHand.print();
		System.out.println("-----------------------");
		System.out.println();
	}
	
	public void playerTies(blackJackHand playerHand, blackJackHand dealerHand) {
		System.out.println("You tied with the dealer!");
		System.out.println("  Dealer Hand:");
		dealerHand.print();
		System.out.println("  Player Hand:");
		playerHand.print();
		System.out.println("-----------------------");
		System.out.println();
	}
	
	public void playerWins(blackJackHand playerHand, blackJackHand dealerHand) {
		System.out.println("You won!");
		System.out.println("  Dealer Hand:");
		dealerHand.print();
		System.out.println("  Player Hand:");
		playerHand.print();
		System.out.println("-----------------------");
		System.out.println();
	}
	
	public void dealerBusts(blackJackHand dealerHand) {
		System.out.println("The dealer busted!");
		System.out.println("  Dealer Hand:");
		dealerHand.print();
		System.out.println("-----------------------");
		System.out.println();
	}
	
	public void dealerWins(blackJackHand dealerHand, blackJackHand playerHand) {
		System.out.println("The dealer won!");
		System.out.println("  Dealer Hand:");
		dealerHand.print();
		System.out.println("  Player Hand:");
		playerHand.print();
		System.out.println("-----------------------");
		System.out.println();
	}
	
	private static String inputString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}
