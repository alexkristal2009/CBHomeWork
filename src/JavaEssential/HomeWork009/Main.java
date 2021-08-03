package JavaEssential.HomeWork009;

public class Main {

    public static void main(String[] args) {

        // Device
        Device device1 = new Device("Nokia", 2253.35f, "58746987");
        Device device2 = new Device("Samsung", 4283.38f, "34895621");
        Device device3 = new Device("Nokia", 2253.35f, "58746987"); // равен device1

        System.out.println("device1 & device2 - " + device1.equals(device2));
        System.out.println("device2 & device3 - " + device2.equals(device3));
        System.out.println("device3 & device1 - " + device3.equals(device1));

        System.out.println("-----------------------------");

        // Device --> Monitor
        Device monitorDevice1 = new Monitor("Siemens", 3256.84f, "74851236", 4589, 6523);
        Device monitorDevice2 = new Monitor("Iphone", 5236.25f,"74125896", 8523, 9632);
        Device monitorDevice3 = new Monitor("Siemens", 3256.84f, "74851236", 4589, 6523); // равен monitorDevice1
        Device monitorDevice4 = new Monitor("HP", 44256.84f, "73518123", 8547, 8514); // равен monitor4

        System.out.println("monitorDevice1 & monitorDevice2 - " + monitorDevice1.equals(monitorDevice2));
        System.out.println("monitorDevice2 & monitorDevice3 - " + monitorDevice2.equals(monitorDevice3));
        System.out.println("monitorDevice3 & monitorDevice1 - " + monitorDevice3.equals(monitorDevice1));

        System.out.println("-----------------------------");

        // Monitor --> Monitor
        Monitor monitor1 = new Monitor("Lenovo", 8562.54f, "74859632", 1236, 4589);
        Monitor monitor2 = new Monitor("ASUS", 10562.54f, "78963258", 7436, 4829);
        Monitor monitor3 = new Monitor("Lenovo", 8562.54f, "74859632", 1236, 4589); // равен monitor1
        Monitor monitor4 = new Monitor("HP", 44256.84f, "73518123", 8547, 8514); // равен monitorDevice4

        System.out.println("monitor1 & monitor2 - " + monitor1.equals(monitor2));
        System.out.println("monitor2 & monitor3 - " + monitor2.equals(monitor3));
        System.out.println("monitor3 & monitor1 - " + monitor3.equals(monitor1));

        System.out.println("-----------------------------");

        System.out.println("monitorDevice1 & monitor1 " + monitorDevice1.equals(monitor1));

        System.out.println("-----------------------------");

        // EthernetAdapter
        EthernetAdapter ethernetAdapter1 = new EthernetAdapter(100, "4785632115896541615678233658");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter(150, "5846321589645630156314563245");
        EthernetAdapter ethernetAdapter3 = new EthernetAdapter(100, "4785632115896541615678233658"); // равен ethernetAdapter1

        System.out.println("ethernetAdapter1 & ethernetAdapter2 - " + ethernetAdapter1.equals(ethernetAdapter2));
        System.out.println("ethernetAdapter2 & ethernetAdapter3 - " + ethernetAdapter2.equals(ethernetAdapter3));
        System.out.println("ethernetAdapter3 & ethernetAdapter1 - " + ethernetAdapter3.equals(ethernetAdapter1));

    }

}
