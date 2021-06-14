package JavaStarter.HomeWork008.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank {

    public static void main(String[] args) throws IOException {
        // Самостоятельная деятельность учащегося - Задание 2
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the loan amount: \n");
        int debt;
        while (true) {
            try {
                debt = Integer.parseInt(reader.readLine());
                System.out.printf("The loan amount: %d\n", debt);
                break;
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the loan amount: \n");
            }
        }

        System.out.println("\nEnter the payment amount: ");

        int payment;
        while (true) {
            try {
                payment = Integer.parseInt(reader.readLine());
                System.out.printf("\nThe payment amount: %d\n", payment);
                break;
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the payment amount: \n");
            }
        }

        loanInformation(debt, payment);

        reader.close();
    }

    private static void loanInformation(int sum, int pay) {
        int indebtednessSum = sum - pay;
        System.out.print("\nLoan status information: \n");
        System.out.printf("Credit amount: %d\n", sum);
        if (indebtednessSum < 0) {
            System.out.printf("Overpayment amount: %d", Math.abs(indebtednessSum));
        } else if (indebtednessSum > 0) {
            System.out.printf("Amount of indebtedness: %d", indebtednessSum);
        } else {
            System.out.print("There is no debt.");
        }
    }

}
