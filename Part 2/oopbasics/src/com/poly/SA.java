package com.poly;

public class SA extends Account {
	private double min_Bal;
	public double getMin_Bal() {
		return min_Bal;
	}
	public void setMin_Bal(double min_Bal) {
		this.min_Bal = min_Bal;
	}
	public void cal_Bal() {
		double bal = this.getAcc_Bal();
		bal = bal-this.getMin_Bal();
		System.out.println("Account Name:"+this.getAcc_Name()+"Bal is:" + bal);
	}
	
}
