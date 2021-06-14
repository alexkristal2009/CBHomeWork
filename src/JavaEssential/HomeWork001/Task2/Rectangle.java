package JavaEssential.HomeWork001.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Rectangle {

    double side1;
    double side2;

    double areaCalculator (double side1, double side2) {
        return side1 * side2;
    }

    double perimeterCalculator (double side1, double side2){
        return 2 * (side1 + side2);
    }
}
