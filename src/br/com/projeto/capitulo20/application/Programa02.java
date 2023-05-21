package br.com.projeto.capitulo20.application;

import br.com.projeto.capitulo20.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Programa02 {
    public static void main(String[] args) {
        List<Product> lista = new ArrayList<>();
        Consumer<Product> print = (p) -> System.out.println(p.getName() + " " + p.getPrice());
        Predicate<Product> maiorQue100 = (p) -> p.getPrice() < 100;

        lista.add(new Product("TV", 900.00));
        lista.add(new Product("Notebook", 1200.00));
        lista.add(new Product("Tablet", 450.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Teclado", 150.00));


        lista.removeIf(maiorQue100);
        lista.removeIf(Programa02::predicado);

        lista.stream().forEach(print);
    }

    static boolean predicado(Product product){
        return product.getPrice() < 200.00;
    }
}
