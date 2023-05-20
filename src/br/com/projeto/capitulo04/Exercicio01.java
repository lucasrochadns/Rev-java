package br.com.projeto.capitulo04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Double valor01;
        Double valor02;
        System.out.println("Insira o primeiro Numero para soma");
        valor01 = entrada.nextDouble();
        System.out.println("Insira o Segundo Numero para soma");
        valor02 = entrada.nextDouble();
        System.out.printf(" Soma e: %.2f", valor01 + valor02);

    }
}
