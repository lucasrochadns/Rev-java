package br.com.projeto.capitulo08;

public class Triangle {
    private Double xA;
    private Double xB;
    private Double xC;

    public Triangle(Double xA, Double xB, Double xC) {
        this.xA = xA;
        this.xB = xB;
        this.xC = xC;
    }

    public Double areaTriangle (){
        double p = (xA + xB + xC) / 2;
        return Math.sqrt(p *(p - xA) * (p - xB) * (p - xC));
    }
}
