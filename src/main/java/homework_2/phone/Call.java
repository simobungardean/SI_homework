package homework_2.phone;

import java.time.LocalDate;
import java.time.LocalTime;

public class Call {
    private String phoneNumber;
    private LocalDate callDate;
    private LocalTime callTime;

    Call(String phoneNumber) {
        this.callDate = LocalDate.now();
        this.callTime = LocalTime.now();
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getCallDate() {
        return callDate;
    }

    public LocalTime getCallTime() {
        return callTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
