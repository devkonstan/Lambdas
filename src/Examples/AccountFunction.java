package Examples;

import java.util.function.Function;

public class AccountFunction {

    static class Account {
        public String name;

        public Account(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Function<String, Account> stringAccountFunction = (String name) -> new Account(name);
        System.out.println(stringAccountFunction.apply("Radek"));

    }
}