package model;

import java.time.LocalDate;
import java.time.Period;

public class CrispyFlour extends Material implements Discount{
    private double quantity ;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity*cost;
    }

    @Override
    LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(1);
    }

    @Override
    public String toString() {
        return "model.CrispyFlour{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public double getRealMoney() {
        Period different = Period.between(getExpiryDate(),LocalDate.now());
        if (different.getDays()<=60){
            return getAmount()/100*60;
        }
        else return getAmount()/100*95;
    }
}
