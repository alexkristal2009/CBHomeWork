package JavaStarter.HomeWork006.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rhombus {

    public void drawRhombus() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a quantity of rows rhombus starting from 3: ");

        String rowsStr;
        int rowsInt;

        while (true) {
            rowsStr = reader.readLine();
            try {
                // парсим строку rowsStr для того, чтобы проверить на ввод только число
                rowsInt = Integer.parseInt(rowsStr);
                if (rowsInt > 2 && rowsInt < Integer.MAX_VALUE) {
                    System.out.println("Quantity of rows: " + rowsInt);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter a quantity of rows: ");
            }
        }

        if (rowsInt % 2 != 0) {

            int half = (rowsInt + 1) / 2;

            for (int up = 1; up <= half; up++) {

                for (int sp = 1; sp <= half - up; sp ++) {
                    System.out.print("  ");
                }

                for (int st = 1; st <= (up * 2 - 1); st++) {
                    System.out.print("* ");
                }

                System.out.println();

            }

            for (int dn = 1; dn <= half - 1; dn++) {

                for (int sp = 1; sp <= dn; sp++) {
                    System.out.print("  ");
                }

                for (int st = 1; st <= 2 * (half - dn) - 1; st++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

        } else {

            int half = rowsInt / 2;

            for (int up = 0; up <= half; up++) {

                for (int sp = 1; sp <= half - up; sp ++) {
                    System.out.print("  ");
                }

                for (int st = 1; st <= (up * 2 - 1); st++) {
                    System.out.print("* ");
                }

                System.out.println();

            }

            for (int dn = 0; dn <= half - 1; dn++) {

                for (int sp = 1; sp <= dn; sp++) {
                    System.out.print("  ");
                }

                for (int st = 1; st <= 2 * (half - dn) - 1; st++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
        reader.close();
    }

}
