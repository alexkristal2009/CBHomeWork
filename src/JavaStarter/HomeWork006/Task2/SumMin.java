package JavaStarter.HomeWork006.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumMin {

    public static void main(String[] args) throws IOException {
        // Самостоятельная деятельность учащегося - Задание 2

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstStr;
        int firstInt;

        String secondStr;
        int secondInt;

        int sum = 0;

        System.out.println("Enter two numbers (a < b): ");

        while (true) {
            firstStr = reader.readLine();
            try {
                // парсим строку firstStr для того, чтобы проверить на ввод только число
                firstInt = Integer.parseInt(firstStr);
                if (firstInt > Integer.MIN_VALUE && firstInt < Integer.MAX_VALUE) {
                    System.out.println("first number: " + firstInt);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter first number: ");
            }
        }

        while (true) {
            secondStr = reader.readLine();
            try {
                // парсим строку secondStr для того, чтобы проверить на ввод только число
                secondInt = Integer.parseInt(secondStr);
                if (secondInt > firstInt && secondInt < Integer.MAX_VALUE) {
                    System.out.println("second number: " + secondInt);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter second number: ");
            }
        }
        for (int a = firstInt; a < secondInt; a++) {
            sum += a;
        }
        System.out.println("The sum this two numbers: " + sum);

        System.out.print("\nOdd numbers: ");
        for (int a = firstInt; a < secondInt; a++) {
            if (a % 2 != 0) {
                System.out.print(a + ", ");
            }
        }
        reader.close();
    }

}
