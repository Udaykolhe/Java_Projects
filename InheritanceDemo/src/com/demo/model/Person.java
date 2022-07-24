package com.demo.model;
public class Person {
      private int pid;
      private String name;
      private String mobileno;
      
      //Default Constructor
      //1 implicit 0 explicit
      public Person() {
    	  pid=0;
    	  name=null;
    	  mobileno=null;
      }
      
      //Parameterized Constructor
      //1 implicit 3 explicit
      public Person(int pid,String name,String mobileno) {
    	  this.pid=pid;
    	  this.name=name;
    	  this.mobileno=mobileno;
      }
      
      public void setPid(int pid) {
    	  this.pid=pid;
      }
      public int getPid() {
    	  return pid;
      }
      public void setName(String name) {
    	  this.name=name;
      }
      public String getName() {
    	  return name;
      }
      public void setmobileno(String mobileno) {
    	  this.mobileno=mobileno;
      }
      public String getMobileno() {
    	  return mobileno;
      }
      
      @Override
      public String toString() {
    	  return "PersonId = "+this.pid+"\nName = "+this.name+"\nMobileNo = "+this.mobileno;
      }
}
