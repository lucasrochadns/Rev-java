package br.com.projeto.capitulo22.application;

import br.com.projeto.capitulo22.entities.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Programa07 {
    public static void main(String[] args) {
        Consumer<Aluno> println = System.out::println;
        List<Aluno> alunos = Arrays.asList(new Aluno("Lucas Rocha"), new Aluno("Anna Clara"), new Aluno("Luciene Jose"),
                new Aluno("Vicente Rocha"), new Aluno("Lucas Rocha"), new Aluno("Luciene Jose"));
        System.out.println("DISTINCT");
        alunos.stream().distinct().forEach(println);
        System.out.println("SKIP E LIMIT");
        alunos.stream().skip(1).limit(4).forEach(println);
        System.out.println("TAKE-WHILE");
        alunos.stream().skip(1L).takeWhile(n -> n.getNome().charAt(0) == 'A').forEach(println);
    }
}
