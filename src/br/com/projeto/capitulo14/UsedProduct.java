package br.com.projeto.capitulo14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product{

    private LocalDate manufactureDate;
    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return super.getName() + String.format(" $ %.2f ",super.getPrice()) +  "(Manufacture date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
