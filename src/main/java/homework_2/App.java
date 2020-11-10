package homework_2;

import homework_2.phone.Phone;
import homework_2.phone.SamsungGalaxyS6;

public class App {

    public static void main(String[] args) {

        // doesn't compile:
        // Phone phone  = new Phone();
        // Phone phone = new Apple();
        // Phone phone = new Samsung();

        // new Samsung Galaxy S6
        Phone phone = new SamsungGalaxyS6();

        // customize phone
        phone.setColor("prism blue");
        phone.setMaterial("ceramic");

        // list phone data
        System.out.println("Phone Data");
        System.out.println("----------");
        System.out.println("Manufacturer: " + phone.getManufacturer());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Battery Life: " + phone.getBatteryLife());
        System.out.println("Material: " + phone.getMaterial());
        System.out.println("Color: " + phone.getColor());
        System.out.println("Name: " + phone.getName());
        System.out.println();

        // add contacts
        phone.addContact("1", "0741123456", "Maria", "Tanase");
        phone.addContact("2", "0740111222", "Iulia", "Hasdeu");
        phone.listContacts();

        // send message to first contact
        phone.sendMessage("0741123456", "Hello! How was your day?");
        phone.listMessages("0741123456");
        System.out.println("Battery Life: " + phone.getBatteryLife());
        System.out.println();

        // call second contact
        phone.call("0740111222");
        phone.viewHistory();
        System.out.println("Battery Life: " + phone.getBatteryLife());
    }
}
