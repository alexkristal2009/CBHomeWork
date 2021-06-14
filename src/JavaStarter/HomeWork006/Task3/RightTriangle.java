package JavaStarter.HomeWork006.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightTriangle {

    public void drawRightTriangle() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a size of right triangle: ");

        String sideStr;
        int sideInt;

        while (true) {
            sideStr = reader.readLine();
            try {
                // парсим строку sideStr для того, чтобы проверить на ввод только число
                sideInt = Integer.parseInt(sideStr);
                if (sideInt > 1 && sideInt < Integer.MAX_VALUE) {
                    System.out.println("The a size of right triangle: " + sideInt);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter a size of right triangle: ");
            }
        }

        for (int i = 0; i < sideInt; i++) {
            for (int j = 0; j < sideInt; j++){
                if (i >= j){
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }

        System.out.println("---------------");

        for (int i = 0; i < sideInt; i++) {
            for (int j = sideInt; j >= 0; j--){
                if (j > i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        reader.close();
    }

}
