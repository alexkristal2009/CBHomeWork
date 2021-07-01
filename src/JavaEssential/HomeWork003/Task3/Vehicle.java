package JavaEssential.HomeWork003.Task3;

public class Vehicle {

    private int x;
    private int y;

    private int price;
    private int speed;
    private int year;

    public Vehicle(int x, int y, int price, int speed, int year) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Characteristics of Vehicle: " +
                "\nlatitude x - " + x +
                "\nlongitude y - " + y +
                "\nprice - " + price +
                "\nspeed - " + speed +
                "\nyear - " + year;
    }
}
