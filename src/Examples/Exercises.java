package Examples;

import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Piotr", "Joanna", "Krzysztof");
        names.stream()
                .forEach((String value) -> {
                    System.out.println(value);
                });

        System.out.println("*****");

        names.stream()
                .forEach((String name) -> {
                    System.out.println(name.length());
                });

        System.out.println("*****");

        names.stream()
                .forEach((String text) -> {
                    if (text.length() % 2 == 0) {
                        System.out.println("parzysta");
                    } else {
                        System.out.println("nieparzysta");
                    }
                });

        List<String> names2 = Arrays.asList("PiOTr", "joANNa", "krzYsztof");
        names2.stream()
                .map((String name) -> name.toUpperCase())
                .forEach((name) -> System.out.println(name));

        List<Integer> numbers = Arrays.asList(10, 200, 300);
        numbers.stream()
                .map((Integer number) -> number + 10)
                .forEach((number) -> System.out.println(number));
    }
}