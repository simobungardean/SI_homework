package homework_2.phone;

public class Message {
    private final int MAX_LENGTH = 500;
    private String phoneNumber;
    private String message;

    Message(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        if (message.length() <= this.MAX_LENGTH) {
            this.message = message;
        } else {
            this.message = message.substring(0, this.MAX_LENGTH);
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }
}

