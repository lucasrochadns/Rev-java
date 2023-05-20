package br.com.projeto.capitulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius = entrada.nextDouble();
        System.out.printf("Circumference:  %.2f\n", Calculator.circumference(radius));
        System.out.printf("Volume:  %.2f\n", Calculator.volume(radius));
        System.out.printf("PI value:  %.2f\n", Calculator.PI);
    }
}
