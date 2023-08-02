package org.example.service;

import java.sql.SQLException;
import java.util.List;

import org.example.dao.ProductDao;
import org.example.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	private final ProductDao productDao;
	
	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	@Override
	public Product createProduct(Product product) throws SQLException {
		// TODO Auto-generated method stub
		return productDao.createProduct(product);
	}

	@Override
	public List<Product> getAllProducts() throws SQLException {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	@Override
	public Product findById(String productId) throws SQLException {
		// TODO Auto-generated method stub
		List<Product> products = productDao.getAllProducts();
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

	@Override
	public void updateProduct(Product product) throws SQLException {
		// TODO Auto-generated method stub
		productDao.updateProduct(product);
	}

	@Override
	public void deleteById(String productId) throws SQLException {
		// TODO Auto-generated method stub
		productDao.deleteById(productId);
	}
}
