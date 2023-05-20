package br.com.projeto.capitulo08;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Student {

    private String name;
    private ArrayList<Double> nota = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNota(Double nota){
        this.nota.add(nota);
    }

    public Double finalGrade(){
        return this.nota.stream().mapToDouble(Double::doubleValue).sum();
    }
}
