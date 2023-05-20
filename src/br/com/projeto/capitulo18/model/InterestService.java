package br.com.projeto.capitulo18.model;

import java.security.InvalidParameterException;

public interface InterestService {

    public Double getInterestRate();

    default Double payment(Double amount, Integer quantity) {
        if(quantity < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100, quantity);
    }
}
