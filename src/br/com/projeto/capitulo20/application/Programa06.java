package br.com.projeto.capitulo20.application;

import br.com.projeto.capitulo20.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Programa06 {
    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();
        lista.add(new Product("TV", 900.00));
        lista.add(new Product("Notebook", 1200.00));
        lista.add(new Product("Tablet", 450.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Teclado", 150.00));

        double sum = filterSum(lista, p -> p.getPrice() >= 100.00);
        System.out.println(sum);
    }

    public static double filterSum(List<Product> prod, Predicate<Product> criteria){
        double sum = 0.0;
        for(Product p : prod){
            if(criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
