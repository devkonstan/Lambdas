package Examples;

import java.util.stream.IntStream;

public class IntStreamIterator {
    public static void main(String[] args) {
        IntStream.iterate(0, (int i) -> {
            return i + 2;
        }).limit(10)
                .forEach(System.out::println);
    }
}
