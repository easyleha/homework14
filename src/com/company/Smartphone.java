package com.company;

public class Smartphone extends Characteristics implements PriceAndYear{

    int batteryCapacity;

    public Smartphone(String name, double price, int yearOfManufacture, int batteryCapacity, Manufacturer manufacturer ) {
        this.name = name;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.batteryCapacity = batteryCapacity;
        this.manufacturer = manufacturer;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
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
        return "Smartphone{" +
                "batteryCapacity=" + batteryCapacity +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
