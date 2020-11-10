package homework_2.phone;

public class SamsungGalaxyJ5 extends Samsung {
    private String name;
    private final int BATTERY_LIFE = 1500;

    public SamsungGalaxyJ5() {
        super();
        this.setBatteryLife(BATTERY_LIFE);
        this.setModel("Samsung Galaxy J5");
        this.setMaterial("plastic");
        this.setColor("white");
        this.setName();
    }
}
