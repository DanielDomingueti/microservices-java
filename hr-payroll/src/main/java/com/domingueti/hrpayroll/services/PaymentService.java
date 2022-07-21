package com.domingueti.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.domingueti.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("Daniel", 287.5, days);
	}
	
}
