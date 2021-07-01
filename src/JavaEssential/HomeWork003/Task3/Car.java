package JavaEssential.HomeWork003.Task3;

public class Car extends Vehicle{

    public Car(int x, int y, int price, int speed, int year) {
        super(x, y, price, speed, year);
    }

    @Override
    public String toString() {
        return "Characteristics of Car: " +
                "\nlatitude x - " + getX() +
                "\nlongitude y - " + getY() +
                "\nprice - " + getPrice() +
                "\nspeed - " + getSpeed() +
                "\nyear - " + getYear();
    }
}
