package br.com.projeto.capitulo05;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o primeiro número");
        Integer valor01 = entrada.nextInt(); entrada.nextLine();
        System.out.println("Insira o segundo número");
        Integer valor02 = entrada.nextInt(); entrada.nextLine();
        if(valor01 % valor02 == 0 || valor02 % valor01 == 0){
            System.out.printf("Número %d Número %d São Multiplos", valor01, valor02);
        }else{
            System.out.printf("Número %d Número %d Não são Multiplos", valor01,  valor02);
        }
    }
}
