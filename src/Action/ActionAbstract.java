package Action;

public abstract class ActionAbstract {

    //odpowiednik funkcji default w interfejsie Action.Action
    public void execute(int a) {
        System.out.println("TEST------" + a);
    }

    //odpowiednik funkcji czysto abstrakcyjnej w interfejsie Action.Action
    abstract void execute(int a, int b);
}
