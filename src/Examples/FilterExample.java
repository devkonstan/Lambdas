package Examples;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(3, 6, 7, 20, 21);
        values.stream()
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);
    }
}
