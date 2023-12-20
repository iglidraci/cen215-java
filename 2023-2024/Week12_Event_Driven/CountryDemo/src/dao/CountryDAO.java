package dao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Country;

import java.io.*;
import java.util.List;

public class CountryDAO {
    public static final String FILE_PATH = "database/countries.dat";
    private static final File DATA_FILE = new File(FILE_PATH);
    private final ObservableList<Country> countries = FXCollections.observableArrayList();
    public ObservableList<Country> getAll() {
        if(countries.isEmpty()) {
            loadCountriesFromFile();
        }
        return countries;
    }

    private void loadCountriesFromFile() {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            while (true) {
                Country country = (Country) inputStream.readObject();
                countries.add(country);
            }
        }
        catch (EOFException ignored) {
        }
        catch (IOException | ClassNotFoundException ex) {
            // log to a file
            System.out.println(ex.getMessage());
        }
    }

    public boolean create(Country country) {
        try(FileOutputStream outputStream = new FileOutputStream(DATA_FILE, true)) {
            ObjectOutputStream writer;
            if (DATA_FILE.length() > 0)
                writer = new HeaderlessObjectOutputStream(outputStream);
            else
                writer = new ObjectOutputStream(outputStream);
            writer.writeObject(country);
            countries.add(country);
            return true;
        } catch(IOException ex) {
            return false;
        }
    }

    public boolean delete(Country country) {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            for(Country c : countries) {
                if(!c.equals(country))
                    outputStream.writeObject(c);
            }
            countries.remove(country);
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    public boolean deleteAll(List<Country> countriesToRemove) {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            for(Country c : countries) {
                if(!countriesToRemove.contains(c))
                    outputStream.writeObject(c);
            }
            countries.removeAll(countriesToRemove);
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    public boolean updateAll() {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            for(Country c : countries) {
                outputStream.writeObject(c);
            }
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}
