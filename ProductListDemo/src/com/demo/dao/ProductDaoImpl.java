package com.demo.dao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.demo.model.Product;

public class ProductDaoImpl implements ProductDao {
    public static Set<Product> phset ;
    static {
    	phset = new HashSet<>();
    }
    
	@Override
	public void save(Product product) {
		phset.add(product);
		
	}

	@Override
	public Set<Product> findAll() {
		return phset;
	}

	@Override
	public Product findById(int pid) {
		/*
		 * for(Product p : phset) 
		 * {
		 *  if(p.getPid()==pid) {
		 *   return p; } }
		 */
		Optional<Product> op=phset.stream().filter(p->p.getPid()==pid).findFirst();
		 if(op.isPresent()) {
			 return op.get();
		 }
		return null;
	}

	@Override
	public Product findByName(String nm) {
//		for(Product pname : phset) {
//		   return pname;
//		}
		Optional<Product> op1 = phset.stream().filter(pname->(pname.getPname().equals(pname))).findFirst();
		if(op1.isPresent()) {
			return op1.get();
		}
		return null;
	}

	@Override
	public boolean deleteById(int pid) {
		Scanner sc = new Scanner(System.in);
		Product p = findById(pid);
		if(p!=null) {
			System.out.println(p);
			System.out.println("Do you want to Delete details y/n");
			String ans = sc.next();
		}
		return phset.remove(new Product(pid));
		  	
	}

	@Override
	public boolean updateNewPrice(int pid, Float prc) {
		Product p =findById(pid);
		if(p!=null) {
			p.setPrice(prc);
			return true;
		}
		return false;
	}

	@Override
	public Set<Product> sortByName() {
		Comparator<Product> cmp =(p1,p2)-> {return p1.getPname().compareTo(p2.getPname());};
		Set<Product> ts =new TreeSet<>();
		for(Product p : phset) {
			ts.add(p);
		}
		return ts;
		 
	}

}
