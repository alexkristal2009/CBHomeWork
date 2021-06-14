package JavaStarter.HomeWork003;

import JavaStarter.HomeWork003.Task1.ArithmeticOperation;
import JavaStarter.HomeWork003.Task2.ArithmeticAverage;
import JavaStarter.HomeWork003.Task3.Circle;
import JavaStarter.HomeWork003.Task4.Volume;

public class Main {

    public static void main(String[] args) {

        int x = 10, y = 13, z = 3;

        System.out.println("------------------- Задание 1 -------------------");

        ArithmeticOperation someOperation = new ArithmeticOperation();
        someOperation.arithmeticAction(x, y, z);

        System.out.println("------------------- Задание 2 -------------------");

        ArithmeticAverage someAverage = new ArithmeticAverage();
        System.out.println("Cреднее арифметическое Integer: " + someAverage.integerAverage(x, y, z));
        System.out.println("Cреднее арифметическое Double: " + someAverage.doubleAverage(x, y, z));

        System.out.println("------------------- Задание 3 -------------------");

        Circle circle = new Circle();
        circle.area();

        System.out.println("------------------- Задание 4 -------------------");

        Volume volume = new Volume();
        volume.cylinderData();
    }

}
