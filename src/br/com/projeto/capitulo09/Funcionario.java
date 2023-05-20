package br.com.projeto.capitulo09;

public class Funcionario {

    private Integer id;
    private String name;
    private Double salary;

    public Funcionario(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void increaseSalary(double percentage) {
        this.salary = this.salary * (1 + (percentage / 100));
        System.out.printf("Updated data: %s, %.2f", this.name , this.salary);
    }
}
