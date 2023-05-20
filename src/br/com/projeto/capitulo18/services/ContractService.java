package br.com.projeto.capitulo18.services;

import br.com.projeto.capitulo18.entities.Contract;
import br.com.projeto.capitulo18.entities.Installment;
import br.com.projeto.capitulo18.model.OnlinePaymentService;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double basicQuota = contract.getTotalValue() / months;
       for(int x = 1; x <= months; x++){
           LocalDate dueDate = contract.getData().plusMonths(x);
           double interest = onlinePaymentService.interest(basicQuota, x);
           double fee = onlinePaymentService.paymentFee(basicQuota + interest);
           double quota = basicQuota + interest + fee;
           contract.addInstallments(new Installment(dueDate, quota));
       }
    }
}
