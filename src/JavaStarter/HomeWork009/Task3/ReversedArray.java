package JavaStarter.HomeWork009.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) throws IOException {
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

        System.out.print("Enter the number of the element from which you want to start copying the array but not larger than the size of the array: \n");
        int numberElement;
        while (true) {
            try {
                numberElement = Integer.parseInt(reader.readLine());
                if (numberElement < arraySize && numberElement > 0) {
//                    System.out.printf("You entered: %d\n", numberElement);
                    break;
                } else {
                    System.out.print("Invalid input. Enter the number of the element from which you want to start copying the array but not larger than the size of the array: \n");
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the number of the element from which you want to start copying the array but not larger than the size of the array: \n");
            }
        }

        System.out.print("Enter the size of new array: \n");
        int newSize;
        while (true) {
            try {
                newSize = Integer.parseInt(reader.readLine());
                if (newSize > 0) {
//                    System.out.printf("You entered: %d\n", newSize);
                    break;
                } else {
                    System.out.print("Invalid input. Enter the size of new array: \n");
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the size of new array: \n");
            }
        }
        System.out.printf("Inverted array: %s\n", Arrays.toString(myReverse(array)));
        System.out.printf("The part of first array: %s\n", Arrays.toString(subArray(array, numberElement, newSize)));

        reader.close();
    }

    public static int[] myReverse(int[] someArray) {

        for (int a = someArray.length - 1; a > 0; a--) {
            for (int b = 0; b < a; b++) {
                if (someArray[b] < someArray[b + 1]) {
                    int value = someArray[b];
                    someArray[b] = someArray[b + 1];
                    someArray[b + 1] = value;
                }
            }
        }
        return someArray;
    }


    public static int[] subArray(int[] someArray, int index, int count) {
        int[] part = new int[count];
        int counter = 0;

        try {
            for(int a = 0; a < someArray.length; a++) {
                part[a] = someArray[a + index];
            }
        } catch (Exception e) {
            for (int b = someArray.length - index; b < part.length; b++) {
                part[b] = 1;
            }
        }
        return part;
    }
}
