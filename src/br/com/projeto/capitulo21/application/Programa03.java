package br.com.projeto.capitulo21.application;

import java.util.function.Predicate;

public class Programa03 {
    public static void main(String[] args) {
        Predicate<Integer> isPar = numero -> numero % 2 == 0;
        Predicate<Integer> isTresDigitos = numero -> numero >= 100 && numero <= 999;

        System.out.println(isPar.and(isTresDigitos).test(124));
        System.out.println(isPar.and(isTresDigitos).negate().test(124));

        System.out.println(isPar.or(isTresDigitos).test(123));
    }
}
