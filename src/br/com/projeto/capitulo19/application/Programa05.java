package br.com.projeto.capitulo19.application;

import java.util.HashSet;
import java.util.Set;

public class Programa05 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Lucas Rocha");
        set.add("Anna Clara Bernardino Rocha");
        set.add("Luciene José");

        set.stream().forEach(System.out::println);

        System.out.println(set.contains("Lucas Rocha"));

    }
}
