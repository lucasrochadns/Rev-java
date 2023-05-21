package br.com.projeto.capitulo22.application;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class Programa01 {
    public static void main(String[] args) {
        /* STREAM PROCESS DATA */
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50, 60);
        System.out.println("ITERATOR ..........");
        Iterator<Integer> num = numeros.iterator();
        while(num.hasNext()){
            System.out.println(num.next());
        }
        System.out.println("METHOD REFERENCE .........");
        numeros.forEach(System.out::println);
    }
}
