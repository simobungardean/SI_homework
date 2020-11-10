package homework_2.phone;

import java.util.ArrayList;

public class Messages {
    ArrayList<Message> messages = new ArrayList<Message>();

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public void print(String phoneNumber) {
        System.out.println("Message List for Phone Number: " + phoneNumber);
        System.out.println("------------");
        for(Message message: this.messages) {
            if(message.getPhoneNumber() == phoneNumber) {
                System.out.println(message.getMessage());
            }
        }
        System.out.println();
    }
}
