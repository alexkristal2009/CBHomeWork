package JavaEssential.HomeWork005.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            arrayList.set(listIterator.nextIndex(), listIterator.nextIndex() + 1);
            System.out.println(listIterator.next());
        }

    }
}
