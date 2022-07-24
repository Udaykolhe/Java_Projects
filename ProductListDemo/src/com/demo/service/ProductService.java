package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.model.Product;

public interface ProductService {

	void addProduct();

	Set<Product> displyAll();

	Product searchById(int pid);

	Product searchByName(String nm);

	boolean deleteById(int pid);

	boolean modifyPrice(int pid, Float prc);

	Set<Product> sortByName();

}
