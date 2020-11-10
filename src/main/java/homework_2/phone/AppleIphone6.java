package homework_2.phone;

public class AppleIphone6 extends Apple {
    private String name;
    private final int BATTERY_LIFE = 2000;

    public AppleIphone6() {
        super();
        this.setBatteryLife(BATTERY_LIFE);
        this.setModel("Apple iPhone 6");
        this.setMaterial("metal");
        this.setColor("black");
        this.setName();
    }
}
