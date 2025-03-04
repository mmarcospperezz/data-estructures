import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names1 = List.of(
                "Bob", "Peppa", "George", "Pablo"
        );

        String[] names2 = {
                "Bob", "Peppa", "George"
        };


        var n2 = startWithP(names1);
        System.out.println(n2);
    }

    public static List<String> startWithP(List<String> names) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("P")) {
                result.add(name);
            }
        }

        return  result;
    }
}