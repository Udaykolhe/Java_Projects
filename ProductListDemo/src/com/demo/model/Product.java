package com.demo.model;

import java.util.Date;
import java.util.Objects;

public class Product {
       private int pid;
       private String pname;
       private int qty;
       private float price;
       private Date mfgDate;
      
       public Product(int pid) {
     	  this.pid=pid;
       }
       
	public Product(int pid, String pname, int qty, float price, Date mfgDate) {
		super();
		this.pid = pid;
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
	public void setPid(int pid) {
		this.pid = pid;
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
	public int hashCode() {
		return Objects.hash(pid);
	}

	@Override
	public boolean equals(Object p) {
		if(pid != ((Product)p).pid) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
       
}
