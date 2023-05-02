package com.poly;

public class Demo2 {
	public static void main(String[] args) {
	SA a1=new SA();
	
	a1.setAcc_Id(101);
	a1.setAcc_Name("Rahul Gandhi");
	a1.setAcc_Bal(5000.00);
	a1.setMin_Bal(500.00);
	a1.cal_Bal();
	
	System.out.println("******");
	CA a2=new CA();
	
	a2.setAcc_Id(501);
	a2.setAcc_Name("Priyanka");
	a2.setAcc_Bal(4000000.00);
	a2.setMin_Bal(25000.00);
	a2.cal_Bal();
	}
}
