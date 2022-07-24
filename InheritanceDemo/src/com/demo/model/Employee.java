package com.demo.model;

public class Employee extends Person {
       private String dept;
       private String desg;
   
       //Default Constructor
       //1 Implicit 0 Explicit
       public Employee() {
   	         dept=null;
   		     desg=null;
      }
       
     //Parameterized Constructor
       //1 implicit 3 explicit
       public Employee(int pid,String name,String mobileno,String dept,String desg) {
    	    super(pid,name,mobileno);
    		this.dept=dept;
    		this.desg=desg;
       }
       
       //Getter and Setter
       
       public void setDept(String dept) {
     	  this.dept=dept;
       }
       public String getDept() {
     	  return dept;
       }
       
       public void setDesg(String desg) {
      	  this.desg=desg;
        }
        public String getDesg() {
      	  return desg;
        }
        
        @Override
           public String toString() {
        	return super.toString()+"\nDepartment = "+this.dept+"\nDesigntion = "+this.desg;
        }
}


