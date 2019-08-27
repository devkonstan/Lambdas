package Examples;

import java.util.function.Function;

public class BoxFunction {
    static class Box {
        public Integer value;

        public Integer getValue() {
            return value;
        }

        public Box(Integer value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "value=" + value +
                    '}';
        }
    }

    public static void main(String[] args) {
        Function<Integer, Box> boxFunction = (Integer value) -> {
            return new Box(value);
        };
        Box box = boxFunction.apply(45);
        System.out.println(box);
    }
}
