package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Product;

public interface ProductService {

	int addProduct();
	List<Product> displayAll();
	Product getById(int id);
	boolean deleteById(int id);
	boolean updatePrice(int id, float price);
	List<Product> searchByPname(String nm);
	void closeConnection();


}
