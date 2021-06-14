package JavaStarter.HomeWork003.Task4;

import java.util.Scanner;

public class Volume {

    final double PI = 3.14;
    double v;
    double s;
    double r;
    double h;

    public void cylinderData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder (Example: 10.0, 21.36): ");
        r = scanner.nextDouble();
        System.out.println("Enter the height of the cylinder (Example: 10.0, 21.36): ");
        h = scanner.nextDouble();
        v = PI * Math.pow(r, 2) * h;
        s = 2 * PI * r * (r + h);
        System.out.println("Объем цилиндра: " + v);
        System.out.println("Площадь поверхности цилиндра: " + s);
    }

}
