package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2, 6, 3, 6, 21, 20, 1);
        Optional<Integer> value = values.stream().findAny();
        System.out.println(value.get());
    }
}
