package JavaEssential.HomeWork005.Task2;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(0, new Animal("Dog", "Barbos", 5));
        animals.add(1, new Animal("Dog", "Tuzik", 3));
        animals.add(2, new Animal("Cat", "Barsik", 4));
        animals.add(3, new Animal("Cat", "Matroskin", 1));
        animals.add(4, new Animal("Parrot", "Kesha", 3));
        animals.add(5, new Animal("Parrot", "Tosha", 7));
        animals.add(6, new Animal("Horse", "Vavilon", 4));
        animals.add(7, new Animal("Horse", "Spirit",8));

//        Для использования простого System.out.println(animals)) или System.out.println(animals.toString()),
//        лучше в переопределеннеый метод toString, класса Animal, добавить в конце перенос строки + "\n"

//        System.out.println(animals);

        Iterator<Animal> iterator = animals.iterator();

        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println(animal);
        }
    }
}

class Animal{

    private String type;
    private String name;
    int age;

    public Animal(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal type - " + getType() + ", animal name - " + getName() + ", animal age - " + getAge();
    }
}
