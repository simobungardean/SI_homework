package homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;


public class Main {

    public static void main(String[] args) {
        TreeSet<Person> personsName = new TreeSet<>(new NameComparator());

        Collections.addAll(personsName,
                new Person("Shakira Isabel Mebarak Ripoll", 43),
                new Person("Nadia Comăneci", 59),
                new Person("Simona Halep", 29),
                new Person("Floyd Mayweather", 43)
        );

        System.out.println("TreeSet");
        System.out.println("-------");

        System.out.println("List of the " + personsName.size() + " person(s) ordered by 'name':");
        personsName.forEach(Person::print);

        TreeSet<Person> personsAge = new TreeSet<>(new AgeComparator());
        personsAge.addAll(personsName);

        System.out.println();
        System.out.println("List of the " + personsAge.size() + " person(s) ordered by 'age':");
        personsAge.forEach(Person::print);

        System.out.println();
        System.out.println("HashMap");
        System.out.println("-------");

        HashMap<Person, List<Hobby>> hobbies = new HashMap<>();

        List<Hobby> hobbyList = new ArrayList<>();
        List<Address> addressList = new ArrayList<>();

//		first person
        Person person = new Person("Floyd Mayweather", 43);

        addressList.add(new Address(new Country("United States", Continent.NORTH_AMERICA), "Las Vegas"));
        hobbyList.add(new Hobby("boxing", 5, addressList));

        hobbies.put(person, hobbyList);

//		second person
        person = new Employee(
                "Maria Ionescu",
                38,
                "business analyst",
                "IBM"
        );
        hobbyList = new ArrayList<>();
        addressList = new ArrayList<>();
        addressList.add(new Address(new Country("Romania", Continent.EUROPE), "Cluj-Napoca"));
        addressList.add(new Address(new Country("Hungary", Continent.EUROPE), "Balaton"));
        hobbyList.add(new Hobby("dancing", 3, addressList));

        addressList = new ArrayList<>();
        addressList.add(new Address(new Country("Romania", Continent.EUROPE), "Cluj-Napoca"));
        hobbyList.add(new Hobby("singing", 2, addressList));

        hobbies.put(person, hobbyList);

//		third person
        person = new Student(
                "Magdalena Carmen Frida Kahlo y Calderón",
                22,
                "paintings",
                "Faculty of Arts and Design",
                "Mexico City"
        );
        hobbyList = new ArrayList<>();
        addressList = new ArrayList<>();
        addressList.add(new Address(new Country("Mexico", Continent.NORTH_AMERICA), "Mexico City"));
        hobbyList.add(new Hobby("painting", 7, addressList));

        hobbies.put(person, hobbyList);

//      fourth person
        person = new Person("Usain Bolt", 34);
        hobbyList = new ArrayList<>();
        addressList = new ArrayList<>();
        addressList.add(new Address(new Country("Jamaica", Continent.SOUTH_AMERICA), "Sherwood Content"));
        hobbyList.add(new Hobby("athletics", 8, addressList));

        hobbies.put(person, hobbyList);

//      fifth person
        person = new Person("Emil Racovita", 31);
        hobbyList = new ArrayList<>();
        addressList = new ArrayList<>();
        addressList.add(new Address(new Country("South Pole", Continent.ANTARCTICA), "Marie-Byrd-Land"));
        hobbyList.add(new Hobby("biologist", 2, addressList));

        hobbies.put(person, hobbyList);

//      sixth person
        person = new Employee("Nelson Rolihlahla Mandela", 76, "president", "South Africa");
        hobbyList = new ArrayList<>();
        addressList = new ArrayList<>();
        addressList.add(new Address(new Country("South Africa", Continent.AFRICA), "Mvezo"));
        hobbyList.add(new Hobby("counseling", 4, addressList));

        addressList = new ArrayList<>();
        addressList.add(new Address(new Country("South Africa", Continent.AFRICA), "Johannesburg"));
        hobbyList.add(new Hobby("politics", 7, addressList));

        hobbies.put(person, hobbyList);

//      seventh person
        person = new Employee("Mukesh Dhirubhai Ambani", 63, "business magnate", "Reliance Industries Ltd");
        hobbyList = new ArrayList<>();
        addressList = new ArrayList<>();
        addressList.add(new Address(new Country("India", Continent.ASIA), "Aden"));
        hobbyList.add(new Hobby("marketing", 4, addressList));

        hobbies.put(person, hobbyList);

//      eighth person
        person = new Employee("Stephen Robert Irwin", 44, "zookeeper", "The Crocodile Hunter");
        hobbyList = new ArrayList<>();
        addressList = new ArrayList<>();
        addressList.add(new Address(new Country("Victoria", Continent.AUSTRALIA), "Upper Ferntree Gully"));
        hobbyList.add(new Hobby("wildlife expert", 6, addressList));

        addressList = new ArrayList<>();
        addressList.add(new Address(new Country("Queensland", Continent.AUSTRALIA), "Batt Reef"));
        hobbyList.add(new Hobby("environmentalist", 7, addressList));

        addressList = new ArrayList<>();
        addressList.add(new Address(new Country("Victoria", Continent.AUSTRALIA), "Batt Reef"));
        hobbyList.add(new Hobby("conservationist", 8, addressList));

        hobbies.put(person, hobbyList);

//		print map
        print(hobbies);
    }

    private static void print(HashMap<Person, List<Hobby>> hobbies) {
        for (Map.Entry<Person, List<Hobby>> entry : hobbies.entrySet()) {
            Person person = entry.getKey();
            List<Hobby> hobbyList = entry.getValue();
            person.print();
            hobbyList.forEach(Hobby::print);
            System.out.println();
        }
    }
}
