package JavaEssential.HomeWork003.Task3;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(123, 321, 500, 250, 1995);
        System.out.println(vehicle.toString());

        System.out.println("\n-------------------------\n");

        Vehicle vehicle1 = new Car(321, 654, 987, 250, 1985);
        System.out.println(vehicle1.toString());

        System.out.println("\n-------------------------\n");

        Vehicle vehicle2 = new Plane(123, 456, 789, 987, 6541, 5214, 125);
        System.out.println(vehicle2.toString());

        System.out.println("\n-------------------------\n");

        Vehicle vehicle3 = new Ship(147, 258, 369, 753, 1875, 157, "South Port");
        System.out.println(vehicle3.toString());

    }

}
