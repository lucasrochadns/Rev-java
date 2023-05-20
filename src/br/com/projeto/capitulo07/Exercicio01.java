package br.com.projeto.capitulo07;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mask = 0b100000;
        System.out.println(mask);
        int n = entrada.nextInt();
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false");
        }
        entrada.close();
    }
}
