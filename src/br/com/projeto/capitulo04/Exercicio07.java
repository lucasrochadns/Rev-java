package br.com.projeto.capitulo04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada =  new Scanner(System.in);
        Double valor_A, valor_B, valor_C;
        System.out.println("Insira o valor 1");
        valor_A = entrada.nextDouble();
        System.out.println("Insira o valor 2");
        valor_B = entrada.nextDouble();
        System.out.println("Insira o valor 3");
        valor_C = entrada.nextDouble();
        System.out.printf("Triangulo: %.2f \n", valor_A * valor_C / 2);
        System.out.printf("Circulo: %.2f \n", Math.PI * Math.pow(valor_C, 2.0));
        System.out.printf("Trapezio: %.2f \n", ((valor_A + valor_B) * valor_C) / 2);
        System.out.printf("Quadrado: %.2f \n", valor_B * valor_B);
        System.out.printf("Retangulo: %.2f \n", valor_A * valor_B);
    }
}
