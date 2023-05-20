package br.com.projeto.capitulo18.application;

import br.com.projeto.capitulo18.model.InterestService;
import br.com.projeto.capitulo18.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Programa04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount: ");
        Double amount = scanner.nextDouble();
        System.out.print("Months: ");
        Integer months = scanner.nextInt();
        InterestService usaInterestService = new UsaInterestService(1.0);
        System.out.printf("Payment after %d %.2f",months , usaInterestService.payment(amount, months));
        scanner.close();
    }
}
