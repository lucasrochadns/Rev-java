package br.com.projeto.capitulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter rectangle width and height: ");
        double width = entrada.nextDouble();
        double height = entrada.nextDouble();

        Rectangle rectangle01 = new Rectangle(width, height);
        System.out.printf("AREA =  %.2f\n", rectangle01.areaRectangle());
        System.out.printf("PERIMETER =  %.2f\n", rectangle01.perimeterRectangle());
        System.out.printf("DIAGONAL = %.2f\n", rectangle01.diagonalRectangle());

        entrada.close();
    }
}
