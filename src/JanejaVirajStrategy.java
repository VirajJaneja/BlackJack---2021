//Viraj Janeja

public class JanejaVirajStrategy extends BlackjackStrategy {
	public boolean hit(int handValue, int dealerHandValue, boolean soft) {
		if(handValue == 19 && dealerHandValue <19)
			return false;
		if(handValue < 14)
			return true;
		if(handValue<19 && soft)
			return true;
		if(dealerHandValue == 20 && handValue <20)
			return true;
		if(dealerHandValue == 21 && handValue<21)
			return true;
		return false;
	}
	
	public String author() {
		return "Viraj J.";
	}
	public String playerName() {
		return "Viraj J's Strategy";
	}
}
