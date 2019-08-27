package Cars2;

public class CarDemo {
    public static void main(String[] args) {
        CarSelectionView csv = new CarSelectionView();

        int userPrice = 15000;
        int lowerYear = 2002;
        int upperYear = 2015;

        csv.applyFilter(car -> {
            return car.getPrice() > userPrice &&
                    car.getProducedIn() >= lowerYear &&
                    car.getProducedIn() <= upperYear;
        });
        System.out.println("******");
        csv.applyFilter(car -> car.getPrice() > 15000);
        System.out.println("******");
        csv.applyFilter(car -> car.getBrand() == "Tesla");
    }
}
