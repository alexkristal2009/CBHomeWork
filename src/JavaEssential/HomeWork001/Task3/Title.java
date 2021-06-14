package JavaEssential.HomeWork001.Task3;

public class Title {

    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    void show () {
        System.out.printf("%nTitle of the book: %s%n", this.title);
    }
}
