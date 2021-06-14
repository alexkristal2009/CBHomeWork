package JavaStarter.HomeWork009.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UserArray {

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

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 201 - 100);
        }

        System.out.print("Enter a new value which you want to add: \n");
        int newValue;
        while (true) {
            try {
                newValue = Integer.parseInt(reader.readLine());
//                System.out.printf("You entered: %d\n", arraySize);
                break;
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the size of the array: \n");
            }
        }
        System.out.printf("Old array: %s\n", Arrays.toString(array));
        System.out.printf("New array: %s\n", Arrays.toString(addNewElements(array, newValue)));

        reader.close();
    }

    public static int[] addNewElements(int[] someArray, int value) {
        int newArraySize = someArray.length + 1;
        int[] newArray = new int[newArraySize];
        newArray[0] = value;
        for (int a = 1; a < newArray.length; a++) {
            newArray[a] = someArray[a - 1];
        }
        return newArray;
    }

}
