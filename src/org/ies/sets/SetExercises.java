package org.ies.sets;

import org.ies.model.Flight;
import org.ies.model.Student;

import java.util.Map;
import java.util.TreeSet;

public class SetExercises {
    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>(new SurnameNameStudentComparator());
        students.add(new Student("Bob", "Esponja", "bob@esponja.es", 28000));
        students.add(new Student("Peppa", "Pig", "peppa@pig.es", 28001));
        students.add(new Student("George", "Pig", "george@pig.es", 28001));
        students.add(new Student("Zoe", "Al", "zoe@al.es", 28001));


        System.out.println(students);

        TreeSet<Flight> flights = new TreeSet<>();
        flights.add(new Flight(1, "Iberia", "Madrid", "Valencia"));

        System.out.println(flights);


    }
}