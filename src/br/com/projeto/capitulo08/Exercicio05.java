package br.com.projeto.capitulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Name: ");
        String name = entrada.nextLine();
        System.out.printf("Nota 01: ");
        double nota01 = entrada.nextDouble();
        System.out.printf("Nota 02: ");
        double nota02 = entrada.nextDouble();
        System.out.printf("Nota 03: ");
        double nota03 = entrada.nextDouble();

        Student student = new Student(name);
        student.addNota(nota01);
        student.addNota(nota02);
        student.addNota(nota03);
        double finalGrade = student.finalGrade();
        if(finalGrade > 69.0){
            System.out.println("PASS");
            System.out.printf("FINAL GRADE: %.2f\n", finalGrade);
        } else {
            System.out.printf("Falied %.2f\n", 70.0 - finalGrade);
        }
    }
}
