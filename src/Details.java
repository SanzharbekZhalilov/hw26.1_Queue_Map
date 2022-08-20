public class Details {

    private int year;
    private String model;
    private int price;
    private String color;

    public Details(int year, String model, int price, String color) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Details{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
