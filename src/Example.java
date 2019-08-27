import java.util.Arrays;
import java.util.List;

public class Example {
    static class User {
        String name;

        public User(String name) {

            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class Car {
        private String carName;
        private int speed;

        public Car(String carName, int speed) {
            this.carName = carName;
            this.speed = speed;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "carName='" + carName + '\'' +
                    ", speed=" + speed +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Piotr", "Paweł", "Wacław");
        list.stream()
                .map((String name) -> new User(name))
                .forEach((User user) -> System.out.println(user));

        System.out.println("******");

        List<Car> cars = Arrays.asList(new Car("VW", 250), new Car("Audi", 300));
        cars.stream()
                .map((Car car) -> car.speed)
                .forEach((Integer speed) -> System.out.println(speed));

        //zad 3 klasa DateFormatter
    }
}
