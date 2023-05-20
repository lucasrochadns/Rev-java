package br.com.projeto.capitulo08;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double netSalary() {
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary = this.grossSalary * (1 + (percentage / 100));
        System.out.printf("Updated data: %s, %.2f", this.name , this.grossSalary - this.tax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return  "name ='" + name + '\'' +
                ", grossSalary = $ " + (grossSalary - tax);

    }
}
