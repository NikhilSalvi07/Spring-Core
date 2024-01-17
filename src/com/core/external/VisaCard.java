package com.core.external;

public class VisaCard implements Card {

	@Override
	public boolean verify(String cardNo) {
		// TODO Auto-generated method stub
		System.out.println("visa card verification complete");
		return true;
	}

}
