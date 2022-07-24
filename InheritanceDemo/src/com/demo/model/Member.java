package com.demo.model;

public class Member extends Person {
    private String mbr_type;
    private int fees;
    
    public Member() {
    	mbr_type=null;
    	fees = 0;
    }
    
    public Member(int pid,String name,String mobileno,String mbr_type,int fees) {
    	super(pid,name,mobileno);
    	this.mbr_type=mbr_type;
    	this.fees = fees;
    }
    
    //Getter and Setter
    public String getMbr_type() {
		return mbr_type;
	}

	public void setMbr_type(String mbr_type) {
		this.mbr_type = mbr_type;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
	 @Override
	    public String toString() {
	    	return super.toString()+"\nMemberShip_Type = "+mbr_type+"\nFees = "+fees;
	    }
    
}
