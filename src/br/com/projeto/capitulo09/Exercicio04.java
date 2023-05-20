package br.com.projeto.capitulo09;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantos numero você vai digitar? :");
        int quantity = scanner.nextInt(); scanner.nextLine();
        int[] vector = new int[quantity];

        for(int x = 0; x < vector.length; x++){
            System.out.printf("digite um numero: ");
            int numero = scanner.nextInt();scanner.nextLine();
            vector[x] = numero;
        }
        int quantityPares = 0;
        System.out.printf("Numeros pares: ");
        for(int y : vector){
            if(y % 2 == 0){
                quantityPares += 1;
                System.out.printf("%d ", y);
            }
        }
        System.out.printf("\nQuantidade de pares %d", quantityPares);
    }
}
