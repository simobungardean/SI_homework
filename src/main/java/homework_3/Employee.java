package homework_3;

public class Employee extends Person {
    private final String job;
    private final String workplace;

    public Employee(String name, int age, String job, String workplace) {
        super(name, age);
        this.job = job;
        this.workplace = workplace;
    }

    public void print() {
        System.out.println(this.getName() + ", " + this.getAge());
        System.out.println("Works as a/an " + this.job + " at " + this.workplace);
    }
}
