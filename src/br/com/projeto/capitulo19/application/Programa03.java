package br.com.projeto.capitulo19.application;

import br.com.projeto.capitulo19.entities.Circule;
import br.com.projeto.capitulo19.entities.Rectangle;
import br.com.projeto.capitulo19.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Programa03 {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(3.0, 2.0));
        List<Circule> circules = new ArrayList<>();
        circules.add(new Circule(4.0));
        System.out.println(" Rectangle " + totalArea(rectangles));
        System.out.println(" Circle " + totalArea(circules));
    }

    private static Double totalArea(List<? extends Shape> list) {
        Double sum = 0.0;
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be null ");
        }
        for (Shape sp : list) {
            sum += sp.area();
        }
        return sum;
    }
}
