package JavaStarter.HomeWork005.Task2;

import java.util.Scanner;

public class Parity {

    public static void main(String[] args) {
        // Самостоятельная деятельность учащегося - Задание 2
        // Первый вариант
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if ((input & 1) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // Второй вариант
        System.out.println("-----------------------------------------");

        int input2 = scanner.nextInt();
        int mask = 0b0001;

        if ((input2 & mask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
