package br.com.projeto.capitulo21.application;

import br.com.projeto.capitulo20.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
 * CHECK
 * @see https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
*/
public class Programa01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Consumer<Product> printf = p -> System.out.printf("Name: %s - Price: $ %.2f Discount: %.2f Price final: %.2f \n",
                p.getName(), p.getPrice(), p.getPrice() * 0.15, p.getPrice() * 0.85);
        List<Product> lista = new ArrayList<>();
        lista.add(new Product("TV", 900.00));
        lista.add(new Product("Notebook", 1200.00));
        lista.add(new Product("Tablet", 450.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Teclado", 150.00));
        lista.forEach(printf);

    }
}
