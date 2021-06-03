package com.order.model;

import com.order.entity.Order;

public class TranscationResponse {
	
	
	
	
	
	
	
	
	
	
	private Order order;
	
	
	private double amount;
	
	private String transcationId;
	
	
	private String message;
	
	

	public TranscationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTranscationId() {
		return transcationId;
	}

	public void setTranscationId(String transcationId) {
		this.transcationId = transcationId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TranscationResponse(Order order, double amount, String transcationId, String message) {
		super();
		this.order = order;
		this.amount = amount;
		this.transcationId = transcationId;
		this.message = message;
	}
	

}
