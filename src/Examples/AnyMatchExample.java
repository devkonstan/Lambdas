package Examples;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(6, 3, 6, 21, 20, 1);
        boolean result = values.stream().anyMatch((value) -> value > 5);
        System.out.println("Result: " + result);
    }
}
