public class Car {

    private int id;
    private String number;

    public Car(int id, String number) {
        this.id = id;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
