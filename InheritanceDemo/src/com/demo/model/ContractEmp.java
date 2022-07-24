package com.demo.model;

public class ContractEmp extends Employee {
       private int hr_charges;
       private int no_hrs_worked;
       
       public ContractEmp() {
    	   hr_charges=0;
    	   no_hrs_worked=0;
       }
       
       public ContractEmp(int pid,String name,String mobileno,String dept,String desg,int hr_charges,int no_hrs_worked) {
    	   super(pid,name,mobileno,dept,desg);
    	   this.hr_charges=hr_charges;
    	   this.no_hrs_worked=no_hrs_worked;
       }
       
       //Getter and Setter
       public void setHr_charges(int hr_charges) {
    	   this.hr_charges=hr_charges;
       }
       
       public int getHr_charges() {
    	   return hr_charges;
       }
       
       public int getNo_hrs_worked() {
    	   return no_hrs_worked;
       }
       
       public void setNo_hrs_worked(int no_hrs_worked) {
    	   this.no_hrs_worked=no_hrs_worked;
       }
       
       @Override
       public String toString() {
    	   return super.toString()+"\nHours Charges= "+hr_charges+"\nNo of Hours= "+no_hrs_worked;
       }
}
