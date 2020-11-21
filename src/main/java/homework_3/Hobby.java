package homework_3;

import java.util.List;

public class Hobby {
    private final String name;
    private final int frequency;
    private final List<Address> list;

    public Hobby(String name, int frequency, List<Address> list) {
        super();
        this.name = name;
        this.frequency = frequency;
        this.list = list;
    }

    public void print() {
        System.out.println("Hobby: " + name);
        System.out.println("- frequency: " + frequency + " times a week");
        System.out.print("- where: ");
        list.forEach(Address::print);
        System.out.println();
    }
}
