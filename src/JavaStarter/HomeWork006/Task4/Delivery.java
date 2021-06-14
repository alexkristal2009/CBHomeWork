package JavaStarter.HomeWork006.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Delivery {

    public static void main(String[] args) throws IOException {
        // Самостоятельная деятельность учащегося - Задание 4

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number of customers: ");

        String customerStr;
        int customerInt;

        while (true) {

            customerStr = reader.readLine();

            try {
                // парсим строку customerStr для того, чтобы проверить на ввод только число
                customerInt = Integer.parseInt(customerStr);

                if (customerInt > 0 && customerInt < Integer.MAX_VALUE) {
                    System.out.println("A number of customers: " + customerInt);
                    break;
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Enter a number of customers: ");
            }
        }

        int count = 1;
        int factorResult = 1;

        do {
            factorResult *= count;
            count++;
        } while (count <= customerInt);

        System.out.printf("The factorial of a number %d (%d!): " + factorResult, customerInt, customerInt);

        reader.close();
    }

}
