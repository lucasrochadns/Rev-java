package br.com.projeto.capitulo18.exceptions;

public class CarRentalException extends RuntimeException{

    private static final Long serialVersionUID = 1L;
    public CarRentalException(String message) {
        super(message);
    }
}
