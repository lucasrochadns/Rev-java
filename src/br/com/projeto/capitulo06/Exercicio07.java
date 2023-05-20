package br.com.projeto.capitulo06;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fatorial = entrada.nextInt(); entrada.nextLine();
        int valor01 = 1;
        for(int x = 1; x <= fatorial; x++) {
            valor01 = valor01 * x;
        }
        System.out.println(valor01);



    }
}
