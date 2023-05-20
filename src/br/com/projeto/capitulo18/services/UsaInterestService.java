package br.com.projeto.capitulo18.services;

import br.com.projeto.capitulo18.model.InterestService;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService{

    private Double interestRate;

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public Double getInterestRate(){
        return interestRate;
    }
}
