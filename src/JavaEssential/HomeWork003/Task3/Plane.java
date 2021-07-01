package JavaEssential.HomeWork003.Task3;

public class Plane extends Vehicle{

    private int height;
    private int numberOfPassengers;

    public Plane(int x, int y, int price, int speed, int year, int height, int numberOfPassengers) {
        super(x, y, price, speed, year);
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Characteristics of Plane: " +
                "\nlatitude x - " + getX() +
                "\nlongitude y - " + getY() +
                "\nprice - " + getPrice() +
                "\nspeed - " + getSpeed() +
                "\nyear - " + getYear() +
                "\nheight - " + height +
                "\nnumberOfPassengers - " + numberOfPassengers;
    }
}
