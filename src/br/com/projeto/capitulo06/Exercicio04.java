package br.com.projeto.capitulo06;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o valor inteiro entre 1 --- 1000");
        Integer valor01 = entrada.nextInt(); entrada.nextLine();
        for(int x = 0; x <= valor01; x++){
            if(x % 2 == 1){
                System.out.printf("%d \n", x);
            }
        }
    }
}
