package model;

public class Product {
    String id,name, production, other;
    int price;

    public Product(String id, String name, String production, String other, int price) {
        this.id = id;
        this.name = name;
        this.production = production;
        this.other = other;
        this.price = price;
    }

    public Product() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", production='" + production + '\'' +
                ", other='" + other + '\'' +
                ", price=" + price +
                '}';
    }
}
