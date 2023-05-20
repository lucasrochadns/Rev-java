package br.com.projeto.capitulo18.application;

import br.com.projeto.capitulo18.entities.Contract;
import br.com.projeto.capitulo18.entities.Installment;
import br.com.projeto.capitulo18.services.ContractService;
import br.com.projeto.capitulo18.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        Integer number = scanner.nextInt(); scanner.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data01 = LocalDate.parse(scanner.nextLine(), formatter01);
        System.out.print("Valor do Contrat:  ");
        Double amount = scanner.nextDouble();
        Contract contract = new Contract(number, data01, amount);

        System.out.print("Numero de parcelas: ");
        Integer parcelas = scanner.nextInt();
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, parcelas);
        System.out.println("Parcelas");
        for(Installment installment : contract.getInstallment()){
            System.out.println(installment);
        }

        scanner.close();
    }
}
