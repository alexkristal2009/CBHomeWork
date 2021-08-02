package JavaEssential.HomeWork008.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Worker[] workers = new Worker[5];
        String initials;
        String position;
        String yearStart;

        for (int i = 0; i < workers.length; i++) {

            try {

                /* проверку на ввод фио и должности, чтобы строка не начиналась
                с пробела или не заканчивалась пробелом, так как теоретически
                должность может содержать любое количество слов, цифр и тд.
                а также проверка на пустую строку или строку содержащую только пробелы
                 */

                System.out.println("Enter the last name and initials for the " + i + " employee: ");
                // проверка ввода фио
                while (true) {
                    initials = reader.readLine();
                    if (!initials.matches("^\\S.*\\S$") || initials.isEmpty()) {
                        System.out.println("Invalid input. Enter the last name and initials for the " + i + " employee: ");
                    } else {
                        break;
                    }
                }

                System.out.println("Enter the position for the " + i + " employee: ");
                // проверка ввода должности
                while (true) {
                    position = reader.readLine();
                    if (!position.matches("^\\S.*\\S$") || position.isEmpty()) {
                        System.out.println("Invalid input. Enter the position for the " + i + " employee: ");
                    } else {
                        break;
                    }
                }

                System.out.println("Enter the year of the beginning of work: ");
                // здесь проверку не делаем так как нам НУЖНО исключение
                yearStart = reader.readLine();

                // метод проверки формата ввода года начала работы
                checkInputYear(yearStart);

                workers[i] = new Worker(initials, position, yearStart);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // простой вывод в консоль списка работников до сортировки по алфавиту
        System.out.println("\nNot sorted arr ");
        for (Worker work : workers) {
            System.out.println(work);
        }

        // сортировка массива workers по фио
        Arrays.sort(workers);

        // простой вывод в консоль списка работников после сортировки алфавиту
        System.out.println("\nSorted arr ");
        for (Worker work : workers) {
            System.out.println(work);
        }

        System.out.println("Enter the seniority limit: ");
        String seniority = reader.readLine();

        // метод для проверки граничного срока работы
        checkSeniority(seniority, workers);

        reader.close();
    }


    // метод проверки формата ввода даты
    public static void checkInputYear(String string) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy");

        try {
            Date date = format.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    // метод для проверки граничного срока работы
    public static void checkSeniority(String string, Worker[] workers) {

        Date yearToday = new Date(); // сегодняшняя дата
        SimpleDateFormat format = new SimpleDateFormat("yyyy"); // формат сегодняшней дата
        String toDayYear = format.format(yearToday); // строка хранящая сегодняшняшнюю дату

        for (int i = 0; i < workers.length; i++) { // перебор каждого сотрудника
            if (workers[i].getYearStart().matches("\\d{4}")){ // проверка если год устройства на работу сотрудника[i] содержит только 4 цифры то ОК, если нет то вывод "неизвестный год начала работы"

                int start = Integer.parseInt(workers[i].getYearStart()); // получаем когд начала работы сотрудника[i]
                int experience = Integer.parseInt(toDayYear) - start; // получаем опыт сотрудника[i] ---> от сегодняшнего года отнимаем год начала работы

                if (experience > Integer.parseInt(string)) { // условие --> если опыт сотрудникка[i] больше чем число введенное пользователем(граничный срок работы), то пора на пенсию, если нет, то работник все еще может работать
                    System.out.println(workers[i].getInitials() + " - it's time to retire)");
                } else {
                    System.out.println(workers[i].getInitials() + " can still work!");
                }
            } else {
                System.out.println("Unknown year the employee started working of worker " + workers[i].getInitials());
            }
        }
    }
}