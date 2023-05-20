package br.com.projeto.capitulo18.application;

import br.com.projeto.capitulo18.entities.CarRental;
import br.com.projeto.capitulo18.entities.Invoice;
import br.com.projeto.capitulo18.entities.Vehicle;
import br.com.projeto.capitulo18.services.BrazilTaxService;
import br.com.projeto.capitulo18.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do Alueguel:");
        System.out.print("Modelo do carro: ");
        String model = scanner.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime data01 = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime data02 = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        CarRental carRental = new CarRental(data01, data02, new Vehicle(model));
        System.out.print("Entre com o preço por hora: ");
        Double valuePerHour = scanner.nextDouble();
        System.out.print("Entre com o preco por dia: ");
        Double valuePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(valuePerHour, valuePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().totalPayment()));



    }
}
