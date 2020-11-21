package homework_3;

public class Address {
    private final Country country;
    private final String city;

    public Address(Country country, String city) {
        super();
        this.country = country;
        this.city = city;
    }

    public void print() {
        System.out.print(city + ", " +
                country.getCountry() + ", " +
                country.getContinent().name() + "; ");
    }
}
