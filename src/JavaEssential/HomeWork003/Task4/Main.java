package JavaEssential.HomeWork003.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        int proVersionKey = 12345;
        int expVersionKey = 54321;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String checkKey = null;

        System.out.println("Enter the version key: ");

        while (true) {
            try {
                checkKey = reader.readLine();
                if (checkKey.matches("\\d+")) {
                    break;
                } else {
                    System.out.println("Invalid input. Try again: ");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (Integer.parseInt(checkKey) == proVersionKey) {

            System.out.println("You have entered the professional version!\n");
            DocumentWorker documentWorker = new ProDocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();

        } else if (Integer.parseInt(checkKey) == expVersionKey) {

            System.out.println("You have entered the expert version!\n");
            DocumentWorker documentWorker = new ExpertDocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();

        } else {

            System.out.println("Signed into free version.\n");
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();

        }
    }
}
