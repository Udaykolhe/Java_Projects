package com.demo.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestObjectStream {

	public static void main(String[] args) {
		ProductService pservice=new ProductServiceImpl();
		 //WriteFile
            pservice.writeData("productdata.txt");
            
         //ReadFile
            List<Product> plst= pservice.readData("productdata.txt");
            plst.stream().forEach((System.out::println));
            
         //AddProduct Into File   
            pservice.addProduct();
            pservice.writeData("productdata.txt");
            plst= pservice.readData("productdata.txt");
            plst.stream().forEach((System.out::println));
            
	}

}
