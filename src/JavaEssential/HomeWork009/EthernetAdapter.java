package JavaEssential.HomeWork009;

public class EthernetAdapter {

    private int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed && mac.equals(that.mac);
    }

    @Override
    public int hashCode() {

        int result = 17;

        result = 37 * 17 + speed;
        result = 37 * 17 + (mac == null ? 0 : mac.hashCode());

        return result;
    }
}
