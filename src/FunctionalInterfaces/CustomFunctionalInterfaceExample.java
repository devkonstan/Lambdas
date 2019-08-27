package FunctionalInterfaces;

public class CustomFunctionalInterfaceExample {
    public static void main(String[] args) {
        UserChecker userChecker = (name)->name.contains("Jan");
        System.out.println(userChecker.checkNameContainsJan("Janek"));
    }
}