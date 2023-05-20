package br.com.projeto.capitulo06;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira quantidade de entradas ");
        ArrayList<Double> valores = new ArrayList<>();
        int valor01 = entrada.nextInt();
        entrada.nextLine();
        for (int x = 0; x < valor01; x++) {
            Double valor02 = entrada.nextDouble();
            Double valor03 = entrada.nextDouble();
            if (valor02 != 0 && valor03 != 0) {
                valores.add(valor02 / valor03);
            } else {
                System.out.println("Divisão impossivel");
            }
        }
        valores.stream().forEach(System.out::println);
    }
}
