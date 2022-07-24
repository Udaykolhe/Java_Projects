package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	void writeData(String string);

	List<Product> readData(String string);

	void addProduct();

}
