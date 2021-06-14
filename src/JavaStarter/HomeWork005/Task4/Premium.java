package JavaStarter.HomeWork005.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Premium {

    public static void main(String[] args) throws IOException {
        // Самостоятельная деятельность учащегося - Задание 4

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String userInputSalary;
        double userSalary = 0;
        String userInputExperience;
        double userExperience;

        double userAward;

        System.out.println("Enter your salary: ");

        while (true){
            userInputSalary = reader.readLine();
            try {
                userSalary = Double.parseDouble(userInputSalary);
                if (userSalary > 0 && userSalary < Double.MAX_VALUE) {
                    System.out.println("Your salary: " + userSalary + "$");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter your salary: ");
            }
        }

        System.out.println("Enter your experience: ");

        while (true){
            userInputExperience = reader.readLine();
            try {
                userExperience = Double.parseDouble(userInputExperience);
                if (userExperience >= 0 && userExperience < Double.MAX_VALUE) {
                    System.out.println("Your experience: " + userExperience + " years");
                    System.out.println("Your new salary: " + checkAward(userExperience, userSalary) + "$");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter your experience: ");
            }
        }
        reader.close();
    }
    public static double checkAward(double experience, double salary) {
        double temp = 0;
        if (experience >= 0 && experience < 5) {
            System.out.println("Your award: 10%");
            temp = (salary * 10) / 100 + salary;
        } else if (experience >= 5 && experience < 10) {
            System.out.println("Your award: 15%");
            temp = (salary * 15) / 100 + salary;
        } else if (experience >= 10 && experience < 15) {
            System.out.println("Your award: 25%");
            temp = (salary * 25) / 100 + salary;
        } else if (experience >= 15 && experience < 20) {
            System.out.println("Your award: 35%");
            temp = (salary * 35) / 100 + salary;
        } else if (experience >= 20 && experience < 25) {
            System.out.println("Your award: 45%");
            temp = (salary * 45) / 100 + salary;
        } else if (experience >= 25) {
            System.out.println("Your award: 50%");
            temp = (salary * 50) / 100 + salary;
        }
        return temp; // возвращает уже готовую зп с учетом премии
    }
}
