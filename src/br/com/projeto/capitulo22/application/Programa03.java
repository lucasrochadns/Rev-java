package br.com.projeto.capitulo22.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programa03 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 20, 21);
        List<Integer> filtrada = lista.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        filtrada.forEach(Programa03::printf);
    }

    static void printf(Object obj){
        System.out.println(obj);
    }
}
