package br.com.projeto.capitulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.printf("What is the dollar price? : ");
        double dollarRealTime = entrada.nextDouble();
        System.out.printf("How many dollars will be bought? : ");
        double dollarBought = entrada.nextDouble();
        System.out.printf("Amount to be paid in reais: %.2f", Cotacao.dollarRealTime(dollarBought, dollarRealTime));
    }
}
