package com.sheltonfragoso.springbootionicbackend.services;

import org.springframework.mail.SimpleMailMessage;

import com.sheltonfragoso.springbootionicbackend.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
