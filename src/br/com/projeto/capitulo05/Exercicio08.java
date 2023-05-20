package br.com.projeto.capitulo05;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira  Renda");
        Double valor01 = entrada.nextDouble();

        if( valor01 > 2000.00 && valor01 <= 3000.00){
            System.out.printf("Renda %.2f -- Imposto 8 = %.2f = %.2f", valor01, valor01 * 0.08 , valor01 * (1 - 0.08));
        } else if (valor01 > 3000.00 && valor01 <= 4500) {
            System.out.printf("Renda %.2f -- Imposto 16  = %.2f = %.2f", valor01, valor01 * 0.16, valor01 * (1 - 0.18));
        } else if (valor01 > 4500.00){
            System.out.printf("Renda %.2f -- Imposto 28 =  %.2f = %.2f", valor01, valor01 * 0.28, valor01 * (1 - 0.28));
        } else {
            System.out.printf("Renda %.2f Insento", valor01);
        }

    }
}
