package homework_3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person person, Person other) {
        return person.getAge().compareTo(other.getAge());
    }
}
