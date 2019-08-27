package FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        getValue(()->"supplier test!");
    }
    static void getValue(Supplier<String> supplier){
        System.out.println(supplier.get());
    }
}