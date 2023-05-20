package br.com.projeto.capitulo07;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        String valor02;
        do {
            System.out.printf("Digite a temperatura em Celsius: ");
            Double valor01 = entrada.nextDouble();
            System.out.printf("\nEquivalente em Fahrenheit: %.2f \n", 32 + (valor01 * 9) / 5 );
            System.out.printf("Deseja Continuar S/N ");
            valor02 = entrada.next();
        }while(!valor02.equalsIgnoreCase("n"));
    }
}
