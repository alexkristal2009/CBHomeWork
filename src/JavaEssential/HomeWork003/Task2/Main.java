package JavaEssential.HomeWork003.Task2;

public class Main {

    public static void main(String[] args) {

        System.out.println("ClassRoom1\n");
        ClassRoom classRoom1 = new ClassRoom(new ExcellentPupil(), new BadPupil());

        System.out.println("\nClassRoom2\n");
        ClassRoom classRoom2 = new ClassRoom(new ExcellentPupil(), new BadPupil(), new GoodPupil());

        System.out.println("\nClassRoom3\n");
        ClassRoom classRoom3 = new ClassRoom(new ExcellentPupil(), new BadPupil(), new GoodPupil(), new ExcellentPupil());

    }
}
