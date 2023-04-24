package by.pvt.autoserializable;

import java.io.Serializable;
import java.util.Objects;

public class Auto implements Serializable {
    private String name;
    private double consumption;
    private String model;
    private int year;
    private transient String surname;

    public Auto(String name, double consumption, String model, int year, String surname) {
        this.name = name;
        this.consumption = consumption;
        this.model = model;
        this.year = year;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", consumption=" + consumption +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", surname='" + surname + '\'' +
                '}';
    }
}
