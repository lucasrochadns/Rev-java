package br.com.projeto.capitulo08;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double areaRectangle(){
        return this.width * this.height;
    }

    public double perimeterRectangle(){
        return 2 * (this.height + this.width);
    }

    public double diagonalRectangle(){
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }
}
