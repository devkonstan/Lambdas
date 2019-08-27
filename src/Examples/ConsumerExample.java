package Examples;

import java.util.function.Consumer;

public class ConsumerExample {
    static class User {
        String name;
        int age;

        User(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Consumer<User> userConsumer = (User user) -> {
            System.out.println("Imie " + user.name);
            System.out.println("Wiek " + user.age);
        };
        userConsumer.accept(new User("Piotr", 30));
        userConsumer.accept(new User("Arnold", 35));
    }
}
