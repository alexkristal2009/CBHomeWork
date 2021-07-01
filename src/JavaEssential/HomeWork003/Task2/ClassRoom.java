package JavaEssential.HomeWork003.Task2;

public class ClassRoom {

    public ClassRoom(Pupil pupil) {
        pupil.study();
        pupil.read();
        pupil.write();
        pupil.relax();
    }

    public ClassRoom(Pupil pupil1,Pupil pupil2) {
        this(pupil1);
        pupil2.study();
        pupil2.read();
        pupil2.write();
        pupil2.relax();
    }

    public ClassRoom(Pupil pupil1,Pupil pupil2, Pupil pupil3) {
        this(pupil1, pupil2);
        pupil3.study();
        pupil3.read();
        pupil3.write();
        pupil3.relax();
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this(pupil1, pupil2, pupil3);
        pupil4.study();
        pupil4.relax();
        pupil4.write();
        pupil4.relax();
    }
}
