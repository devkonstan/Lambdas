package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        System.out.println("Warunek predicate");
        Predicate<Integer> greaterThanZero = (value) -> value >= 0;
        System.out.println(greaterThanZero.test(0));
    }
}