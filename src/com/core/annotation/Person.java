package com.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//stereotype Annotation  such as @component,repository,@Controler,@Service



@Component("person")
public class Person {
	@Value("10")
	private int perId;
	@Value("java")
	private String Name;
	@Autowired //automatic injection into bean
	private Address addr;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [perId=" + perId + ", Name=" + Name + "]";
	}
	
	//@Component
	//equivalent to
	//<bean id="per " class="com.core.annotation.Person">
	
	//@Value("123")
	//int perId;
	
	//same as
	//<property name="perId" Value="123">
	
	

}
