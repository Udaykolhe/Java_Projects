package com.demo.test;
import java.util.Scanner;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

public class TestEmployeeArray {
	
      public static void main (String [] args) {
    	   Scanner sc=new Scanner(System.in);
    	  int choice=0;
    	  do {
    		  
    	  System.out.println("1.Add Employee"
    	  		+ "\n2.Add Member"
    	  		+ "\n3.Search Emplyee BY Name"
    	  		+ "\n4.Search Employee BY Id"
    	  		+ "\n5.Display"
    	  		+ "\n6.Modify sal"
    	  		+ "\n7.Exit");
    	  
    	  System.out.println("Choice : ");
    	     choice=sc.nextInt();
    	  switch(choice) {
    	  case 1:
    		  System.out.println("1.Salaried Employee\n2.ContractEmployee");
    		  System.out.println("Select type of Employee :");
    		  int ch=sc.nextInt();
    		  EmployeeService.addEmployee(ch);
    		  break;
    		  
    	  case 2:
    		  EmployeeService.addMember();
    		  break;
    		  
    	  case 3:
    		  System.out.println("Enter the Name: ");
    		  String nm=sc.next();
    		  Employee e=EmployeeService.searchByName(nm);
    		  if(e!=null) {
    			  System.out.println(e);
    		  }else {
    			  System.out.println("Record Not Found");
    		  }
    		  break;
    		  
    	  case 4:
    		  System.out.println("Enter the perosnId: ");
    		  int pid=sc.nextInt();
    		  e=EmployeeService.searchById(pid);
    		  if(e!=null) {
    			  System.out.println("Employee Record :-\n"+e);
    		  }else {
    			  System.out.println("Record Not Found");
    		  }
    		  
    		  break;
    		
    	  case 5:
    		  EmployeeService.displayAll();
    		  break;
    		  
    	  case 6:
    		  System.out.println("Enter the id");
    		  pid=sc.nextInt();
    		  System.out.println("Enter the  new Salary : ");
    		  double sal=sc.nextInt();
    		  int hr_charges = 0;
    		  boolean status=EmployeeService.modifySalary(pid,sal,hr_charges);
    		  if(status) {
    			  System.out.println("Modification Done");
    		  }else {
    			  System.out.println("Record not found");
    		  }
    		  break;
    		  
    	  case 7:
    		  System.exit(0);
    		  sc.close();
    		  break;
    		  
    	  default :
    	  System.out.println("Wrong choise");
    	  
    	  }
   
    	  }while(choice!=7);
    	  
      }
}
