package br.com.projeto.capitulo19.entities;

public class Circule extends Shape{

    private Double radius;

    public Circule() {
    }

    public Circule(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
