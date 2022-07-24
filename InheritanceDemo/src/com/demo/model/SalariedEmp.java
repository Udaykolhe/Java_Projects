package com.demo.model;
public class SalariedEmp extends Employee{
     private double sal;
     private double bonus;
     
      public SalariedEmp() {
    	  sal=0.0;
    	  bonus=0.0;
      }
      
      public SalariedEmp(int pid,String name,String mobileno,String dept,String desg,double sal,double bonus) {
    	  super(pid,name,mobileno,dept,desg);
    	  this.sal=sal;
    	  this.bonus=bonus;
      }
      
      //Getter and Setter
      public void setSal(double sal) {
    	  this.sal=sal;
      }
      
      public double getSal() {
    	  return sal;
      }
      
      public void setBonus(double bonus) {
    	  this.bonus=bonus;
      }
      public double getBonus() {
    	  return bonus;
      }
      
      
      @Override
      public String toString() {
    	  return super.toString()+"\nSalary = "+sal+"\nBonus = "+bonus;
      }
      
}
