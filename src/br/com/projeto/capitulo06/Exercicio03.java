package br.com.projeto.capitulo06;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = entrada.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
            }
            else if (tipo == 2) {
                gasolina = gasolina + 1;
            }
            else if (tipo == 3) {
                diesel = diesel + 1;
            }

            tipo = entrada.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        entrada.close();
    }
}
