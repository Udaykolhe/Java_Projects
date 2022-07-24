package com.demo.service;

	
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
              private ProductDao productDao;
              static  SimpleDateFormat sdf;
              static {
            	  sdf=new SimpleDateFormat("dd/MM/yy");
              }

			public ProductServiceImpl() {
				this.productDao = new ProductDaoImpl(); 
			}

			@Override
			public int addProduct() {
				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter the Product_Id : ");
//				int pid = sc.nextInt(); 
				System.out.println("Enter the Product_Name : ");
				String pname = sc.next();
				System.out.println("Enter the Quantity : ");
				int qty = sc.nextInt();
				System.out.println("Enter the Price : ");
				float price = sc.nextFloat();
				System.out.println("Enter Manufacture  (dd/mm/yy) : ");
				String dt = sc.next();
				Date mfgDate=null;
				try {
					mfgDate=sdf.parse(dt);
				} catch (ParseException e) {
					System.out.println("Wrong Date Formate!");
					e.printStackTrace();
				}
				return	productDao.save(new Product(pname,qty,price,mfgDate));
				
				
			}

				@Override
			public List<Product> displayAll() {
				// TODO Auto-generated method stub
				return productDao.findAll();
			}


			@Override
			public Product getById(int id) {
				return productDao.findById(id);
			}

			@Override
			public boolean deleteById(int id) {
				return productDao.deleteById(id);
			}

			@Override
			public boolean updatePrice(int id, float price) {
				return productDao.updatePrice(id,price);
			}

			@Override
			public List<Product> searchByPname(String nm) {
				return productDao.findByPname(nm);
			}

			@Override
			public void closeConnection() {
				productDao.closeConnection();
				
			}
  
               
               
}
