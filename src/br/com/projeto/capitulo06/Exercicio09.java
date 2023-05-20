package br.com.projeto.capitulo06;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira quantidade linhas");
        int valor01 = entrada.nextInt(); entrada.nextLine();

        for(int x = 1; x <= valor01; x++){
            System.out.printf(" %d %.2f %.2f ", x, Math.pow(x, 2), Math.pow(x, 3));
        }

        entrada.close();
    }
}
