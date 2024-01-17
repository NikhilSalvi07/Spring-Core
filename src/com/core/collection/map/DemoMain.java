package com.core.collection.map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.core.collection.map.Question;

public class DemoMain {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Question collmap=(Question)factory.getBean("collmap");  
	    collmap.displayInfo();  

	}

}
