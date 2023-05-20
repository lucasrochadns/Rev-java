package br.com.projeto.capitulo15;

public class Individual extends TaxPayer{

    private Double healthExpentures;

    public Individual(){

    }
    public Individual(String name, Double anualIncome, Double healthExpentures) {
        super(name, anualIncome);
        this.healthExpentures = healthExpentures;
    }

    public Double getHealthExpentures() {
        return healthExpentures;
    }

    public void setHealthExpentures(Double healthExpentures) {
        this.healthExpentures = healthExpentures;
    }
    @Override
    public Double tax() {
        if(super.getAnualIncome() > 20000.00){
            return (super.getAnualIncome() * 0.25) - (healthExpentures * 0.5);
        }
        return (super.getAnualIncome() * 0.15) - (healthExpentures * 0.5);
    }
}
