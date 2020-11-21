package homework_3;

public class Country {
    private final String country;
    private final Continent continent;

    public Country(String country, Continent continent) {
        super();
        this.country = country;
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public Continent getContinent() {
        return continent;
    }

}
