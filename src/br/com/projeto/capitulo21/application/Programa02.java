package br.com.projeto.capitulo21.application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Programa02 {
    public static void main(String[] args) {
        /*Composição de funcao entrada de um metodo tem que ser entrada do outro */
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        Function<String, String> oResultadoE = s -> "O valor e: " + s;
        Function<String, String> empolgado = s -> s + "!!!";

        String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(40);
        System.out.println(resultadoFinal);


    }
}
