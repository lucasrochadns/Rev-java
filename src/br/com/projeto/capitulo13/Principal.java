package br.com.projeto.capitulo13;

import java.time.LocalDate;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Order order01 = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        Order order02 = new Order(1081, new Date(), OrderStatus.valueOf("PENDING_PAYMENT"));


        System.out.println(order01);
        System.out.println(order02);


    }
}
