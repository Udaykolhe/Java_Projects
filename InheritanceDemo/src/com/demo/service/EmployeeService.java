package com.demo.service;

import java.util.Scanner;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.Member;
import com.demo.model.Person;
import com.demo.model.SalariedEmp;

public class EmployeeService  {
      static Employee[] earr;
      static Person[] parr;
      static int cnt;
      static {
          earr=new Employee[2];
          parr=new Person[2];
          cnt=0; 
      }
      
      
      public static void addEmployee(int ch) {
    	  Scanner sc = new Scanner (System.in);
    	  System.out.println("Enter the Person_Id : ");
    	  int pid=sc.nextInt();
    	  System.out.println("Enter the Name : ");
    	  String name=sc.next();
    	  System.out.println("Enter the Mobile_No : ");
    	  String mobileno=sc.next();
    	  System.out.println("Enter the Department : ");
    	  String dept=sc.next();
    	  System.out.println("Enter the Designation : ");
    	  String desg=sc.next();
    	  if(ch==1) {
    		  System.out.println("Enter Salary : ");
    		  double sal=sc.nextDouble();
    		  System.out.println("Enter Bonus : ");
    		  double bonus=sc.nextDouble();
    		  earr[cnt] = new SalariedEmp(pid,name,mobileno,dept,desg,sal,bonus);
    	          cnt++;
    	  }
    	  else {
    		  System.out.println("Enter hours Charges : ");
    		  int hr_charges=sc.nextInt();
    		  System.out.println("Enter No of hours work : ");
    		  int no_hrs_worked=sc.nextInt();
    		 earr[cnt] =  new ContractEmp(pid,name,mobileno,dept,desg,hr_charges,no_hrs_worked);
    	             cnt++;
    	  }
    	   
      }
      
      public static void displayAll() {
    	  for(int i=0 ; i<cnt ;i++) {
    		  System.out.println(earr[i]);
    	  }
      }
      public static Employee searchByName(String nm) {
    	  for(int i=0;i<cnt;i++) {
    		  if(earr[i].getName().equals(nm)) {
    			  return earr[i];
    		  }
     }
    	  return null;
      }
      
      public static Employee searchById(int id) {
    	  for(int i=0;i<cnt;i++) {
    		  if(earr[i].getPid()==id) {
    			  return earr[i];
    		  }
     }
    	  return null;
      }
      
      public static boolean modifySalary(int id,double s,int hr_charges) {
    	  Employee e =searchById(id);
    	  if(e!=null) {
    		  if(e instanceof SalariedEmp) {
    			((SalariedEmp) e).setSal(s);
    			return true;
    		  }else {
    			  ((ContractEmp) e).setHr_charges(hr_charges);
    			  return true;
    		  }
    	  }
    	  return false;
      }
      public static  void addMember() {
    	  Scanner sc = new Scanner (System.in);
    	  System.out.println("Enter the Person_Id : ");
    	  int pid=sc.nextInt();
    	  System.out.println("Enter the Name : ");
    	  String name=sc.next();
    	  System.out.println("Enter the Mobile_No : ");
    	  String mobileno=sc.next();
    	  System.out.println("Enter the Membership Type : ");
    	  String mbr_type = sc.next();
    	  System.out.println("Enter the Membership Fees : ");
    	  int fees=sc.nextInt();
    	  parr[cnt]=new Member(pid,name,mobileno,mbr_type,fees);
    	  System.out.println(parr[cnt]);
      }
      
      
}
