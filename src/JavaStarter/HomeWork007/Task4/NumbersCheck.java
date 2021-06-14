package JavaStarter.HomeWork007.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersCheck {

    public static void main(String[] args) throws IOException {
        // Самостоятельная деятельность учащегося - Задание 4
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number starting from 1: \n");
        int someNumber;
        while (true) {
            try {
                someNumber = Integer.parseInt(reader.readLine());
//                System.out.printf("\nYou entered: %d\n", someNumber);
                break;
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the number: \n");
            }
        }

        // является ли введенное число положительным или отрицательным
        positiveOrNegative(someNumber);
        /* внутри метода positiveOrNegative(int a), в случае если введеное число позитивное -->
        --> проверяем яляется ли оно простым методом checkNumb(int a) -->
        --> Делится ли на 2, 5, 3, 6, 9 без остатка методом division(int a);
        */

        reader.close();
    }

    public static void positiveOrNegative(int a) {
        if (a > 0) {
            System.out.print("The number is positive.\n");
            checkNumb(a);
            division(a);
        } else if (a < 0) {
            System.out.print("Error. You entered a negative number!\n");
        } else {
            System.out.print("Error. You entered a 0.\n");
        }
    }

    public static void checkNumb(int a) {

        if (a % 1 == 0 && a % a == 0) {
            System.out.print("You entered number is PRIME number!\n");
        } else {
            System.out.print("You entered COMPOSITE number!\n");
        }
    }

    public static void division(int a) {

        int[] divider = {2, 3, 5, 6, 9};

        for (int c : divider) {
            if (a % c == 0) {
                System.out.printf("The entered number is divisible by %d without a remainder.\n", c);
            } else {
                System.out.printf("The entered number isn't divisible by %d without a remainder.\n", c);
            }
        }
    }
}
