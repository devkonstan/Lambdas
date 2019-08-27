package Consumer;

public class User {
    public int id;
    public String name;
    public String lastName;
    public int age;
    public Position position;

    public User(int id, String name, String lastName, int age, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
    }

    public User(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position=" + position +
                '}';
    }
}

