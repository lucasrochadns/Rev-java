package br.com.projeto.capitulo05;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Insira o número");
        Scanner entrada = new Scanner(System.in);
        Integer valor01 = entrada.nextInt(); entrada.nextLine();
        if(valor01 >= 0) System.out.printf("Número positivo %d", valor01);
        else System.out.printf("Número negativo %d ", valor01);
    }
}
