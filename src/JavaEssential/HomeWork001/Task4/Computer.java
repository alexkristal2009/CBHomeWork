package JavaEssential.HomeWork001.Task4;

public class Computer {
    String detail;

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];

        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Computer computer3 = new Computer();
        Computer computer4 = new Computer();
        Computer computer5 = new Computer();

        for (int a = 0; a < 5; a++) {
            computers[a] = new Computer();
        }

        for (Object o : computers) {
            System.out.print(o);
        }
    }
}
