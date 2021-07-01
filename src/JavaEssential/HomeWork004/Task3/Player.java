package JavaEssential.HomeWork004.Task3;

public class Player implements Playable, Recodable{


    @Override
    public void play() {
        System.out.println("Playing a file");
    }

    @Override
    public void record() {
        System.out.println("File recording");
    }

    @Override
    public void pause() {
        System.out.println("Paused");
    }

    @Override
    public void stop() {
        System.out.println("Playback stopped");
    }
}
