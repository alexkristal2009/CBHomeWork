package JavaStarter.HomeWork009.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CustomerArray {

    public static void main(String[] args) throws IOException {
        // Самостоятельная деятельность учащегося - Задание 2

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of the array: \n");
        int arraySize;
        while (true) {
            try {
                arraySize = Integer.parseInt(reader.readLine());
                if (arraySize > 1) {
//                    System.out.printf("You entered: %d\n", arraySize);
                    break;
                } else {
                    System.out.print("Invalid input. Enter the size of the array: \n");
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the size of the array: \n");
            }
        }

        int[] array = new int[arraySize];

        // назначение случ чисел
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 201 - 100);
        }

        // сортировка
        for (int a = array.length - 1; a > 0; a--) {
            for (int b = 0; b < a; b++) {
                if (array[b] > array[b + 1]) {
                    int value = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = value;
                }
            }
        }

        System.out.printf("\nThe largest value of the array: %d\n", array[arraySize - 1]);

        System.out.printf("The smallest value of the array: %d\n", array[0]);

        // The total sum of all elements
        totalSum(array);

        // The arithmetic mean of all the elements
        middleNumber(array);

        // odd values
        oddValue(array);


        reader.close();

    }

    private static void totalSum(int[] someValue) {
        int sum = 0;

        for (int i : someValue) {
            sum += i;
        }

        System.out.printf("The total sum of all elements: %d\n", sum);
    }

    private static void middleNumber(int[] someValue) {
        int sum = 0;

        for (int i : someValue) {
            sum += i;
        }

        int middle = sum / someValue.length;

        System.out.printf("The arithmetic mean of all the elements: %d\n", middle);
    }

    public static void oddValue(int[] someValue) {
        // чтобы не создавать массив с изботочной длиной и не занимать место
        // сначала пробегаем по массиву и считаем количество нечетных значений

        int count = 0;
        for (int a = 0; a < someValue.length; a++) {
            if (someValue[a] % 2 != 0) {
                count++;
            }
        }

        // добавляем нечетные значения в массив
        int elem = 0;
        int[] odd = new int[count];
        for (int a = 0; a < someValue.length; a++) {
            if (someValue[a] % 2 != 0) {
                odd[elem] = someValue[a];
                elem++;
            }
        }
        // Выводим в консоль
        if (odd.length == 0) {
            System.out.print("There are no odd values!\n");
        } else  {
            System.out.printf("All odd values: %s\n", Arrays.toString(odd));
        }
    }

}
