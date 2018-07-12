package acn.i2o.entity;

import java.util.Objects;

public class CarSeller {

    private String vin;

    private String make;

    private String model;

    private String year;

    private String condition;

    private String color;

    private String transmission;

    private String fuel;

    private String price;

    private String mileage;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarSeller carSeller = (CarSeller) o;
        return Objects.equals(vin, carSeller.vin) &&
                Objects.equals(make, carSeller.make) &&
                Objects.equals(model, carSeller.model) &&
                Objects.equals(year, carSeller.year) &&
                Objects.equals(condition, carSeller.condition) &&
                Objects.equals(color, carSeller.color) &&
                Objects.equals(transmission, carSeller.transmission) &&
                Objects.equals(fuel, carSeller.fuel) &&
                Objects.equals(price, carSeller.price) &&
                Objects.equals(mileage, carSeller.mileage);
    }

    @Override
    public int hashCode() {

        return Objects.hash(vin, make, model, year, condition, color, transmission, fuel, price, mileage);
    }
}
