package br.com.projeto.capitulo18.entities;

public class People implements Comparable<People>{

    private String name;
    private Double salario;

    public People(){

    }

    public People(String name, Double salario) {
        this.name = name;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Name: %s - Salario: $ %.2f", name, salario);
    }

    @Override
    public int compareTo(People other){
        return name.compareTo(other.name);
    }
}
