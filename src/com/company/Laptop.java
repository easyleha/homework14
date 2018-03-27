package com.company;

public class Laptop extends Characteristics implements PriceAndYear {

    int ram;

    public Laptop(String name, double price, int yearOfManufacture, int ram, Manufacturer manufacturer ) {
        this.name = name;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.ram = ram;
        this.manufacturer = manufacturer;
    }

    public int getRam() {
        return ram;
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
        return "Laptop{" +
                "ram=" + ram +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
