package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import model.Country;
import view.CountryView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CountryController {
    private final CountryView view;
    public CountryController(CountryView view) {
        this.view = view;
        this.view.getTableView().setItems(Country.getCountries());
        this.view.getBtnAdd().setOnAction(e -> onCountryAdd());
        this.view.getBtnDelete().setOnAction(this::onCountryDelete);
        this.view.getBtnPrint().setOnAction(this::onPrintClick);
        setEditListeners();
    }

    private void onPrintClick(ActionEvent event) {
        File file = new File("countries.txt");
        try {
            PrintWriter writer = new PrintWriter(file);
            for(Country country : Country.getCountries()) {
                writer.printf("Country: %s, capital: %s, population: %.1f, democratic: %b\n",
                        country.getCountry(), country.getCapital(), country.getPopulation(), country.isDemocratic());
            }
            System.out.println("Finished writing countries to the file");
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void setEditListeners() {
        this.view.getCountryColumn().setOnEditCommit(e -> {
            Country.getCountries().get(e.getTablePosition().getRow()).setCountry(e.getNewValue());
        });
        this.view.getCapitalColumn().setOnEditCommit(e -> {
            Country.getCountries().get(e.getTablePosition().getRow()).setCapital(e.getNewValue());
        });
        this.view.getPopulationColumn().setOnEditCommit(e -> {
            Country.getCountries().get(e.getTablePosition().getRow()).setPopulation(e.getNewValue());
        });
        this.view.getDemocraticColumn().setOnEditCommit(e -> {
            Country.getCountries().get(e.getTablePosition().getRow()).setDemocratic(e.getNewValue());
        });
    }

    private void onCountryDelete(ActionEvent event) {
        ObservableList<Country> selectedCountries = this.view.getTableView().getSelectionModel().getSelectedItems();
        Country.getCountries().removeAll(selectedCountries);
    }

    private void onCountryAdd() {
        String countryName = this.view.getTfCountry().getText();
        String capital = this.view.getTfCapital().getText();
        double population = Double.parseDouble(this.view.getTfPopulation().getText());
        boolean isDemocratic = this.view.getChkIsDemocratic().isSelected();
        Country country = new Country(countryName, capital, population, isDemocratic);
        Country.addCountry(country); // save the country to the file
        this.view.getTfCountry().clear();
        this.view.getTfCapital().clear();
        this.view.getTfPopulation().clear();
    }


}
