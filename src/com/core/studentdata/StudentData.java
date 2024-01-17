package com.core.studentdata;

public class StudentData {
	private int Id;
	private String Name;
	private int mks_cc;
	private int mks_dd;
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public int Id() {
//	return Id;
//}
//	public String Name() {
//	return Name;
//	}
//	public int mks_cc() {
//		return mks_cc;
//	}
//	public int mks_dd() {
//		return mks_dd;
//	}


	public void setId(int id) {
		Id = id;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setMks_cc(int mks_cc) {
		this.mks_cc = mks_cc;
	}
	public void setMks_dd(int mks_dd) {
		this.mks_dd = mks_dd;
	}
	public void showdata() {
	System.out.println("Id "+Id); 
	System.out.println("Name "+ Name);
	System.out.println("mks_cc "+ mks_cc);
	System.out.println("mks_dd " + mks_dd);
}
}