package homework_2.phone;

import java.util.UUID;

public abstract class Phone implements IPhone {
    private int batteryLife;
    private String color;
    private String material;
    private String manufacturer;
    private String model;
    private String name;
    private Contacts contacts;
    private Messages messages;
    private Calls calls;

    public Phone() {
        this.contacts = new Contacts();
        this.messages = new Messages();
        this.calls = new Calls();
    }

    // battery life
    protected void setBatteryLife(int batteryLife) { this.batteryLife = batteryLife; }
    public int getBatteryLife() { return this.batteryLife; }

    // color
    public String getColor() { return this.color; }
    public void setColor(String color) { this.color = color; }

    // material
    public String getMaterial() { return this.material; }
    public void setMaterial(String material) { this.material = material; }

    // manufacturer
    protected void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public String getManufacturer() { return this.manufacturer; }

    // model
    protected void setModel(String model) { this.model = model; }
    public String getModel() { return this.model; }

    // name
    protected void setName() {
        this.name = this.getModel() + " "+ UUID.randomUUID().toString();
    }
    public String getName() { return name; }

    // contacts
    public void addContact(String id, String phoneNumber, String firstName, String lastName) {
        this.contacts.addContact(new Contact(id, phoneNumber, firstName, lastName));
    }

    public void listContacts() {
        this.contacts.print();
    }

    // messages
    public void sendMessage(String phoneNumber, String messageContent) {
        this.messages.addMessage(new Message(phoneNumber, messageContent));
        this.batteryLife -= 1;
    }

    public void listMessages(String phoneNumber) {
        this.messages.print(phoneNumber);
    }

    // calls
    public void call(String phoneNumber) {
        this.calls.addCall(new Call(phoneNumber));
        this.batteryLife -= 2;
    }

    public void viewHistory() {
        this.calls.print();
    }
}

