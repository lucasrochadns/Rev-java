package br.com.projeto.capitulo04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Double valor01, valor02;
        System.out.println("Insira o primeiro número para subtração");
        valor01 = entrada.nextDouble();
        System.out.println("Insira o segundo número para subtração");
        valor02 = entrada.nextDouble();
        System.out.printf("Subtração e: %.2f", valor01 - valor02);
    }
}
