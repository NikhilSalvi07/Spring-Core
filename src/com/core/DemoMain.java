package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
	
		//Start the container loads applicationContext.xml	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve the bean from the container
		HelloWorld h=	ctx.getBean("hello",HelloWorld.class); //hello is id which is declare in xml file
		//invoke the method
		System.out.println(h.sayHello());	

	}

}
