package com.core.collection.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Question colllist=(Question)factory.getBean("colllist");  
	    colllist.displayInfo();  


	}

}
