package br.com.projeto.capitulo19.entities;

public class Product implements Comparable<Product>{

    public String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product: %s Price: $ %.2f", name, price);
    }

    @Override
    public int compareTo(Product other) {
        return this.price.compareTo(other.getPrice());
    }
}
