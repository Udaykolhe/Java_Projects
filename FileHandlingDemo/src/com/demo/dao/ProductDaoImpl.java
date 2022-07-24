package com.demo.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Product;

public class ProductDaoImpl implements ProductDao {
        static List<Product> plist;
        static {
        	plist=new ArrayList<>();
        	plist.add(new Product(101,"Mobile",5,25000));
        	plist.add(new Product(102,"Laptop",5,25000));
        	plist.add(new Product(103,"Keyboard",5,25000));
        	
        }
		@Override
		public void writeData(String file) {
			try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("productdata.txt"));)
			{
				for(Product p : plist)
				oos.writeObject(p);
			} catch(FileNotFoundException e) {
				e.getMessage();
			}
			catch (IOException e) {
				e.getMessage();
				e.printStackTrace();
			}
			
		}
		@Override
		public List<Product> readData(String file) {
			List<Product> data=new ArrayList<>();
			try(ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file)))
			{
				while(true) {
				Product p=(Product)ois.readObject();
				data.add(p);
				
			}
			} 
			 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(EOFException e) {
				System.out.println("File Readed end Of file.....");
				return data;
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	
		}
		@Override
		public void addProduct(Product product) {
			plist.add(product);
			
		}
       
}
