package homework_3;

public class Person {
    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(this.name + ", " + this.age);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;

        if (this.getClass() != other.getClass()) return false;

        Person person = (Person) other;
        return this.name.equals(person.name) && this.age.equals(person.age);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
