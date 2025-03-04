package org.ies.sets;

import org.ies.model.Flight;
import org.ies.model.Passenger;
import org.ies.model.Student;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;

public class SetExercises {
    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>(
                Comparator
                        .comparing(Student::getName)
                        .thenComparing(Student::getSurname)
                        .thenComparing(Student::getEmail)
        );
        students.add(new Student("Bob", "Esponja", "bob@esponja.es", 28000));
        students.add(new Student("Peppa", "Pig", "peppa@pig.es", 28001));
        students.add(new Student("George", "Pig", "george@pig.es", 28001));
        students.add(new Student("Zoe", "Al", "zoe@al.es", 28001));


        System.out.println(students);

        TreeSet<Flight> flights = new TreeSet<>(new Comparator<Flight>() {
            @Override
            public int compare(Flight f1, Flight f2) {
                return f1.getNumber() - f2.getNumber();
            }
        });
        flights.add(new Flight(1, "Iberia", "Madrid", "Valencia"));
        flights.add(new Flight(100, "Iberia", "Madrid", "Valencia"));
        flights.add(new Flight(10, "Iberia", "Madrid", "Valencia"));

        System.out.println(flights);

        TreeSet<Passenger> passengers = new TreeSet<>(
                Comparator.comparing(Passenger::getName)
                        .thenComparing(Passenger::getSurname)
                        .thenComparing(Passenger::getNif)
        );

    }
}