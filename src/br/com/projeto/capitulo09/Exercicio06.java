package br.com.projeto.capitulo09;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Lucas Rocha");
        listaDeNomes.add("Luciene Santos");
        listaDeNomes.add("Pedro");
        listaDeNomes.add("Thiago");
        listaDeNomes.add("Anna Clara");
        listaDeNomes.stream().forEach(System.out::println);
        System.out.printf("\n\n------\n");
        listaDeNomes.removeIf(x -> x.charAt(0) == 'T');
        listaDeNomes.stream().forEach(System.out::println);
        System.out.printf("\n\n------\n");
        String nome = listaDeNomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
        System.out.printf("\n\n------\n");
        List<String> nomes = listaDeNomes.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
        nomes.stream().forEach(System.out::println);
    }
}
