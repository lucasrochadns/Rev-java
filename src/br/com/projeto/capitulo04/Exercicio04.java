package br.com.projeto.capitulo04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Double valor01, valor02, valor03, valor04;
        System.out.println("Informe o primeiro número");
        valor01 = entrada.nextDouble();
        System.out.println("Informe o segundo número");
        valor02 = entrada.nextDouble();
        System.out.println("Informe o terceiro número");
        valor03 = entrada.nextDouble();
        System.out.println("Informe o quarto número");
        valor04 = entrada.nextDouble();
        System.out.printf("%.2f ", ((valor01 * valor02) - (valor03 * valor04)));
    }
}
