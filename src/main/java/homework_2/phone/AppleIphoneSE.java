package homework_2.phone;

public class AppleIphoneSE extends Apple {
    private String name;
    private final int BATTERY_LIFE = 2200;

    public AppleIphoneSE() {
        super();
        this.setBatteryLife(BATTERY_LIFE);
        this.setModel("Apple iPhone SE");
        this.setMaterial("metal");
        this.setColor("gray");
        this.setName();
    }
}
