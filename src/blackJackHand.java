public class blackJackHand extends Hand {
	Hand cards;
	blackJackHand(boolean dealer){
		super(booleanToNumber(dealer));
	}
	
	blackJackHand(){
		super(0);
	}

	int handValue;
	boolean soft;
	
	private void computeValue() {
		handValue = 0;
		soft = false;
		boolean aces = false;
		for(int i = 0; i < super.numberOfCards(); i++) {
			if(super.nthCard(i).getValue() > 10)
				handValue += 10;
			else
				handValue += super.nthCard(i).getValue();
			if(super.nthCard(i).getValue()==PlayingCard.ACE)
				aces=true;
		}
		if(aces && handValue<12) {
			handValue+=10;
			soft=true;	
		}
		
	}
	
	public void addCard() {
		super.addCard();
		computeValue();
	}
	
	public void addCard(PlayingCard c) {
		super.addCard(c);
		computeValue();
	}
	
	public int handValue() {
		return handValue;
	}
	
	
	public boolean soft() {
		return soft;
	}
	
	private static int booleanToNumber(boolean b) {
		if(b)
			return 1;
		return 2;
	}
}
