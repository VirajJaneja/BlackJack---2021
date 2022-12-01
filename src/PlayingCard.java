import java.util.*;

public class PlayingCard {
	private int suit;
	private int value;
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	public static final int HEARTS = 1;
	public static final int CLUBS = 2;
	public static final int DIAMONDS = 3;
	public static final int SPADES = 4;
	private static boolean random = true;
	
	public PlayingCard(int n1, int n2) {
		suit = n1;
		value = n2;
	}
	
	public PlayingCard() {
		if(random == true) {
			suit = (int)(Math.random()*4 + 1);
			value = (int)(Math.random() * 13 +1);
		} else {
			System.out.println("Please enter the suit.");
			suit = Integer.parseInt(inputString());
			System.out.println("Please enter the value (1-13): ");
			value = Integer.parseInt(inputString());
		}
	}
	
	public int getValue() {
		return value;
	}
	public int getSuit() {
		return suit;
	}
	public void setRandom(boolean b) {
		random = b;
	}
	
	public String toString() {
		String s = value + " of ";
		if(value == ACE || value > 10) {
			if(value ==ACE)
				s = "A of ";
			if(value == JACK)
				s = "J of ";
			if(value == QUEEN)
				s = "Q of ";
			if(value == KING)
				s = "K of ";
		}
		if(suit == HEARTS)
			s += "Hearts";
		if(suit == SPADES)
			s += "Spades";
		if(suit == CLUBS)
			s += "Clubs";
		if(suit == DIAMONDS)
			s += "Diamonds";
		return s;	
	}
	
	private static String inputString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
}
