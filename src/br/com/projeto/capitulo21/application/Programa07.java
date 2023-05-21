package br.com.projeto.capitulo21.application;

import br.com.projeto.capitulo20.entities.Product;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Programa07 {
    public static void main(String[] args) {

        Product product = new Product("notebook", 2300.00);
        Function<Product, Double> prod = p -> (p.getPrice() * 0.9) > 2500.00 ? p.getPrice() * 1.085 : (p.getPrice() * 0.9);
        UnaryOperator<Double> pr = p -> p > 3000.00 ? p + 100.00 : p + 50.00;
        Function<Double, String> prd = p -> String.format("Price com desconto: %.2f", p);

        System.out.println(prod.andThen(pr).andThen(prd).apply(product));

    }
}
