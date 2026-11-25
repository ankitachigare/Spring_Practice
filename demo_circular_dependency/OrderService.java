package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentservice;
    OrderService(PaymentService paymentservice){
        this.paymentservice=paymentservice;
    }
    public void orderPlaced(){
        paymentservice.pay();
        System.out.println("Order placed.");
    }
}
