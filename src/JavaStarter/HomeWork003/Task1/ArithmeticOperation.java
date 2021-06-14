package JavaStarter.HomeWork003.Task1;

public class ArithmeticOperation {

    public void arithmeticAction(int x, int y, int z) {
        System.out.println(x += y - x++ * z);
        System.out.println(z = --x - y * 5);
        System.out.println(y /= x + 5 % z);
        System.out.println(z = x++ + y * 5);
        System.out.println(x = y - x++ * z);
    }

}
