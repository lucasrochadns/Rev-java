package br.com.projeto.capitulo13;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Worker {

    private String name;
    private Double baseSalary;
    private WorkerLevel workerLevel;
    private Department department;

    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {

    }

    public Worker(String name, Double baseSalary, WorkerLevel workerLevel, Department department) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.workerLevel = workerLevel;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContracts(HourContract hourContract) {
        contracts.add(hourContract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double income(Integer year, Integer month) {
        Calendar data = Calendar.getInstance();
        Double sum = 0.0;
        for (HourContract contract : contracts) {
            data.setTime(contract.getDateContract());
            int yearX = data.get(Calendar.YEAR);
            int monthX = data.get(Calendar.MONTH) + 1;
            System.out.println(monthX + " " + yearX);
            System.out.println(month + " " + year);

            if (year == yearX && month == monthX) {
                sum += contract.totalValue();
            }
        }
        return sum + baseSalary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", workerLevel=" + workerLevel +
                ", department=" + department +
                '}';
    }
}
