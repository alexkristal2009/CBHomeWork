package JavaEssential.HomeWork008.Task2;

public class Worker implements Comparable<Worker>{

    private String initials;
    private String position;
    private String yearStart;

    public Worker(String initials, String position, String yearStart) {
        this.initials = initials;
        this.position = position;
        this.yearStart = yearStart;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getYearStart() {
        return yearStart;
    }

    public void setYearStart(String yearStart) {
        this.yearStart = yearStart;
    }

    @Override
    public String toString() {
        return "Фамилия и иницалы работника - "
                + this.initials + "\nДолжность работника - "
                + this.position + "\nГод поступления на работу - "
                + this.yearStart + "\n";
    }

    // сортировка по фио
    @Override
    public int compareTo(Worker worker) {
        return this.initials.compareTo(worker.initials);
    }
}
