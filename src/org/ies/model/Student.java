package org.ies.model;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private String surname;
    private String email;
    private int zipCode;

    public Student(String name, String surname, String email, int zipCode) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.zipCode = zipCode;
    }

    @Override
    public int compareTo(Student student) {
        int compare = this.name.compareTo(student.getName());
        if (compare == 0) {
            compare = this.surname.compareTo(student.getSurname());
            if (compare == 0) {
                compare = this.email.compareTo(student.getSurname());
            }
        }
        return compare;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return zipCode == student.zipCode && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, zipCode);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}