package model;

import javafx.beans.property.*;
import java.io.*;

public class Country implements Serializable {

    @Serial
    private static final long serialVersionUID = 1;
    private transient StringProperty country;
    private transient StringProperty capital;
    private transient DoubleProperty population;
    private transient BooleanProperty democratic;

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

    @Serial
    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.defaultWriteObject();
        outputStream.writeUTF(this.country.getValueSafe());
        outputStream.writeUTF(this.capital.getValueSafe());
        outputStream.writeDouble(this.population.getValue());
        outputStream.writeBoolean(this.democratic.getValue());
    }

    @Serial
    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        // they have to be in the same order as in writeObject
        this.country = new SimpleStringProperty(inputStream.readUTF());
        this.capital = new SimpleStringProperty(inputStream.readUTF());
        this.population = new SimpleDoubleProperty(inputStream.readDouble());
        this.democratic = new SimpleBooleanProperty(inputStream.readBoolean());
    }
}
