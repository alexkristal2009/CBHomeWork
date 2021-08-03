package JavaProfessional.HomeWork001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            System.out.println(temp);
        }

    }

}
