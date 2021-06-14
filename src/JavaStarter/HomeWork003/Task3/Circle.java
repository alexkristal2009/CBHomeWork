package JavaStarter.HomeWork003.Task3;

import java.util.Scanner;

public class Circle {

    final double PI = 3.14;
    double r;

    public void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle (Example: 10,5, 21,0): ");
        r = scanner.nextDouble();
        System.out.println("The radius of circle is: " + PI * Math.pow(r, 2));
    }

}
