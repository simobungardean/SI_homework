package homework_2.phone;

interface IContact {
    void addContact(String id, String phoneNumber, String firstName, String lastName);
    void listContacts();
}

interface IMessage {
    void sendMessage(String phoneNumber, String messageContent);
    void listMessages(String phoneNumber);
}

interface ICall {
    void call(String phoneNumber);
    void viewHistory();
}

public interface IPhone extends IContact, IMessage, ICall {}
