package JavaEssential.HomeWork007.Task2;

public enum Animals {

    Dog(5),
    Cat(2),
    Hamster(1);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + " is belongs to animals. He is " + age + " years old.";
    }
}
