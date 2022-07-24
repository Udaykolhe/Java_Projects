package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.model.Product;

public interface ProductDao  {

	void save(Product product);

	Set<Product> findAll();

	Product findById(int pid);

	Product findByName(String nm);

	boolean deleteById(int pid);

	boolean updateNewPrice(int pid, Float prc);

	Set<Product> sortByName();

}
 