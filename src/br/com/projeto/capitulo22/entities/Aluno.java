package br.com.projeto.capitulo22.entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private List<Double> notas = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void addNotas(Double nota) {
        this.notas.add(nota);
    }

    public Double getMedia(){

        return this.notas.stream().reduce(0.0, (n1, n2) -> n1 + n2).doubleValue() / this.notas.size();
    }
}
