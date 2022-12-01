import java.util.*;

public class Hand {
	private ArrayList<PlayingCard> Cards = new ArrayList<PlayingCard>();
	public Hand(int initialCards) {
		Cards = new ArrayList<PlayingCard>();
		for(int i = 0; i<initialCards; i++) {
			addCard();
		}
	}	
	
	public int numberOfCards() {
		return Cards.size();
	}
	
	public PlayingCard nthCard(int n) {
		return Cards.get(n);
	}
	
	public void print() {
		for(PlayingCard c : Cards) {
			System.out.println(c);
		}
	}
	
	public void addCard(PlayingCard c) {
		Cards.add(c);
	}
	
	public void addCard() {
		PlayingCard c = new PlayingCard();
		Cards.add(c);
	}
}
