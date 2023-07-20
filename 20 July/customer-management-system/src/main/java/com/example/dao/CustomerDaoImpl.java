package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.model.Customer;

import lombok.Data;

@Data

@Repository
@EnableTransactionManagement
public class CustomerDaoImpl implements CustomerDao {
	
	private final EntityManager entityManager;
	
	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		TypedQuery<Customer> query = entityManager.createQuery("FROM Customer C", Customer.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		entityManager.persist(customer);
	}

}
