package Examples;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(6, 3, 6, 21, 20, 1);
        values.stream()
                .forEach(integer -> System.out.println(integer));
    }
}