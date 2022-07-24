package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Product;

public interface ProductDao  {

	int save(Product product);

	List<Product> findAll();

	Product findById(int id);

	boolean deleteById(int id);

	boolean updatePrice(int id, float price);

	List<Product> findByPname(String nm);

	void closeConnection();

}
 