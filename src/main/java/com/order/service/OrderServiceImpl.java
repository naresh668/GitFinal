package com.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.order.entity.Order;
import com.order.model.Payment;
import com.order.model.TranscationRequest;
import com.order.model.TranscationResponse;
import com.order.repository.OrderRepository;
@Service
public class OrderServiceImpl   implements  OrderService{
	
	
	
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private OrderRepository orderRepo;

	@Override
	public TranscationResponse saveOrder(TranscationRequest request) {
		// TODO Auto-generated method stub
		String message="";
		Order order=request.getOrder();
		Payment payment=request.getPayment();
		payment.setOrderId(order.getId());
		
		payment.setAmount(order.getPrice());
		
		Payment savedPayment=template.postForObject("http://PaymentService/payment/doPayment", payment, Payment.class);
		
		message=savedPayment.getPaymentStatus().equals("success")?"payemt done":"failed";
		
		orderRepo.save(order);

		return new TranscationResponse(order,savedPayment.getAmount(),savedPayment.getTranscationId(),message);
	}

}


















