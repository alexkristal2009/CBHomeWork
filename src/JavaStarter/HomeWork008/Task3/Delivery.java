package JavaStarter.HomeWork008.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Delivery {

    public static void main(String[] args) throws IOException {
        // Самостоятельная деятельность учащегося - Задание 3
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of customers: \n");
        int customer;
        while (true) {
            try {
                customer = Integer.parseInt(reader.readLine());
                // в этом конечно нет логики, но все же теоретически такое может быть, что клиентов 0
                if (customer >= 0) {
                    System.out.printf("The number of customers: %d\n", customer);
                    break;
                } else {
                    System.out.print("Invalid input. Enter the number of customers: \n");
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the number of customers: \n");
            }
        }
        System.out.printf("\nThere are %d routes for delivering goods.", factorial(customer));

        reader.close();
    }

    private static int factorial(int client) {
        int result = 1;
        if (client == 1 || client == 0) {
            return result;
        } else {
            result = client * factorial(client - 1);
            return result;
        }
    }

}
