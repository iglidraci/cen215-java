package controller;

import dao.CountryDAO;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import model.Country;
import view.CountryView;

public class CountryController {
    private final CountryView view;

    public CountryView getView() {
        return view;
    }
    private final CountryDAO countryDAO;
    public CountryController() {
        this.view = new CountryView();
        countryDAO = new CountryDAO();
        this.view.getTableView().setItems(countryDAO.getAll());
        this.view.getBtnAdd().setOnAction(e -> onCountryAdd());
        this.view.getBtnDelete().setOnAction(this::onCountryDelete);
        setEditListeners();
    }

    private void setEditListeners() {
        this.view.getCountryColumn().setOnEditCommit(e -> {
            countryDAO.getAll().get(e.getTablePosition().getRow()).setCountry(e.getNewValue());
        });
        this.view.getCapitalColumn().setOnEditCommit(e -> {
            countryDAO.getAll().get(e.getTablePosition().getRow()).setCapital(e.getNewValue());
        });
        this.view.getPopulationColumn().setOnEditCommit(e -> {
            countryDAO.getAll().get(e.getTablePosition().getRow()).setPopulation(e.getNewValue());
        });
        this.view.getDemocraticColumn().setOnEditCommit(e -> {
            countryDAO.getAll().get(e.getTablePosition().getRow()).setDemocratic(e.getNewValue());
        });
        this.view.getBtnUpdate().setOnAction(e -> {
            if(this.countryDAO.updateAll()) {
                System.out.println("content updated");
            } else {
                System.out.println("update failed");
            }
        });
    }

    private void onCountryDelete(ActionEvent event) {
        ObservableList<Country> selectedCountries = this.view.getTableView().getSelectionModel().getSelectedItems();
        Alert alert;
        if(countryDAO.deleteAll(selectedCountries)) {
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Deleted successfully");
            System.out.println("Deleted successfully");
        } else {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Deletion failed");
        }
        alert.setTitle("Delete result");
        alert.show();
    }

    private void onCountryAdd() {
        String countryName = this.view.getTfCountry().getText();
        String capital = this.view.getTfCapital().getText();
        double population = Double.parseDouble(this.view.getTfPopulation().getText());
        boolean isDemocratic = this.view.getChkIsDemocratic().isSelected();
        Country country = new Country(countryName, capital, population, isDemocratic);
        if(countryDAO.create(country)) {
            System.out.println("Saved successfully");
            this.view.getTfCountry().clear();
            this.view.getTfCapital().clear();
            this.view.getTfPopulation().clear();
        } else {
            System.out.println("country creation failed");
        }
    }


}
