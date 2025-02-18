
import javax.swing.plaf.ListUI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListExercises {
    public static void main(String[] args) {
        List<Integer> list1 = askIntList();
        List<Integer> list2 = askIntList();

        System.out.println(juntion(list1, list2));
        System.out.println(first(new ArrayList<>()));
    }

    // Ejercicio 2
    public static List<String> addAtBeggining(
            List<String> list, String value) {
        list.add(0, value);
        list.getLast();
        list.get(list.size() - 1);
        return list;
    }

    // Ejercicio 3
    public static Integer first(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    // Ejercicio 4
    public static Integer last(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(list.size() - 1);
        }
    }

    public static double sum(List<Double> numbers) {
        double sum = 0;
        for (var number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static Double average(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return null;
        } else {
            return sum(numbers) / numbers.size();
        }
    }

    public static Double max(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return null;
        } else {
            double max = numbers.get(0);
            for (var number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        }
    }

    public static Double min(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return null;
        } else {
            double min = numbers.get(0);
            for (var number : numbers) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        }
    }

    public static List<Integer> askIntList() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String answer = "";
        do {
            System.out.print("¿Desea introducir más números? (Y/n) ");
            answer = scanner.nextLine();

            if (!answer.equals("Y")) {
                System.out.print("Introduce un número: ");
                int number = scanner.nextInt();
                scanner.nextLine();
                numbers.add(number);
            }
        } while (answer.equals("n"));
        return numbers;
    }

    public static List<Integer> sum10(List<Integer> numbers) {
        List<Integer> result = new LinkedList<>();
        for (var number: numbers) {
            result.add(number + 10);
        }
        return result;
    }

    public static <T> List<T> union(List<T> numbers1, List<T> numbers2) {
        List<T> result = new LinkedList<>();
        for (var number: numbers1) {
            result.add(number);
        }

        for (var number: numbers2) {
            result.add(number);
        }
        return result;
    }

    public static <T> List<T> juntion(List<T> numbers1, List<T> numbers2) {
        List<T> result = new ArrayList<>();
        for (var number: numbers1) {
            numbers1.remove(number);
            if(numbers2.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }

    public static <T> List<T> removeAll(List<T> numbers, List<T> numbersToRemove) {
        for (var number: numbersToRemove) {
            if(numbers.contains(number)) {
                numbers.remove(number);
            }
        }
        return numbers;
    }

    public static List<String> mapToEmail(List<Student> students) {
        List<String> emails = new ArrayList<>();
        for (var student: students) {
            emails.add(student.getEmail());
        }
        return emails;
    }

    public static List<Student> filterStudentByZipCode(List<Student> students, int zipCode){
        var result = new ArrayList<Student>();
        for(var student : students ){
            if (student.getZipCode() == zipCode) {
                result.add(student);
            }
        }
        return result;
    }

}