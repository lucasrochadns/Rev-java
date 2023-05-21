package br.com.projeto.capitulo21.application;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.List;
public class Programa04 {
    public static void main(String[] args) {
        Supplier< List<String>> umaList = () -> Arrays.asList("10", "20", "30", "Lucas Rocha", "Anna Clara", "5");
        System.out.println(umaList.get());
    }
}
