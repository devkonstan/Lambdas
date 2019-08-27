package Cars2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarSelectionView {
    private int availableCars;
    private List<Car> originalCars;
    private List<Car> displayedCars;


    public CarSelectionView() {
        Random random = new Random();
        displayedCars = new ArrayList<>();
        originalCars = Arrays.asList(
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Tesla", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Ferrari", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Tesla", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Ferrari", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Ferrari", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Tesla", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020))
        );
    }

    public void applyFilter(Predicate<Car> filter) { //filter jest przyjmowany z zewnatrz
        displayedCars = originalCars.stream().filter(filter).collect(Collectors.toList());
        displayedCars.forEach(car -> System.out.println(car));
        availableCars = (int) originalCars.stream().filter(filter).count();
    }

}
