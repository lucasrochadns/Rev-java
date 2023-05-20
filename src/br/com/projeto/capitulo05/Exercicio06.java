package br.com.projeto.capitulo05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira quantidade de Minutos utilizados");
        Integer valor01 = entrada.nextInt(); entrada.nextLine();

        if(valor01 > 100){
            System.out.printf("Valor a ser pago R$ %.2f",  50.0 + ((valor01 - 100) * 2.0));
        } else {
            System.out.printf("Valor a ser pago R$ 50.00 ");
        }

    }
}
