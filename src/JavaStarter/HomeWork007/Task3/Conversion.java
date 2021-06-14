package JavaStarter.HomeWork007.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversion {

    public static void main(String[] args) throws IOException {
        // Самостоятельная деятельность учащегося - Задание 3
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Welcome to currency exchange!\n");
        // Ввод суммы денег в определенной валюте
        System.out.print("Enter the amount of money and currency: \n");
        System.out.print("For example: 100 USD (100.00 USD); 100 EUR (100.00 EUR); 100 UAH (100.00 UAH); 100 RUB (100.00 RUB).\n");
        String moneyAndCurrency;
        while (true) {
            moneyAndCurrency = reader.readLine();
            // если {} заменить на + или *, то будет выполняться жадный (ленивый) квантификатор
            if (moneyAndCurrency.matches("\\d{1,}\\.{0,1}\\d{0,}\\s(USD|EUR|UAH|RUB)")) {
                System.out.printf("You entered: %s\n", moneyAndCurrency);
                break;
            } else {
                System.out.print("Invalid input. Enter the amount of money and currency: \n");
            }
        }


        System.out.print("\nEnter the rate for converting to another currency: \n");
        System.out.print("For example: 100 USD (100.00 USD); 100 EUR (100.00 EUR); 100 UAH (100.00 UAH); 100 RUB (100.00 RUB).\n");

        String rateAndCurrency;
        while (true) {
            rateAndCurrency = reader.readLine();
            // если {} заменить на + или *, то будет выполняться жадный (ленивый) квантификатор
            if (rateAndCurrency.matches("\\d{1,}\\.{0,1}\\d{0,}\\s(USD|EUR|UAH|RUB)")) {
                // получаем строку с названием валютуы с первого ввода и сравниваем с названием валюты на втором вводе
                if (currencyName(moneyAndCurrency).equals(currencyName(rateAndCurrency))) {
                    System.out.print("Invalid input. Enter the rate for converting to another currency: \n");
                } else {
                    System.out.printf("You entered: %s\n", rateAndCurrency);
                    break;
                }
            } else {
                System.out.print("Invalid input. Enter the amount of money and currency: \n");
            }
        }

        System.out.printf("\nThe result of the currency conversion operation: %.2f %s", currencyExchange(moneyAndCurrency, rateAndCurrency), currencyName(rateAndCurrency));
        System.out.print("Thank you for using our currency exchange! Goodbye!");

        reader.close();
    }

    // метод для получения строки с названием валюты USD, EUR, UAH, RUB
    public static String currencyName(String str) {
        String[] subStr;
        String delimiter = " ";
        subStr = str.split(delimiter);
        return subStr[1];
    }

    public static double currencyExchange(String amountOfMoney, String exchangeRate) {

        String[] subStr;
        String delimiter = " ";
        subStr = amountOfMoney.split(delimiter);
        String rate = subStr[0];
        double money = Double.parseDouble(rate);

        String[] subStr2;
        String delimiter2 = " ";
        subStr = exchangeRate.split(delimiter);
        String rate2 = subStr[0];
        double rateMoney = Double.parseDouble(rate2);

        return money * rateMoney;
    }

}
