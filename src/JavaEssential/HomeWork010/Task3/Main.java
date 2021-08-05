package JavaEssential.HomeWork010.Task3;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        MyDictionary<String, String> myDictionary = new MyDictionary<>();
        myDictionary.putMap("Dog", "Собака");
        myDictionary.putMap("Cat", "Кот");
        myDictionary.putMap("Parrot", "Попугай");

        System.out.println("myDictionary content: ");
        myDictionary.printMap();

        System.out.println("Index of \"Cat\" - " + myDictionary.getIndexOfMapPair("Cat"));

        System.out.println("Size - " + myDictionary.getSize() + " pairs");
    }
}
