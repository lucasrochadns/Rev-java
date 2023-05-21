package br.com.projeto.capitulo21.application;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Programa06 {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (x, y) -> (x + y) / 2;
        BiFunction<Double, Double, String> resultado = (x, y) -> (x + y) / 2 >= 7.0 ? "Aprovado" : "Reprovado";

        System.out.println(media.apply(6.7, 8.8));
        System.out.println(resultado.apply(5.5, 8.7));
        System.out.println(resultado.apply(5.5, 6.7));

        Function<Double, String> conceito = p -> p > 7.0 ? "Aprovado" : "Reprovado";
        System.out.println("Outro exemplo");
        System.out.println(media.andThen(conceito).apply(6.0, 8.5));
        System.out.println(media.andThen(conceito).apply(6.0, 7.5));


    }
}
