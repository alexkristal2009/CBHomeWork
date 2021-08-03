package JavaEssential.HomeWork009;

public class Monitor extends Device{

    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {

        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;

    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {

        return "Monitor: manufacturer = " + getManufacturer() + ","
                + " price = " + getPrice() + ","
                + " serialNumber = " + getSerialNumber() + ","
                + " X = " + getResolutionX() + ","
                + " Y = " + getResolutionY();

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {

        int result = 17;

        result = super.hashCode();

        result = 37 * result + resolutionX;
        result = 37 * result + resolutionY;

        return result;
    }
}
