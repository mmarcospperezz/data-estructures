package org.ies.sets;

import org.ies.model.Student;

import java.util.Comparator;

public class ZipCodeStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        int compare = student1.getZipCode() - student2.getZipCode();
        if(compare == 0) {
            compare = student1.getName().compareTo(student2.getName());
        }
        return compare;
    }
}