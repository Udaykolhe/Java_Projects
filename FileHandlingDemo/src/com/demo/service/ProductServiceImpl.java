package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;

public class ProductServiceImpl implements ProductService {
      private ProductDao productDao;

	public ProductServiceImpl() {
		productDao=new ProductDaoImpl();
	}

	@Override
	public void writeData(String file) {
		productDao.writeData(file);
		
	}

	@Override
	public List<Product> readData(String file) {
		return productDao.readData(file);
		
	}

	@Override
	public void addProduct() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		System.out.println("Enter name: ");
		sc.nextLine();
		String nm=sc.nextLine();
		System.out.println("Enter Quantity");
		int qty = sc.nextInt();
		System.out.println("Enter Price");
		double price=sc.nextDouble();	
		productDao.addProduct(new Product(id,nm,qty,price));
		
	}
}
