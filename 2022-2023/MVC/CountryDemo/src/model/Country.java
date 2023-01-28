package model;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Country {
    private final StringProperty country;
    private final StringProperty capital;
    private final DoubleProperty population;
    private final BooleanProperty democratic;

    public Country(String country, String capital, double population, boolean democratic) {
        this.country = new SimpleStringProperty(country);
        this.capital = new SimpleStringProperty(capital);
        this.population = new SimpleDoubleProperty(population);
        this.democratic = new SimpleBooleanProperty(democratic);
    }
    public String getCountry() {
        return this.country.get();
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public String getCapital() {
        return this.capital.get();
    }

    public void setCapital(String capital) {
        this.capital.set(capital);
    }

    public double getPopulation() {
        return this.population.get();
    }

    public void setPopulation(double population) {
        this.population.set(population);
    }

    public boolean isDemocratic() {
        return this.democratic.get();
    }

    public void setDemocratic(boolean democratic) {
        this.democratic.set(democratic);
    }

    @Override
    public String toString() {
        return this.country.get();
    }

    private static final ObservableList<Country> countries = FXCollections.observableArrayList(
            new Country("USA", "Washington DC", 280, true),
            new Country("Canada", "Ottawa", 32, true),
            new Country("United Kingdom", "London", 60, true),
            new Country("Germany", "Berlin", 83, true),
            new Country("France", "Paris", 60, true)
    );

    public static ObservableList<Country> getCountries() {
        return Country.countries;
    }

    public static void addCountry(Country country) {
        Country.countries.add(country);
    }
}
