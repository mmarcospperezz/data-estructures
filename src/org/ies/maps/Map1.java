package org.ies.maps;

import org.ies.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String, User> userByNif = new HashMap<>();

        User user1 = new User(
                "00X",
                "Bob",
                "Esponja",
                "668680140",
                "mmarcospperez2204@gmail.com",
                 22
        );

        userByNif.put(user1.getNif(), user1);

        User user2 = new User(
                "01X",
                "Peppa",
                "Pig",
                "667054258",
                "bymordor2204@gmail.com",
                24
        );

        userByNif.put(user2.getNif(), user2);
    }

    public static String getPhoneByNif(Map<String, User> usersByNif, String nif) {
        if (usersByNif.containsKey(nif)) {
            return usersByNif.get(nif).getPhoneNumber();
        } else {
            return null;
        }
    }

    public static List<String> getPhones(Map<String, User> usersByNif) {
        List<String> phones = new ArrayList<>();
        for (User user : usersByNif.values()) {
            phones.add(user.getPhoneNumber());
        }
        return phones;
    }

    public static void removeUser(Map<String,User> usersByNif, String nif){
        if (usersByNif.containsKey(nif)) {
            removeUser(usersByNif, nif);
        }
        System.out.println("El usuario no existe");
    }

    public static List<String> getNifs(Map<String, User> usersByNif) {
        List<String> nifs = new ArrayList<>();
        for (String nif : usersByNif.keySet()) {
            nifs.add(nif);
        }
        return nifs;
    }

    public static void updatePhoneByNif(Map<String, User> usersByNif, String nif, String newPhoneNumber) {
        if (usersByNif.containsKey(nif)) {
            usersByNif.get(nif).setPhoneNumber(newPhoneNumber);
        }
    }
}
