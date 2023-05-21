package br.com.projeto.capitulo22.application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Programa02 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> potencia = numeros.stream().map(n -> (int) Math.pow(n, 2));
        potencia.filter(n -> n % 2 == 0).map(n -> " PAR " + n).forEach(System.out::println);

        Consumer<Object> printf = System.out::printf;
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        String[] maisLangs = {"Python ", "GO", " List", " Perl"};
        Stream.of(maisLangs).forEach(printf);
        // Stream.generate(() -> "a");
        // Stream.iterate(0, n -> n + 1).forEach(printf)



    }
}
