package br.com.projeto.capitulo06;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o numero interações");
        ArrayList<Double> valores = new ArrayList<>();
        int valor01 = entrada.nextInt();entrada.nextLine();
        for(int x = 0; x < valor01; x++){
            Double media = 0.0;
            for(int y = 0; y < 3; y++){
             media += entrada.nextDouble();
            }
            valores.add(media /  3);
        }
        valores.stream().forEach(System.out::println);
    }
}
