package com.demo.beans;

import java.util.Date;


public class Product {
       private int pid;
       private String pname;
       private int qty;
       private float price;
       private Date mfgDate;
      
     
       
	public Product(int pid,String pname, int qty, float price,Date mfgDate) {
		super();
     	this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.mfgDate = mfgDate;
	}
	public Product(String pname, int qty, float price,Date mfgDate) {
		super();
     	this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.mfgDate = mfgDate;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	public int getPid() {
		return pid;
	}
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {

		return "{\n"
				+ "       Product List : \n"
				+ "Product Id : "+pid+ ",\n"
				+ "Product Name : "+pname+ ",\n"
				+ "Quantity : " +qty+",\n"
				+ "Price : "+price+ "\n"
			                             + "}\n";
		
	}
	
	
       
}
