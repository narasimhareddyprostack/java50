package com.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Product {
	
	@Id
	@GeneratedValue
	private Integer prod_Id;
	@Column
	private String prod_Name;
	private double prod_Price;
	
	//generate setters and getters
	//add default const, parameterized const
	//add to String method
	
	public Integer getProd_Id() {
		return prod_Id;
	}
	public void setProd_Id(Integer prod_Id) {
		this.prod_Id = prod_Id;
	}
	public String getProd_Name() {
		return prod_Name;
	}
	public void setProd_Name(String prod_Name) {
		this.prod_Name = prod_Name;
	}
	public double getProd_Price() {
		return prod_Price;
	}
	public void setProd_Price(double prod_Price) {
		this.prod_Price = prod_Price;
	}
	public Product() {
		super();
	}
	
	public Product(String prod_Name, double prod_Price) {
		super();
		this.prod_Name = prod_Name;
		this.prod_Price = prod_Price;
	}
	public Product(Integer prod_Id, String prod_Name, double prod_Price) {
		super();
		this.prod_Id = prod_Id;
		this.prod_Name = prod_Name;
		this.prod_Price = prod_Price;
	}
	@Override
	public String toString() {
		return "Product [prod_Id=" + prod_Id + ", prod_Name=" + prod_Name + ", prod_Price=" + prod_Price + "]";
	}
	
	
}
