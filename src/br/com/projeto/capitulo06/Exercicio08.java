package br.com.projeto.capitulo06;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INFORME O VALOR");
        int valor01 = entrada.nextInt(); entrada.nextLine();
        for(int x = 0; x < valor01; x++){
            if(valor01 % x == 0){
                System.out.println(x);
            }
        }

    }
}
