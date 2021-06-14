package JavaStarter.HomeWork006.Task3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Самостоятельная деятельность учащегося - Задание 3

        //Вывод прямоугольника
        Rectangle rectangle = new Rectangle();
        rectangle.drawRectangle();

        // Вывод прямоугольного треугольника
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.drawRightTriangle();

        // Вывод равностороннего треугольник
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.drawEquilateralTriangle();

        // Вывод ромба
        Rhombus rhombus = new Rhombus();
        rhombus.drawRhombus();

    }
}
