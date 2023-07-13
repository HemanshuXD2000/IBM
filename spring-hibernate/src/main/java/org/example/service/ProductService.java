package org.example.service;

import java.sql.SQLException;
import java.util.List;

import org.example.entity.Product;

public interface ProductService {
	
	Product createProduct(Product product) throws SQLException;
	List<Product> getAllProducts() throws SQLException;
	Product findById(String productId) throws SQLException;
	void  updateProduct(Product product) throws SQLException;
	void deleteById(String productId) throws SQLException;

}
