package JavaEssential.HomeWork001.Task3;

public class Content {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    void show () {
        System.out.printf("%nContent of the book: %s%n", this.content);
    }

}
