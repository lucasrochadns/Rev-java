package br.com.projeto.capitulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Enter product data: \nName: ");
        String name = entrada.next();
        System.out.printf("Price: ");
        double price = entrada.nextDouble();
        System.out.printf("Quantity in stock: ");
        int quantity = entrada.nextInt();
        Product product01 = new Product(name, price, quantity);
        System.out.printf("Product data: %s, price unit: %.2f, %d units, Total %.2f", product01.getName(), product01.getPrice(), product01.getQuantity(), product01.TotalValueInStock());
    }
}
