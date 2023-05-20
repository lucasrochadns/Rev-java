package br.com.projeto.capitulo04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Double valor01;
        System.out.println("Informe o raio do circulo");
        valor01 = entrada.nextDouble();
        System.out.printf("Área e:  %.2f ", Math.PI * Math.pow(valor01, 2.0));
    }
}
