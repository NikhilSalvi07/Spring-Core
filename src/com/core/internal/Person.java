package com.core.internal;

public class Person {
private int perId;
private String Name;
 Address addr;
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
	return "Person [perId=" + perId + ", Name=" + Name + ", addr=" + addr + "]";
}

 
 
}
