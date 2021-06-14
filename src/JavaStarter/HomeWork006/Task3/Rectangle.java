package JavaStarter.HomeWork006.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {

    public void drawRectangle() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a size of rectangle: ");
        System.out.print("Enter a width : ");

        String widthStr;
        int widthInt;

        while (true) {
            widthStr = reader.readLine();
            try {
                // парсим строку widthStr для того, чтобы проверить на ввод только число
                widthInt = Integer.parseInt(widthStr);
                if (widthInt > 1 && widthInt < Integer.MAX_VALUE) {
                    System.out.println("Width: " + widthInt);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter a width: ");
            }
        }

        System.out.println("Enter a length  : ");

        String lengthStr;
        int lengthInt;

        while (true) {
            lengthStr = reader.readLine();
            try {
                // парсим строку lengthStr для того, чтобы проверить на ввод только число
                lengthInt = Integer.parseInt(lengthStr);
                if (lengthInt > widthInt && lengthInt < Integer.MAX_VALUE) {
                    System.out.println("LengthInt: " + lengthInt);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter a lengthInt: ");
            }
        }

        // внешний цикл - ширина
        for (int i = 0; i < widthInt; i++) {
            // внутренний цикл - длина
            for (int j = 0; j < lengthInt; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        reader.close();
    }
}
