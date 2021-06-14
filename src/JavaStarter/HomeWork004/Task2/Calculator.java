package JavaStarter.HomeWork004.Task2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        //Самостоятельная деятельность учащегося - Задание 2

        Scanner scanner = new Scanner(System.in);

        int operand1 = 15;
        int operand2 = 2;
        double resultDiv;

        System.out.println("Введите знак арифметической операции: ");
        String sign = scanner.nextLine();

        switch (sign) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 != 0) {
                    System.out.println(resultDiv = (double) operand1 / operand2);
                } else {
                    System.out.println("ArithmeticException: divide by zero");
                }
                break;
            case "%":
                System.out.println(operand1 % operand2);
                break;
            default:
                System.out.println("Неверный ввод!");
        }

    }

}
