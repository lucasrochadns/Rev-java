package br.com.projeto.capitulo14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Entre com o numero de produtos: ");
        int n = scanner.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Datos do produto #" + i + ":");
            System.out.print("Comum, usado, importado (c/u/i)? ");
            char type = scanner.next().charAt(0);
            System.out.print("Nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Preco: ");
            double price = scanner.nextDouble();
            if (type == 'c') {
                list.add(new Product(name, price));
            }
            else if (type == 'u') {
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            }
            else {
                System.out.print("Taxa de importacao: ");
                double customsFee = scanner.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        scanner.close();
    }
}
