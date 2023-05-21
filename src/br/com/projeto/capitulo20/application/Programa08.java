package br.com.projeto.capitulo20.application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Programa08 {
    public static void main(String[] args) {
        Consumer<Integer> print = p -> System.out.print(p + " ");
        List<Integer> lista = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 75, 99, 35, 37);

        System.out.println("Elementos da Lista + 10");
        List<Integer> lista02 = lista.stream().map(p -> p + 10).collect(Collectors.toList());
        lista02.stream().forEach(print);

        Integer sum = lista.stream().reduce(0, (p, t) -> p + t);
        System.out.printf("\nSUM \n%d \n", sum);

        System.out.println("Impares");
        List<Integer> impar = lista.stream().filter(p -> p % 2 == 1).collect(Collectors.toList());
        impar.stream().forEach(print);
    }
}
