package JavaEssential.HomeWork008.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Price[] arrPrice = new Price[2];

        String productName;
        String shopName;
        String price;

        try {

            for (int i = 0; i < arrPrice.length; i++) {

                /*
                проверка на ввод чтобы строка не начиналась с пробела или не заканчивалась пробелом,
                а также проверка на пустую строку или строку содержащую только пробелы
                 */

                System.out.println("Enter the product name: ");
                productName = reader.readLine();

                while (true) {

                    if (!productName.matches("^\\S.*\\S$") || productName.isEmpty()) {

                        System.out.println("Invalid input. Enter the product name: ");
                        productName = reader.readLine();


                    } else {
                        break;
                    }
                }

                /*
                проверка на ввод чтобы строка не начиналась с пробела или не заканчивалась пробелом,
                а также проверка на пустую строку или строку содержащую только пробелы
                 */

                System.out.println("Enter the name of the store: ");
                shopName = reader.readLine();

                while (true) {

                    if (!shopName.matches("^\\S.*\\S$") || shopName.isEmpty()) {

                        System.out.println("Invalid input. Enter the name of the store: ");
                        shopName = reader.readLine();

                    } else {
                        break;
                    }
                }

                // проверка на ввод только цифры
                System.out.println("Enter the cost of the item: ");
                price = reader.readLine();

                while (true) {

                    if (price.matches("^\\d+\\.?\\d+$")) {
                        double a = Double.parseDouble(price);
                        if (a <= 0) {

                            System.out.println("Invalid input. Enter the cost of the item: ");
                            price = reader.readLine();

                        } else {
                            break;
                        }

                    } else {
                        System.out.println("Invalid input. Enter the cost of the item: ");
                        price = reader.readLine();
                    }
                }

                arrPrice[i] = new Price(productName, shopName, price);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // вывод в консоль до сортировки
        System.out.println("Before sorting: \n");

        for (Price p : arrPrice) {
            System.out.println(p);
        }

        // сортировка массива по алфавиту
        Arrays.sort(arrPrice);

        // вывод в консоль после сортировки
        System.out.println("After sorting: \n");

        for (Price p : arrPrice) {
            System.out.println(p);
        }

        System.out.println("Enter the name of the shop to search: ");
        String shopSearch = reader.readLine();

        checkShopsList(shopSearch, arrPrice);


    }

    private static void checkShopsList(String shopSearch, Price[] arrPrice) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

            if (shopSearch.matches("^\\S.*\\S$") || shopSearch.isEmpty()) {

                for (int i = 0; i < arrPrice.length; i++) {

                    if (shopSearch.equalsIgnoreCase(arrPrice[i].getShopName())){
                        System.out.println("\nSearch store: " + arrPrice[i]);
                        break;
                    } else {
                        throw new Exception();
                    }
                }

            } else {
                System.out.println("Invalid input. Enter the name of the store to search: ");
                shopSearch = reader.readLine();
            }
            break;
        }

        reader.close();
    }
}
