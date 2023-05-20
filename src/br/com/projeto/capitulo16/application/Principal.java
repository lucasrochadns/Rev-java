package br.com.projeto.capitulo16.application;

import br.com.projeto.capitulo16.entities.Reservation;
import br.com.projeto.capitulo16.exceptions.ReservationException;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter01 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Room Number: ");
            int number = scanner.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn01 = formatter01.parse(scanner.next());
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            Date checkOut01 = formatter01.parse(scanner.next());


            Reservation reservation = new Reservation(number, checkIn01, checkOut01);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.print("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn02 = formatter01.parse(scanner.next());
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            Date checkOut02 = formatter01.parse(scanner.next());
            Date now = new Date();

            reservation.updateDates(checkIn01, checkOut02);
            System.out.println("Reservation: " + reservation);
        } catch (ReservationException message) {
            message.printStackTrace();
        } catch (ParseException message) {
            message.printStackTrace();
        } finally {
            scanner.close();

        }
    }
}
