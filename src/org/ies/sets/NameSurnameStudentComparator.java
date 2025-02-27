package org.ies.sets;

import org.ies.model.Student;

import java.util.Comparator;

public class NameSurnameStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int compare = o1.getSurname().compareTo(o2.getSurname());
        // Si los apellidos de ambos son iguales compareTo devuelve 0
        if (compare == 0) {
            // Si el apellido era igual ordenamos por nombre
            compare = o1.getName().compareTo(o2.getName());

            // Añadimos un compareTo usando un campo que sea único para que no se
            // descarte ningún estudiante, aunque ya haya uno con el mismo nombre
            // y apellidos
            if(compare == 0) {
                compare = o1.getEmail().compareTo(o2.getEmail());
            }
        }
        // Devolvemos el valor de compare
        return compare;
    }
}