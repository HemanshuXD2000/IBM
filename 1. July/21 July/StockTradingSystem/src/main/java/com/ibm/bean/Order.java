package com.ibm.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order")
public class Order {
	
	@Id
	@Column(name="order_no")
	private int orderNo; 

	@ManyToOne
	private Stock stock; 
	
	@Column(name="action")
	private String action; 

	@Column(name="quantity")
	private int qunatity; 

	@Column(name="amount")
	private double amount; 

	@Column(name="commision")
	private double commission;

	public Order(int orderNo, Stock stock, String action, int qunatity, double amount, double commission) {
		super();
		this.orderNo = orderNo;
		this.stock = stock;
		this.action = action;
		this.qunatity = qunatity;
		this.amount = amount;
		this.commission = commission;
	}
	

	

}
