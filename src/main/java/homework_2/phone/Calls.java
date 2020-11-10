package homework_2.phone;

import java.util.ArrayList;

public class Calls  {
    ArrayList<Call> calls = new ArrayList<Call>();

    public void addCall(Call call) {
        this.calls.add(call);
    }

    public void print() {
        System.out.println("Call History List:");
        System.out.println("------------");
        for(Call call: this.calls) {
            System.out.println(call.getPhoneNumber() + " at " + call.getCallDate() + ", " + call.getCallTime());
        }
        System.out.println();
    }
}

