package com.core.external;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Payment p=ctx.getBean("payment",Payment.class);
		p.pay("123",100);
		
		System.out.println("Enter Choice");

		System.out.println("Master card ");
		System.out.println("Visa card");
	}

}
