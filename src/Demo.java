import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Checker evenChecker = new Checker() {
            @Override
            public boolean check(int number) {
                return number % 2 == 0;
            }
        };

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (int number : numbers) {
            if (evenChecker.check(number)) {
                System.out.println(number);
            }
        }
    }
}
