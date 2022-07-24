package com.demo.test;


import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProductCrud {

	public static void main(String[] args) {
		    int choise=0;
		 	Scanner sc = new Scanner(System.in);
			ProductService pservice = new ProductServiceImpl();
			do {
				System.out.println("1.Add Product"
						       + "\n2.Delete Product"
					       	   + "\n3.Search Product By Id"
						       + "\n4.Search Product By Name"
	    	  		           + "\n5.Display All"
	    	  		           + "\n6.Sort By Product Name"
	    	  		           + "\n7.Modify Price"
	    	  		           + "\n8.Exit");
		    System.out.println("Enter Choise : ");
			choise=sc.nextInt();
			switch(choise) {
			case 1:
				pservice.addProduct();
				break;
			case 2 :
				System.out.println("Enter Id : ");
				int pid = sc.nextInt();
				boolean status=pservice.deleteById(pid);
				if(status) {
					System.out.println("Sucessfully Delete");
				}else {
					System.out.println("Not Delete");
				}
				break;
			case 3 :
				System.out.println("Enter Id : ");
			    pid = sc.nextInt();
				Product p = pservice.searchById(pid);
				if(p!=null) {
					System.out.println(p);
				}else {
					System.out.println("Record Not Available!");
				}
				break;
			case 4:
				System.out.println("Enter Name : ");
				String nm = sc.next();
				p = pservice.searchByName(nm);
				if(p!=null) {
					System.out.println(p);
				}else {
					System.out.println("Record Not Available!");
				}
				break;
			case 5:
				Set<Product> plst= pservice.displyAll();
				for(Product prd: plst) {
					System.out.println(plst);
				}
				break;
			case 6:
				plst=pservice.sortByName();
				plst.stream().forEach(p1 ->{System.out.println(p1);});
				break;
			
			case 7:
				System.out.println("Enter Id : ");
				pid=sc.nextInt();
				System.out.println("Enter New Price : ");
				Float prc = sc.nextFloat();
				 status=pservice.modifyPrice(pid,prc);
				if(status ) {
					System.out.println("Sucessfully Update Price");
				}
				else {
					System.out.println("Not Update Price--Try Again !");
				}
				break;
			case 8:
				sc.close();
				System.exit(0);
				break;
				default :
					System.out.println("Wrong Choise ! Try Again !");
			}

		}while(choise !=9);
}

	

		 

	}


