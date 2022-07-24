package com.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {
   private static Connection conn;
 
   private static PreparedStatement pinnst,psel,pgetbyid,pdelbyid,pupdprice,psercbynm;
   static {
	   conn=DBUtil.getMyConnection();
	   
	   try {
		pinnst=conn.prepareStatement("INSERT INTO product (pname,qty,price,mfgDate) VALUES (?,?,?,?)");
		psel=conn.prepareStatement("SELECT * FROM product");
		pgetbyid=conn.prepareStatement("SELECT * FROM product WHERE pid=?");
		pdelbyid=conn.prepareStatement("DELETE FROM product WHERE pid=?");
		pupdprice=conn.prepareStatement("UPDATE product SET price=? WHERE pid=?");
		psercbynm=conn.prepareStatement("SELECT * FROM product WHERE pname=?");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
      
	@Override
	public int save(Product product) {
		try {
//			pinnst.setInt(1,product.getPid());
			pinnst.setString(1, product.getPname());
			pinnst.setInt(2, product.getQty());
			pinnst.setFloat(3, product.getPrice());
			pinnst.setDate(4, (Date) product.getMfgDate());
			return pinnst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Product> findAll() {
		List<Product> plist=new ArrayList<>();
		try {
			ResultSet rs= psel.executeQuery();
			while(rs.next()) {
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),rs.getDate(5)));
			  			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public Product findById(int id) {
		try {
			pgetbyid.setInt(1, id);
			ResultSet rs = pgetbyid.executeQuery();
			if(rs.next()) {
				Product p = new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),rs.getDate(5));
			  return p;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		try {
			pdelbyid.setInt(1, id);
			pdelbyid.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updatePrice(int id,float price) {
		
		try {
			pupdprice.setFloat(1, price);
			pupdprice.setInt(2, id);
			pupdprice.executeUpdate();
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Product> findByPname(String nm) {
		List<Product> plist = new ArrayList<>();
		try {
			psercbynm.setString(1, nm);
			ResultSet rs = psercbynm.executeQuery();
			if(rs.next()) {
				 plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),rs.getDate(5)));
			  return plist;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void closeConnection() {
		if(conn!=null) {
		DBUtil.closeMyConnection();
		}
	}

	@Override
	public com.demo.dao.Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
    

}
