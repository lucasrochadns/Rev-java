package br.com.projeto.capitulo08;

public abstract class Cotacao {

    public static double iof = 0.06;
    public static double dollarRealTime (double amount, double dollarPrice){
        return (amount * dollarPrice) * 1.06;
    }
}
