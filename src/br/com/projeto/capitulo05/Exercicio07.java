package br.com.projeto.capitulo05;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um valor");
        Integer valor01 = entrada.nextInt();entrada.nextLine();
        if(valor01 >= 0 && valor01 <= 25){
            System.out.println("[0 - 25]");
        } else if (valor01 > 25 && valor01 <= 50) {
            System.out.println("[26 - 50]");
        } else if(valor01 > 50 && valor01 <= 75){
            System.out.println("[50 - 75]");
        }else {
            System.out.println("[76 - 100]");
        }
    }
}
