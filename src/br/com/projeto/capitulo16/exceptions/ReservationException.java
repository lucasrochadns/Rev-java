package br.com.projeto.capitulo16.exceptions;

public class ReservationException extends RuntimeException{

    private static Long serialVersionUID = 1L;

    public ReservationException(String Message) {
        super(Message);
    }
}
