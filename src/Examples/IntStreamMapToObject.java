package Examples;

import java.util.stream.IntStream;

public class IntStreamMapToObject {
    public static void main(String[] args) {
        IntStream.range(0, 3)
                .mapToObj((int i) -> {
                    return Color.getColor(i);
                });
    }
}
