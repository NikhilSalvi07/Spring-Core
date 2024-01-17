package com.core.studentdata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Start the container loads applicationContext.xml	
				ApplicationContext ctx=new ClassPathXmlApplicationContext("stdapplicationContext.xml");
				//retrieve the bean from the container
				StudentData sd=	ctx.getBean("std",StudentData.class); //hello is id which is declare in xml file
				//invoke the method
				sd.showdata();	

			}

		}



