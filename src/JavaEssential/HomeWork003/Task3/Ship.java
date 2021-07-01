package JavaEssential.HomeWork003.Task3;

public class Ship extends Vehicle{

    private int numberOfPassengers;
    private String homePort;

    public Ship(int x, int y, int price, int speed, int year, int numberOfPassengers, String homePort) {
        super(x, y, price, speed, year);
        this.numberOfPassengers = numberOfPassengers;
        this.homePort = homePort;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getHomePort() {
        return homePort;
    }

    public void setHomePort(String homePort) {
        this.homePort = homePort;
    }

    @Override
    public String toString() {
        return "Characteristics of Ship: " +
                "\nlatitude x - " + getX() +
                "\nlongitude y - " + getY() +
                "\nprice - " + getPrice() +
                "\nspeed - " + getSpeed() +
                "\nyear - " + getYear() +
                "\nnumberOfPassengers - " + numberOfPassengers +
                "\nhome port - " + homePort;
    }
}
