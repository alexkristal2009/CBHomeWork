package JavaEssential.HomeWork010.Task3;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<TKey,TValue> {

    private Map<TKey, TValue> map = new HashMap<>();

    public void putMap(TKey key, TValue value) {
        map.put(key, value);
    }

    public TValue getIndexOfMapPair(TKey index){
        return map.get(index);
    }

    public int getSize() {
        return map.size();
    }

    public void printMap() {
        for(Map.Entry<TKey, TValue> item : map.entrySet()){
            System.out.printf("Key: %s - Value: %s \n", item.getKey(), item.getValue());
        }
    }

}
