package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(6, 3, 6, 21, 20, 1);
        Map<Boolean, List<Integer>> groupBy = values.stream()
                .collect(Collectors.groupingBy(value -> value % 2 == 0));
        groupBy.forEach((aBoolean, integers) -> {
            System.out.println("Even: " + aBoolean);
            integers.forEach(System.out::println);
        });
    }
}
