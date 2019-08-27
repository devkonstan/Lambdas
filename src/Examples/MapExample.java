package Examples;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("a", "b", "c",
                "d", "e", "f");
        values.stream()
                .map((value)->value.toUpperCase())
                .forEach(System.out::println);
    }
}