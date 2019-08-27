package Predicates;

import java.time.LocalDate;
import java.util.function.Predicate;

//zwracaja typ boolean
public class Predicates {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (Integer value) -> value % 2 == 0;
        System.out.println("Is even: " + isEven.test(1));
        System.out.println("Is even: " + isEven.test(2));

        Predicate<LocalDate> isYearLeap = (year) -> year.isLeapYear();
        System.out.println("Is year leap: " + isYearLeap.test(LocalDate.of(2020, 1, 1)));
        System.out.println("Is year leap: " + isYearLeap.test(LocalDate.of(1991, 1, 1)));

        Predicate<User> isAdult = (User user) -> { return user.age > 18;
        };
        System.out.println("Is adult: " + isAdult.test(new User("Jan", 19)));
        System.out.println("Is adult: " + isAdult.test(new User("Stefan", 17)));

        Predicate<String> isNumberValid = (String number) -> number != null && number.startsWith("+48") && number.length() == 12;
        System.out.println("Is number valid: " + isNumberValid.test("+48123456789"));
        System.out.println("Is number valid: " + isNumberValid.test("+481234567890"));
        System.out.println("Is number valid: " + isNumberValid.test("+47123456789"));
        System.out.println("Is number valid: " + isNumberValid.test(""));
    }
}
