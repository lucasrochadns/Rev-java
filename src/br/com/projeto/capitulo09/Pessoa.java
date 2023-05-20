package br.com.projeto.capitulo09;

public class Pessoa {

    private String name;
    private Integer idade;
    private Double altura;

    public Pessoa(String name, Integer idade, Double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Idade: %d, Altura: %.2f", this.name, this.idade, this.altura);
    }
}
