package com.psa.account;

public class Account {
	private double min_Bal;
	private String acc_Name;
	private int acc_Id;
	private String acc_Email;
	
	
	public Account() {
		super();
	}
	
	public Account(int acc_Id) {
		super();
		this.acc_Id = acc_Id;
	}
    
	public Account(double min_Bal, String acc_Name, int acc_Id, String acc_Email) {
		super();
		this.min_Bal = min_Bal;
		this.acc_Name = acc_Name;
		this.acc_Id = acc_Id;
		this.acc_Email = acc_Email;
	}

	//getters & setters
	public double getMin_Bal() {
		return min_Bal;
	}
	public void setMin_Bal(double min_Bal) {
		this.min_Bal = min_Bal;
	}
	public String getAcc_Name() {
		return acc_Name;
	}
	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}
	public int getAcc_Id() {
		return acc_Id;
	}
	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}
	public String getAcc_Email() {
		return acc_Email;
	}
	public void setAcc_Email(String acc_Email) {
		this.acc_Email = acc_Email;
	}

	
	
	
	public static void main(String[] args) {
	Account	a1=new Account();
	a1.setAcc_Id(101);
	a1.setAcc_Name("Rahul Gandhi");
	a1.setAcc_Email("rahul@gmail.com");
	a1.setMin_Bal(500);
	System.out.println(a1.getAcc_Name());
	}
	
	
}
