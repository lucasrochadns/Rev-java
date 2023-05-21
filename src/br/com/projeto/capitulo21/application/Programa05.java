package br.com.projeto.capitulo21.application;

import java.util.function.UnaryOperator;

public class Programa05 {
    public static void main(String[] args) {
        UnaryOperator<Integer> potencia = p -> (int) Math.pow(p, 2);
        UnaryOperator<Integer> maisDois = p -> p + 2;
        UnaryOperator<Integer> vezesDois = p -> p * 2;

        System.out.println(potencia.andThen(maisDois).andThen(vezesDois).apply(10));
        System.out.println(potencia.compose(maisDois).compose(vezesDois).apply(10));

    }
}
