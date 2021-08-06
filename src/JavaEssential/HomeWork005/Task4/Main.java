package JavaEssential.HomeWork005.Task4;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 11; i < 22; i++) {
            arrayList.add(i);
        }

        for (Integer n : arrayList) {
            System.out.print(n + " ");
        }

        System.out.println("\n--------------------------------");

        Iterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + 1 + " ");
        }

    }
}
