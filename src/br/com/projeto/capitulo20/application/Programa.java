package br.com.projeto.capitulo20.application;

import br.com.projeto.capitulo20.entities.MyComparator;
import br.com.projeto.capitulo20.entities.Product;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        List<Product> lista = new ArrayList<>();
        Comparator<Product> prod = new Comparator<Product>() {

            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        lista.add(new Product("TV", 900.00));
        lista.add(new Product("Notebook", 1200.00));
        lista.add(new Product("Tablet", 450.00));

        lista.sort(new MyComparator());
        lista.sort(prod);
        lista.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        });

        lista.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        lista.stream().forEach(System.out::println);
    }
}
