package com.system.payment.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PaymentListener {

    @RabbitListener(queues = "payment.queue")
    public String processPayment(String paymentRequest) {
        try {
            System.out.println("Processando pagamento: " + paymentRequest);

            return "Pagamento processado: " + paymentRequest;
        } catch (Exception e) {
            return "error: " + e.getMessage();
        }
    }
}
