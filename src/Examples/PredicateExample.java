package Examples;

import java.util.function.Predicate;


public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> greaterThanZero = (value) -> value > 0;

        System.out.println("Is greater than 0: " + greaterThanZero.test(90));
        System.out.println("Is greater than 0: " + greaterThanZero.test(-90));
    }
}

