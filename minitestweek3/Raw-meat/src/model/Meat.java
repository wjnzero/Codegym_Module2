package model;

import java.time.LocalDate;
import java.time.Period;

public class Meat extends Material implements Discount{
    double weight;

    public Meat() {
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return cost*weight;
    }

    @Override
    LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(7);
    }

    @Override
    public String toString() {
        return "model.Meat{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }

    @Override
    public double getRealMoney() {
        Period different = Period.between(getExpiryDate(),LocalDate.now());
        if (different.getDays()<=5){
            return getAmount()/100*70;
        }
        else return getAmount()/100*90;
    }
}
