package com.demo.service;

	
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;

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
			public void addProduct() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Product_Id : ");
				int pid = sc.nextInt();
				System.out.println("Enter the Product_Name : ");
				String pname = sc.next();
				System.out.println("Enter the Quantity : ");
				int qty = sc.nextInt();
				System.out.println("Enter the Price : ");
				float price = sc.nextFloat();
				System.out.println("Enter Manufacture  (dd/mm/yy) : ");
				String dt = sc.next();
				Date mfg=null;
				try {
					mfg=sdf.parse(dt);
				} catch (ParseException e) {
					System.out.println("Wrong Date Formate!");
					e.printStackTrace();
				}
				productDao.save(new Product(pid,pname,qty,price,mfg));
				
			}

			@Override
			public Set<Product> displyAll() {
				return productDao.findAll();
			}

			@Override
			public Product searchById(int pid) {
				return productDao.findById(pid);
			}

			@Override
			public Product searchByName(String nm) {
				return productDao.findByName(nm);
			}

			@Override
			public boolean deleteById(int pid) {
				return productDao.deleteById(pid);
			}

			@Override
			public boolean modifyPrice(int pid, Float prc) {
				return productDao.updateNewPrice(pid,prc);
			}

			@Override
			public Set<Product> sortByName() {
				return productDao.sortByName();
			}
               
               
               
}
