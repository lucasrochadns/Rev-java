package br.com.projeto.capitulo13;

import java.util.Date;

public class HourContract {

    private Date dateContract;
    private Double valuePerHour;
    private Integer hour;

    public HourContract(){}

    public HourContract(Date dateContract, Double valuePerHour, Integer hour) {
        this.dateContract = dateContract;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public Date getDateContract() {
        return dateContract;
    }

    public void setDateContract(Date dateContract) {
        this.dateContract = dateContract;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double totalValue(){
        return this.valuePerHour * this.hour;
    }
}
