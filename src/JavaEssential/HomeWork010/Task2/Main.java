package JavaEssential.HomeWork010.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        MyList<String> myList = new MyList<>();

        myList.setValue("First str");
        myList.setValue("Second str");
        myList.setValue("Third str");

        System.out.println("myList - " + myList.getList());

        System.out.println("Index of \"Second str\" - " + myList.getIndexOf("Second str"));

        System.out.println("Get value \"0\" - " + myList.getValue(0));

        System.out.println("Get size - " + myList.getSize());

        List<String> list = myList.getList();

        System.out.println("list - " + list);

        List<String> anotherList = new ArrayList<>();
        anotherList.add("String 1");
        anotherList.add("String 2");
        anotherList.add("String 3");

        System.out.println("anotherList - " + anotherList);

        myList.setList(anotherList);
        System.out.println("myList - " + myList.getList());
    }

}
