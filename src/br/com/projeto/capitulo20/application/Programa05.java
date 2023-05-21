package br.com.projeto.capitulo20.application;

import br.com.projeto.capitulo20.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Programa05 {
    public static void main(String[] args) {
        List<Product> lista = new ArrayList<>();
        Function<Product, String> saida = p -> String.format("%s, %.2f", p.getName(), p.getPrice()).toUpperCase();

        lista.add(new Product("TV", 900.00));
        lista.add(new Product("Notebook", 1200.00));
        lista.add(new Product("Tablet", 450.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Teclado", 150.00));

        List<String> texto = lista.stream().map(saida).collect(Collectors.toList());
        texto.stream().forEach(System.out::println);

    }


}
