package JavaStarter.HomeWork004.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interval {

    public static void main(String[] args) {
        //Самостоятельная деятельность учащегося - Задание 2

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an integer number from 0 to 100: ");
        int userInputNumber = 0;
        String result;

        try {
            userInputNumber = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(result = ((userInputNumber >= 0 && userInputNumber < 15) ? "0-14" : ((userInputNumber >= 15 && userInputNumber <= 35) ? "15-35" : ((userInputNumber > 35 && userInputNumber <= 50) ? "36-50" : ((userInputNumber > 50 && userInputNumber <= 100) ? "50-100" : "You entered the wrong number! Please enter a number between 0 and 100!")))));

    }

}
