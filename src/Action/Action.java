package Action;

// 1 metoda abstrakcyjna
@FunctionalInterface
public interface Action {

    default void execute(int a){ // == public void execute(int a) { System.out.println("TEST------" + a); }
        System.out.println("TEST------" + a);
    }

    default void execute(int a, int b, int c){
        System.out.println("TEST------" + a + b + c);
    }

    void execute(int a, int b); // == abstract void execute(int a, int b);
}
