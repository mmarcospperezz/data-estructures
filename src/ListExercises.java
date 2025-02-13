import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExercises {
    public static void main(String[] args) {


        ArrayList<String> lista = new ArrayList<>();

        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");
        lista.add("Pera");
        lista.add("Uva");
        addAtBeginning(lista, "Pera");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
       Integer numero = first(numbers);
       System.out.println(numero);
       Integer numero2 = last(numbers);
       System.out.println(numero2);


        for (var frutas : lista) {
            System.out.println(frutas);
        }

    }

    public static void addAtBeginning(List<String> list, String value) {
            list.add(0, value);

    }

    public static Integer first(List<Integer> list){
        if(list.isEmpty()){
            return null;
        } else {
            return list.get(0);
        }
    }

    public static Integer last(List<Integer> list){
        if(list.isEmpty()){
            return null;
        } else {
            return list.get(list.size() -1);
        }
    }
}
