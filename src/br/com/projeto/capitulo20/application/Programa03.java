package br.com.projeto.capitulo20.application;

import br.com.projeto.capitulo19.entities.Rectangle;
import br.com.projeto.capitulo20.entities.InterfaceTeste;

public class Programa03 {
    public static void main(String[] args) {
        InterfaceTeste<Rectangle> teste = (p1, p2) -> String.format("Area: %.2f", p1 * p2);
        System.out.println(teste.area(15.0, 23.50));

    }
}
