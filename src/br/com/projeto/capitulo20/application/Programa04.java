package br.com.projeto.capitulo20.application;

import br.com.projeto.capitulo20.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Programa04 {
    public static void main(String[] args) {
        List<Product> lista = new ArrayList<>();
        Consumer<Product> aumentaPrice10 = (p) -> p.setPrice(p.getPrice() * 1.1);
        Consumer<Product> print = (p) -> System.out.printf("%s %.2f \n",p.getName(), p.getPrice());

        lista.add(new Product("TV", 900.00));
        lista.add(new Product("Notebook", 1200.00));
        lista.add(new Product("Tablet", 450.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Teclado", 150.00));
        lista.stream().forEach(aumentaPrice10);
        lista.stream().forEach(print);

        lista.stream().forEach(Programa04::retornaNada);
        lista.stream().forEach(print);
        lista.stream().forEach(p -> System.out.println(p.getPrice()));
    }
    static void retornaNada(Product product){
        product.setPrice(product.getPrice() * 1.1);
    }
}
