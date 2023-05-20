package br.com.projeto.capitulo08;

import jdk.jshell.execution.Util;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter the measures of trinagle X: ");
        double xA, xB, xC;
        xA = entrada.nextDouble();
        xB = entrada.nextDouble();
        xC = entrada.nextDouble();

        Triangle triangleX = new Triangle(xA, xB, xC);

        System.out.printf("Área: %.4f\n", triangleX.areaTriangle());

        /* Outro exemplo porém criando uma classe utilitario com metodo estatico */
        System.out.printf("Área: %.4f\n", UtilCalculos.areaTriangle(xA, xB, xC));

        entrada.close();
    }
}
