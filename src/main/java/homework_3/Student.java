package homework_3;

public class Student extends Person {
    private final String faculty;
    private final String facultyCity;
    private final String field;

    public Student(String name, int age, String field, String faculty, String facultyCity) {
        super(name, age);
        this.field = field;
        this.faculty = faculty;
        this.facultyCity = facultyCity;
    }

    public void print() {
        System.out.println(this.getName() + ", " + this.getAge());
        System.out.println("Studies " +
                this.field + " at " +
                this.faculty + ", " +
                this.facultyCity
        );
    }
}
