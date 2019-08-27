package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
        Consumer<User> userPredicate = (User user) -> {
            System.out.println("Imie " + user.name);
            System.out.println("Nazwisko " + user.lastName);
            System.out.println("Wiek " + user.age);
            System.out.println("Zawód " + user.position);
        };

        userPredicate.accept(new User(1, "Piotr", "Kowalski", 24, Position.DESIGNER));
        userPredicate.accept(new User(2, "Arnold", "Boczek", 35, Position.MANAGER));

        List<User> list = new ArrayList<>();
        Consumer<User> listConsumer = user -> {
            list.add(user);
        };

        System.out.println(list);

        listConsumer.accept(new User(3, "Jacek", "Nowaczyk", 26, Position.QA));
        listConsumer.accept(new User(4, "Paweł", "Stefaniak", 42, Position.DESIGNER));

        for (User user : list) {
            userPredicate.accept(user); //wykorzystuje interfejs funkcyjny z 1. zadania
        }

        System.out.println(list); // pokaze tylko 2 ostatnie, bo listConsumer dotyczy tylko ich

        System.out.println("*****");

        Consumer<String> removeUserByName = (String name) -> {
            for (User user : list) {
                if (user.name.equals(name)) {
                    list.remove(user);
                    return;
                }
            }
        };
        removeUserByName.accept("Jacek");

        for (User user : list) {
            userPredicate.accept(user); //wykorzystuje interfejs funkcyjny z 1. zadania
        }
        System.out.println(list);

        System.out.println("**********");

        Consumer<Integer> removeUserById = (Integer id) -> {
            for (User user : list) {
                if (id == user.id) {
                    list.remove(user);
                    return;
                }
            }
        };
        removeUserById.accept(4);
        for (User user : list) {
            userPredicate.accept(user); //wykorzystuje interfejs funkcyjny z 1. zadania
        }
        System.out.println(list);

        Consumer<User> upadteUser = (User user) -> {
            user.name = "TEST";
        };
        upadteUser.accept(list.get(0));

        //Rezultat:
        System.out.println("Result");
        for (User user : list) {
            listConsumer.accept(user);
        }

    }

}



