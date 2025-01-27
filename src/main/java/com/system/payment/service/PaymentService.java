package com.system.payment.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final RabbitTemplate rabbitTemplate;

    public PaymentService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

//    @RabbitListener(queues = "payment.queue")
//    public void processPayment(String saleData) {
//        System.out.println("Payment: Validando pagamento para: " + saleData);
//
//        boolean paymentApproved = true; // Simula a validação do pagamento
//
//        if (paymentApproved) {
//            String exchange = "ecommerce.exchange";
//            String routingKey = "stock.key";
//
//            // Encaminha para o serviço de estoque
//            rabbitTemplate.convertAndSend(exchange, routingKey, saleData);
//        } else {
//            System.out.println("Payment: Pagamento rejeitado!");
//        }
//    }
}
