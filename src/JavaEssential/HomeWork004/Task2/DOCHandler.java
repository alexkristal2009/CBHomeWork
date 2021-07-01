package JavaEssential.HomeWork004.Task2;

public class DOCHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("Open DOC");
    }

    @Override
    void create() {
        System.out.println("Create DOC");
    }

    @Override
    void change() {
        System.out.println("Change DOC");
    }

    @Override
    void save() {
        System.out.println("Save DOC");
    }
}
