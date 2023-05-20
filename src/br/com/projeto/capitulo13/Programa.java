package br.com.projeto.capitulo13;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter01 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("Enter deparment´s name: ");
        String departmentName = scanner.nextLine();
        System.out.println("Enter worker data: ");
        System.out.printf("Name: ");
        String workerName = scanner.nextLine();
        System.out.printf("Level: ");
        String workLevel = scanner.nextLine();
        System.out.printf("Base Salary: ");
        double baseSalary = scanner.nextDouble();
        Worker worker = new Worker(workerName, baseSalary, WorkerLevel.valueOf(workLevel), new Department(departmentName));
        System.out.print("How many contract to this worker? ");
        int quantity = scanner.nextInt();scanner.nextLine();
        for(int x = 0; x < quantity; x++){
            System.out.println("Enter contract# " + x +" data:");
            System.out.print("Date (dd/MM/yyyy)");
            Date contractDate = formatter01.parse(scanner.nextLine());
            System.out.print("");
            System.out.print("Value per Hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duration (hours) ");
            int hours = scanner.nextInt(); scanner.nextLine();
            worker.addContracts(new HourContract(contractDate, valuePerHour, hours));
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/yyyy) ");
        String monthAndYear = scanner.nextLine();
        int months = Integer.parseInt(monthAndYear.substring(0, 2));
        int years = Integer.parseInt(monthAndYear.substring(3, 7));
        System.out.println("Name: "+ worker.getName());
        System.out.println("Department: "+ worker.getDepartment().getName());
        System.out.println("Income for: "+ monthAndYear + " " + String.format("%.2f", worker.income(years, months)));
        scanner.close();
    }
}
