package com.company;

public class Monitor extends Characteristics implements PriceAndYear {

    double diagonal;

    public Monitor(String name, double price, int yearOfManufacture, double diagonal, Manufacturer manufacturer ) {
        this.name = name;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }

    public double getDiagonal() {
        return diagonal;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getYearOfRelease() {
        return yearOfManufacture;
    }

    @Override
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal=" + diagonal +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
