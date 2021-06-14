package JavaStarter.HomeWork007.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arithmetics {

    public static void main(String[] args) throws IOException {
        // Самостоятельная деятельность учащегося - Задание 2
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Ввод и проверка первого числа
        System.out.print("Enter the first  number: \n");

        int firstNumber;
        while (true) {
            try {
                firstNumber = Integer.parseInt(reader.readLine());
                System.out.printf("\nFirst number: %d\n\n", firstNumber);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Enter the number: ");

            }
        }
        // Ввод и проверка второго числа
        System.out.print("Enter the second number: \n");

        int secondNumber;
        while (true) {
            try {
                secondNumber = Integer.parseInt(reader.readLine());
                System.out.printf("\nSecond number: %d\n\n", secondNumber);
                break;
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the number: \n");
            }
        }

        // Ввод и проверка знака математической операции
        System.out.print("Enter the math operation sign: \n");

        String math;
        while (true) {
            math = reader.readLine();
            if (math.matches("[-+*/]")) {
                System.out.printf("The math operation sign: %s\n", math);
                break;
            } else {
                System.out.print("Invalid input. Enter the math operation sign: \n");
            }
        }
        /*
        Ввывод результата операции с использованием методов
        add – сложение
        sub –вычитание
        mul – умножение
        div – деление
        в зависимости от введенного математического знака
         */

        switch (math) {
            case "+":
                System.out.printf("\nThe result of a mathematical operation: %d\n", addNumbers(firstNumber, secondNumber));
                break;
            case "-":
                System.out.printf("\nThe result of a mathematical operation: %d\n", subNumbers(firstNumber, secondNumber));
                break;
            case "*":
                System.out.printf("\nThe result of a mathematical operation: %d\n", mulNumbers(firstNumber, secondNumber));
                break;
            case "/":
                System.out.print("\nThe result of a mathematical operation: ");
                divNumbers(firstNumber, secondNumber);
                System.out.println();
                break;
        }

        reader.close();
    }

    public static int addNumbers(int first, int second) {
        return first + second;
    }

    public static int subNumbers(int first, int second) {
        return first - second;
    }

    public static int mulNumbers(int first, int second) {
        return first * second;
    }

    public static void divNumbers(int first, int second) {
        if (second == 0) {
            System.out.print("Division by zero is prohibited!\n");
        } else {
            System.out.println(first / second);
        }
    }
}
