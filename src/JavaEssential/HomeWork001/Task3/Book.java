package JavaEssential.HomeWork001.Task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Book {
    public static void main(String[] args) {

        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the title of the book: ");

        String bookTitle;

        while (true) {
            try {
                bookTitle = reader.readLine();
                if (bookTitle.isEmpty() || bookTitle.startsWith(" ") || bookTitle.endsWith(" ")) {
                    System.out.print("Invalid input. Enter the title of the book: ");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the title of the book: ");
            }
        }

        System.out.print("Enter the author of the book: ");

        String bookAuthor;

        while (true) {
            try {
                bookAuthor = reader.readLine();
                if (bookAuthor.isEmpty() || bookAuthor.startsWith(" ") || bookAuthor.endsWith(" ")) {
                    System.out.print("Invalid input. Enter the author of the book: ");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the author of the book: ");
            }
        }

        System.out.print("Enter the content of the book: ");

        String bookContent;

        while (true) {
            try {
                bookContent = reader.readLine();
                // здесь добавим проверку чтобы ввод не содержал только цифры, так как название и автор(псевдоним) книги могут состоять только из цифр
                // ясно что можно ввести одну буву и одну и все зайдет, но все же содержавние не может содержать только цифры
                if (bookContent.isEmpty() || bookContent.startsWith(" ") || bookContent.endsWith(" ") || bookContent.matches("^\\d+$")) {
                    System.out.print("Invalid input. Enter the content of the book: ");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Enter the content of the book: ");
            }
        }

        title.setTitle(bookTitle);
        title.show();

        author.setAuthor(bookAuthor);
        author.show();

        content.setContent(bookContent);
        content.show();
    }
}
