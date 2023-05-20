package br.com.projeto.capitulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Name: ");
        String name = entrada.nextLine();
        System.out.printf("Gross Salary: ");
        double grossSalary  = entrada.nextDouble();
        System.out.printf("Tax: ");
        double tax = entrada.nextDouble();
        Employee employee01 = new Employee(name, grossSalary, tax);
        System.out.println(employee01);
        System.out.printf("Wich percentage to increase salary? : ");
        double percentage = entrada.nextDouble();
        employee01.increaseSalary(percentage);

    }
}
