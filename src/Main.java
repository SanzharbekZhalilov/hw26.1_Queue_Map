import java.util.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(1, "01 312 BIS");
        Car car2 = new Car(2, "02 357 OSH");
        Car car3 = new Car(3, "03 147 KOL");

        Details details1 = new Details(2017, "BMW X6", 50000, "white");
        Details details2 = new Details(2022, "Toyota Camry", 42000, "silver");
        Details details3 = new Details(2016, "Tesla Model S", 35000, "black");

        Map<Car, Details> cars = new HashMap<>();
        cars.put(car1, details1);
        cars.put(car2, details2);
        cars.put(car3, details3);

        for (Map.Entry e : cars.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}