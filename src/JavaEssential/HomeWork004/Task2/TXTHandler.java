package JavaEssential.HomeWork004.Task2;

public class TXTHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("Open TXT");
    }

    @Override
    void create() {
        System.out.println("Create TXT");
    }

    @Override
    void change() {
        System.out.println("Change TXT");
    }

    @Override
    void save() {
        System.out.println("Save TXT");
    }
}
