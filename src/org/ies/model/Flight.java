package org.ies.model;

import java.util.Arrays;
import java.util.Objects;

public class Flight {
    private int number;

    private String company;

    private String origin;

    private String destination;


    public Flight(int number, String company, String origin, String destination) {
        this.number = number;
        this.company = company;
        this.origin = origin;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return number == flight.number && Objects.equals(company, flight.company) && Objects.equals(origin, flight.origin) && Objects.equals(destination, flight.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, company, origin, destination);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number=" + number +
                ", company='" + company + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}