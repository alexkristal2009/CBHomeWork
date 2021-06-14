package JavaStarter.HomeWork006.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilateralTriangle {

    public void drawEquilateralTriangle() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a quantity of rows of equilateral triangle starting from 2: ");

        String rowsStr;
        int rowsInt;

        while (true) {
            rowsStr = reader.readLine();
            try {
                // парсим строку rowsStr для того, чтобы проверить на ввод только число
                rowsInt = Integer.parseInt(rowsStr);
                if (rowsInt > 1 && rowsInt < Integer.MAX_VALUE) {
                    System.out.println("Quantity of rows: " + rowsInt);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter a quantity of rows: ");
            }
        }

        for (int rows = 0; rows < rowsInt; rows++) {
            for (int spacesLeft = 0; spacesLeft < (rowsInt - rows); spacesLeft++) {
                System.out.print(" ");
            }
            for (int asterisk = 0; asterisk < 2 * rows + 1; asterisk++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("------------------");

        for (int i = 1; i <= rowsInt; i++) {
            for (int j = i; j <= rowsInt; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        reader.close();
        // решение путем проб и ошибок
//        for (int i = 0; i < sideInt; i++) {
//            for (int j = sideInt; j >= 0; j--){
//                if (j > i){
//                    System.out.print(" ");
//                } else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.print("\n");
//        }


    }
}
