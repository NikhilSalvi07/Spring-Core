package com.core.external;

public class Payment {
	private Card card;//refe to the interface Card
    //cons setter getter

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	public void pay(String cardNo,int amt){
		if(card.verify(cardNo))
			System.out.println("Payment Sucessful" + amt);
		

}
	
}
