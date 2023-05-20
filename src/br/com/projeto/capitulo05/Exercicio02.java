package br.com.projeto.capitulo05;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira Número");
        Integer valor01 = entrada.nextInt();entrada.nextLine();
        if(valor01 % 2 == 1){
            System.out.printf("Numero impar %d", valor01);
        }else{
            System.out.printf("Numero par %d", valor01);
        }
    }
}
