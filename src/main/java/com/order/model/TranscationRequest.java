package com.order.model;

import com.order.entity.Order;

public class TranscationRequest {

	
	
	
	private Order order;
	
	
	private Payment payment;


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}
