
public class ComputerBlackjackPlayer extends BlackjackPlayer {
	private BlackjackStrategy strat;
	ComputerBlackjackPlayer(BlackjackStrategy theStrategy){
		strat = theStrategy;
	}
	public boolean hit(blackJackHand dealerHand, blackJackHand playerHand) {
		return strat.hit(playerHand.handValue(), dealerHand.handValue(), playerHand.soft());
	}
}
