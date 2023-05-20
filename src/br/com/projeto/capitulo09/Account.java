package br.com.projeto.capitulo09;

public class Account {

    private Integer numberAccount;
    private String holder;
    private Double amount;

    public Account(Integer numberAccount, String holder, Double amount) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        this.amount = amount;
    }

    public Account(){

    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(Integer numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void deposit(double amount){
        this.amount += amount;
    }

    public void widthdraw(double amount){
        if(this.amount < amount){
            throw new RuntimeException("Balance less than withdraw");
        }
        this.amount -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "numberAccount=" + numberAccount +
                ", holder='" + holder + '\'' +
                ", amount=" + amount +
                '}';
    }
}
