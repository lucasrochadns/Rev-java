package br.com.projeto.capitulo18.services;

import br.com.projeto.capitulo18.model.TaxService;

public class BrazilTaxService implements TaxService {


    public Double tax(Double amount){
        return amount * 0.15;
    }
}
