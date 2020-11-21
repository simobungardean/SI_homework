package homework_3;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person person, Person other) {
        return person.getName().compareTo(other.getName());
    }

}
