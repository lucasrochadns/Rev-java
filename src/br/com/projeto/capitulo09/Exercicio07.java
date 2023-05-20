package br.com.projeto.capitulo09;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();
        System.out.printf("How many employees will be registered?  ");
        int quantity = scanner.nextInt(); scanner.nextLine();

        for (int contador = 1; contador <= quantity; contador++) {
            System.out.printf("\nEmplyoee #%d:", contador);
            System.out.printf("\nID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            while(hasId(listaDeFuncionarios, id)) {
                System.out.print("Id already taken. Try again: ");
                id = scanner.nextInt();scanner.nextLine();
            }
            System.out.printf("\nName: ");
            String name = scanner.nextLine();
            System.out.printf("\nSalary:");
            double salary = scanner.nextDouble();
            listaDeFuncionarios.add(new Funcionario(id, name, salary));
        }
        System.out.printf("\nEnter the employee id that will have salary increase: ");
        int id = scanner.nextInt();scanner.nextLine();
        Funcionario funcionario = listaDeFuncionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(funcionario == null){
            System.out.println("This id does exist! ");
        } else {
            System.out.printf("\nEnter the percentage: ");
            double percentage = scanner.nextDouble();
            funcionario.increaseSalary(percentage);
        }
        System.out.printf("\n");
        listaDeFuncionarios.stream().forEach(System.out::println);

        scanner.close();
    }

    private static boolean hasId(List<Funcionario> funcionario, int id){
        Funcionario funcionario01 = funcionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionario01 != null;
    }
}
