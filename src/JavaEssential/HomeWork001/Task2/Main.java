package JavaEssential.HomeWork001.Task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the first side of the rectangle: ");

        double firstSide;

        while (true) {
            try {
                firstSide = Double.parseDouble(reader.readLine());
                if (firstSide > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the length of the first side of the rectangle: ");
            }
        }

        System.out.print("Enter the length of the second side of the rectangle: ");

        double secondSide;

        while (true) {
            try {
                secondSide = Double.parseDouble(reader.readLine());
                if (secondSide > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the length of the second side of the rectangle: ");
            }
        }

        System.out.printf("Perimeter of the rectangle: %.2f%n", rectangle.perimeterCalculator(firstSide, secondSide));
        System.out.printf("%nArea of a rectangle: %.2f%n", rectangle.areaCalculator(firstSide, secondSide));
    }
}
