package homework_2.phone;

public class SamsungGalaxyS6 extends Samsung {
    private String name;
    private final int BATTERY_LIFE = 1000;

    public SamsungGalaxyS6() {
        super();
        this.setBatteryLife(BATTERY_LIFE);
        this.setModel("Samsung Galaxy S6");
        this.setMaterial("plastic");
        this.setColor("red");
        this.setName();
    }
}
