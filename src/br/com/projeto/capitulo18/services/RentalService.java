package br.com.projeto.capitulo18.services;

import br.com.projeto.capitulo18.entities.CarRental;
import br.com.projeto.capitulo18.entities.Invoice;
import br.com.projeto.capitulo18.model.TaxService;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        long minutos = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double horas = minutos / 60;
        double basicPayments;
        if(horas <= 12L){
            basicPayments = pricePerHour * Math.ceil(horas);
        } else {
            basicPayments = pricePerDay * Math.ceil(horas / 24);
        }

        carRental.setInvoice(new Invoice(basicPayments, taxService.tax(basicPayments)));
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
