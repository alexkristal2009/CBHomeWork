package JavaEssential.HomeWork002.Task4;

public class Car {

    int year;
    double speed;
    int weight;
    String color;

    public Car() {
        this(2000, 200.10, 1254, "Blue");
    }

    public Car(int year) {
        this(year, 200.10, 1254, "Blue");
    }

    public Car(int year, double speed) {
        this(year, speed, 1423, "White");
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "Red");
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
