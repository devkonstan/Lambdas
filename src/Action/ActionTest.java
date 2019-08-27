package Action;

public class  ActionTest {

    public static void main(String[] args) {
        System.out.println("Sposób 1");
        //sposób 1
        Action action = new ActionImpl();
        test(action);

        System.out.println("Sposób 2");
        //sposób 2
        Action action2 = new Action() {
            @Override
            public void execute(int a, int b) {
                System.out.println(a);
                System.out.println(b);
            }
        };
        Action action2l = (int a, int b) -> {
            System.out.println(a);
            System.out.println(b);
        };
        test(action2);
        test(action2l);

        System.out.println("Sposób 3");
        //sposób 3
        new Action() {
            @Override
            public void execute(int a, int b) {
                System.out.println(a);
                System.out.println(b);
            }
        };
        test((int a, int b) -> {
            System.out.println(a);
            System.out.println(b);
        });

    }

    public static void test(Action action) {
        action.execute(10, 20);
        action.execute(30);
    }
}
