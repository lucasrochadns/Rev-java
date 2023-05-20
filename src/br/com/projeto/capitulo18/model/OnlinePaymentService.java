package br.com.projeto.capitulo18.model;

public interface OnlinePaymentService {
    public Double paymentFee(Double amount);
    public Double interest (Double amount, Integer months);
}
