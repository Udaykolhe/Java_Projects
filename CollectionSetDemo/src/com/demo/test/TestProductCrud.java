package com.demo.test;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Product;
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
				//Create Product
				int n = pservice.addProduct();
				if(n>0) {
					System.out.println("Insertion Done");
				}else {
					System.out.println("Insertion not Done");
				}
				break;
			case 2 :
				System.out.println("Enter Id : ");
				int id=sc.nextInt();
				boolean b=pservice.deleteById(id);
				if(b) {
					System.out.println("Deletion Done : ");
				}else {
					System.out.println("Deletion not Done");
				}
				break;
			case 3 :
				System.out.println("Enter the Id : ");
				id = sc.nextInt();
				Product p=pservice.getById(id);
				if(p!=null){
					System.out.println(p);
				}else {
					System.out.println("Wrong Id");
				}
				break;
			case 4:
				System.out.println("Enter Name : ");
				String nm=sc.next();
				List<Product>  plist=pservice.searchByPname(nm);
				if(plist!=null) {
				  plist.forEach(System.out::println);
				}
				
				break;
			case 5:
				plist=pservice.displayAll();
				if(plist!=null) {
					plist.forEach(System.out::println);
				}else {
					System.out.println("Not Found");
				}
				break;
			case 6:
				
				break;
			
			case 7:
				System.out.println("Enter Id : ");
				id=sc.nextInt();
				System.out.println("Enter Update Price : ");
				float price=sc.nextFloat();
				boolean x=pservice.updatePrice(id,price);
				if(x) {
					System.out.println("Update done");
				}else {
					System.out.println("Not Update");
				}
				break;
			case 8:
				sc.close();
				pservice.closeConnection();
				System.out.println("Thank for Visiting");
				System.exit(0);
				break;
				default :
					System.out.println("Wrong Choise ! Try Again !");
			}

		}while(choise !=9);
}

	

		 

	}


