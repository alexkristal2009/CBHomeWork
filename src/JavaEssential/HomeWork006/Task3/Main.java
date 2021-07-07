package JavaEssential.HomeWork006.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Distance.Converter instance = new Distance.Converter();

        System.out.println("Hello! Welcome to the best length converter!");
        System.out.println("Please make your selection and click:\n" +
                "1 - convert miles to kilometers;\n" +
                "2 - convert kilometers to meters;\n" +
                "3 - convert meters to centimeters;\n" +
                "4 - convert centimeters to millimeters.");

        String choice;

        while (true) {
            try {
                choice = reader.readLine();
                if (choice.matches("[1-4]{1}")) {
                    break;
                } else {
                    System.out.println("Invalid input! Re-enter!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String miles;
        String kilometers;
        String meters;
        String centimeters;



        switch (choice){

            case "1":
                System.out.println("Enter the number of miles: ");
                while (true) {
                    try {
                        miles = reader.readLine();
                        if (miles.matches("\\d+\\.?\\d*")) {
                            break;
                        } else {
                            System.out.println("Invalid input! Re-enter!");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                System.out.printf("%s miles -> %.1f kilometers", miles, instance.convertMilesToKilometers(Double.parseDouble(miles)));
                break;

            case "2":
                System.out.println("Enter the number of kilometers: ");
                while (true) {
                    try {
                        kilometers = reader.readLine();
                        if (kilometers.matches("\\d+\\.?\\d*")) {
                            break;
                        } else {
                            System.out.println("Invalid input! Re-enter!");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                System.out.printf("%s kilometers -> %.1f meters", kilometers, instance.convertKilometersToMeters(Double.parseDouble(kilometers)));
                break;

            case "3":
                System.out.println("Enter the number of meters: ");
                while (true) {
                    try {
                        meters = reader.readLine();
                        if (meters.matches("\\d+\\.?\\d*")) {
                            break;
                        } else {
                            System.out.println("Invalid input! Re-enter!");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                System.out.printf("%s meters -> %.1f centimeters", meters, instance.convertMetersToCentimeters(Double.parseDouble(meters)));
                break;

            case "4":
                System.out.println("Enter the number of centimeters: ");
                while (true) {
                    try {
                        centimeters = reader.readLine();
                        if (centimeters.matches("\\d+\\.?\\d*")) {
                            break;
                        } else {
                            System.out.println("Invalid input! Re-enter!");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                System.out.printf("%s centimeters -> %.1f millimeters", centimeters ,instance.convertCentimetersToMillimeters(Double.parseDouble(centimeters)));
                break;
        }
        System.out.println("Thanks for using the best converter! Bye!");
    }
}
