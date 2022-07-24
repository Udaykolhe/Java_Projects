package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {

	void writeData(String file);

	List<Product> readData(String file);

	void addProduct(Product product);

}
