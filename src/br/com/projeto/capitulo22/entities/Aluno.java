package br.com.projeto.capitulo22.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " Media: " + getMedia();
    }
}
