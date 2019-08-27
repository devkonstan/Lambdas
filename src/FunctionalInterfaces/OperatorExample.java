package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class OperatorExample {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("kot", "pies");
        operatorExample(animals);
    }

    static void operatorExample(List<String> animals) {
        animals.replaceAll((animal) -> animal.toUpperCase());
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
