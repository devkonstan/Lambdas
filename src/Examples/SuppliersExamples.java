package Examples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Supplier;

public class SuppliersExamples {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            return "to jest supplier test!";
        };
        System.out.println(supplier.get());


        Supplier<LocalDate> data = () -> {
            return LocalDate.now();
        };
        System.out.println(data.get());


        Supplier<String> dmy = () -> {

            return LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        };
        System.out.println(dmy.get());

        Supplier<DayOfWeek> day = () -> {
            return LocalDate.now().getDayOfWeek();
        };
        System.out.println(day.get());

        Supplier<List<Integer>> numbers = () -> {
            Random random = new Random();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(random.nextInt(100));
            }
            return list;
        };
        System.out.println(numbers.get());

        Supplier<Integer[]> liczby = () -> {
            Random random = new Random();
            Integer[] tab = new Integer[10];
            for (int i = 0; i < tab.length; i++) {
                tab[i] = random.nextInt(100);
            }
            return tab;
        };
        System.out.println(Arrays.toString(liczby.get()));
    }

}
