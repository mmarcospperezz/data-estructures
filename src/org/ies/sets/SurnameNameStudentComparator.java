package org.ies.sets;

import org.ies.model.Student;

import java.util.Comparator;

public class SurnameNameStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        int compare = student1.getSurname().compareTo(student2.getSurname());
        if(compare == 0) {
            compare = student1.getName().compareTo(student2.getName());
            if(compare == 0) {
                compare = student1.getEmail().compareTo(student2.getEmail());
            }
        }
        return compare;
    }
}