package org.example.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("productFactory")
public class ProductFactory {
	private Connection conn = null;
	private final DataSource dataSource;
	
	@Autowired
	public ProductFactory(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public Connection getMyConnection() throws SQLException{
		conn = dataSource.getConnection();
		return conn;
	}
}
