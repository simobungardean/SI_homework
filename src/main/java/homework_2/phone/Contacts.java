package homework_2.phone;

import java.util.ArrayList;

public class Contacts {
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void print() {
        System.out.println("Contact List:");
        System.out.println("------------");
        for(Contact contact: this.contacts) {
            System.out.print("Id: " + contact.getId() + ", ");
            System.out.print("Phone Number: " + contact.getPhoneNumber() + ", ");
            System.out.println("Name: " + contact.getFirstName() + ", " + contact.getLastName());
        }
        System.out.println();
    }
}
