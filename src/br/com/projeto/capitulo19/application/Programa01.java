package br.com.projeto.capitulo19.application;

import br.com.projeto.capitulo19.services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many value? ");
        Integer quantityNumber = scanner.nextInt();
        Integer number;
        PrintService printService = new PrintService();
        for(int x =1; x <= quantityNumber; x++){
            System.out.printf("number %d: ", x);
            number = scanner.nextInt();
            printService.addValue(number);
            System.out.println();
        }
        printService.print();
        scanner.close();
    }
}
