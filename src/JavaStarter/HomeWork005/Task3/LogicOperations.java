package JavaStarter.HomeWork005.Task3;

public class LogicOperations {

    public static void main(String[] args) {
        // Самостоятельная деятельность учащегося - Задание 3
        int x = 5, y = 10, z = 15;

        System.out.println(x += y >> x++ * z);
        System.out.println(z = ++x & y * 5);
        System.out.println(y /= x + 5 | z);
        System.out.println(z = x++ & y * 5);
        System.out.println(x = y << x++ ^ z);
    }

}
