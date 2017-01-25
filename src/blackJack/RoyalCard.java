package blackJack;

public class RoyalCard extends Card {

	public RoyalCard(String suit, int value, String royalCard) {
		super(suit, value);
	}

	public String getRoyalCard() {
		return royalCard;
	}

	public void setRoyalCard(String royalCard) {
		this.royalCard = royalCard;
	}

	String royalCard;

}
