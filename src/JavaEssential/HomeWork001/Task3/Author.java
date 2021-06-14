package JavaEssential.HomeWork001.Task3;

public class Author {

    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    void show () {
        System.out.printf("%nAuthor of the book: %s%n", this.author);
    }

}
