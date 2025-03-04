package org.ies.model;

import java.util.Comparator;
import java.util.Objects;

public class Passenger implements Comparable<Passenger> {
    private String nif;
    private String name;
    private String surname;
    private int seat;

    public Passenger(String nif, String name, String surname, int seat) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.seat = seat;
    }

    @Override
    public int compareTo(Passenger passenger) {
        int compare = this.getName().compareTo(passenger.getName());
        if (compare == 0){
            compare = this.getSurname().compareTo(passenger.getSurname());
        }
        if(compare == 0){
            compare = this.getNif().compareTo(passenger.getNif());
        }
        return compare;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }


}
