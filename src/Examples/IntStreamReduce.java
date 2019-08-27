package Examples;

import java.util.stream.IntStream;

public class IntStreamReduce {
    public static void main(String[] args) {
        int value = IntStream.range(1, 5)
                .reduce(1, (x, y) -> x * y);
//int value=1*1+1*2+2*3+6*4
        System.out.println(value);
    }
}
