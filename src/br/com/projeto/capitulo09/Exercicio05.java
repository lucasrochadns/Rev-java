package br.com.projeto.capitulo09;

import java.util.Scanner;

public class Exercicio05 {
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
        int maior = vector[0];
        int posicao = 0;
        System.out.printf("Numeros pares: ");
        for(int y = 0; y < vector.length; y++){
            if(vector[y] > maior){
                maior = vector[y];
                posicao = y;
            }
        }
        System.out.printf("Maior %d  Posição %d", maior, posicao);
    }
}
