package br.com.projeto.capitulo05;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira hora inicial");
        Integer valor01 = entrada.nextInt(); entrada.nextLine();
        System.out.println("Insira hora final");
        Integer valor02 = entrada.nextInt(); entrada.nextLine();
        Integer duracao = 0;

        if(valor01 >= 0 && valor01 <= 24 && valor02 >= 0 && valor02 <= 24){
            duracao = valor01 < valor02 ? valor02 - valor01 : 24 - (valor01 - valor02);
        }
        System.out.printf(" Horas jogadas %d ", duracao);

    }
}
