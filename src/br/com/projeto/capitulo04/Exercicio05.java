package br.com.projeto.capitulo04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira número do trabalhador");
        Integer valor01 = entrada.nextInt(); entrada.nextLine();
        System.out.println("Insira número de horas");
        Double valor02 = entrada.nextDouble();
        System.out.println("Insira o valor por hora");
        Double valor03 = entrada.nextDouble();
        System.out.printf("Numero: %d Salario: %.2f ",valor01 ,(valor02 * valor03));
    }
}
