package br.com.projeto.capitulo16.entities;

import br.com.projeto.capitulo16.exceptions.ReservationException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNunber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat formatter01 = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNunber, Date chekIn, Date checkOut) {
        this.roomNunber = roomNunber;
        this.checkIn = chekIn;
        this.checkOut = checkOut;

        if (checkOut.before(checkIn)) {
            throw new ReservationException("Error in Reservation: check out date must be after check-in date");
        }
    }

    public Integer getRoomNunber() {
        return roomNunber;
    }

    public void setRoomNunber(Integer roomNunber) {
        this.roomNunber = roomNunber;
    }

    public Date getCheckIn() {
        return checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }

    public Long duration() {
        Long durationDate = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(durationDate, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new ReservationException("Error in reservation: Reservation dates for update must be future dates");
        }
        if(checkOut.before(checkIn)){
            throw new ReservationException("Error in Reservation: check out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    @Override
    public String toString() {
        return "Room: " + roomNunber + "CheckIn: " + formatter01.format(checkIn) + " CheckOut: " + formatter01.format(checkOut);
    }
}
