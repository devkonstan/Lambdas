package Action;

public class ActionImpl implements Action {

    @Override
    public void execute(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    @Override
    public void execute(int a) {
        System.out.println("TEST KLASA ------" + a);
    }
}
