package JavaEssential.HomeWork010.Task2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {

    private List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getSize() {
        return list.size();
    }

    public T getValue(int index) {
        return list.get(index);
    }

    public void setValue(T value) {
        list.add(value);
    }

    public int getIndexOf(T value) {
        return list.indexOf(value);
    }
}
