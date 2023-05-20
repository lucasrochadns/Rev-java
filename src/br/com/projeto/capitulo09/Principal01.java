package br.com.projeto.capitulo09;

import java.util.Locale;
import java.util.Scanner;

public class Principal01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String resp01 ;
        do {
        System.out.printf("Enter account number: ");
        int numberAccount = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Enter account holder: ");
        String name = scanner.nextLine();
        System.out.printf("Is there na initial deposit: (y/n)? : ");
        String resp = scanner.nextLine();
        double initialDeposit = 0.0;

        if (resp.equalsIgnoreCase("y")) {
            System.out.printf("Enter initial deposit: ");
            initialDeposit = scanner.nextDouble();
        }
        Account account = new Account(numberAccount, name, initialDeposit);
        System.out.println(account);

        System.out.printf("Do you want to do some more operation: (y/n)? : ");
        scanner.nextLine();
        resp01 = scanner.nextLine();

        }while(!resp01.equalsIgnoreCase("n"));

        scanner.close();
    }
}
