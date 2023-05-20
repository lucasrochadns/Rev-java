package br.com.projeto.capitulo09;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar ? : ");
        int quantity = scanner.nextInt(); scanner.nextLine();
        int[] vector = new int[quantity];
        for(int x = 0 ; x < vector.length; x++){
            vector[x] = scanner.nextInt();scanner.nextLine();
        }
        int soma = 0;
        System.out.printf("Valores ");
        for(int y : vector){
            soma += y;
            System.out.printf("%d ", y);
        }
        System.out.printf("\nSOMA %d\nmedia: %d", soma, soma / vector.length);
        scanner.close();
    }
}
