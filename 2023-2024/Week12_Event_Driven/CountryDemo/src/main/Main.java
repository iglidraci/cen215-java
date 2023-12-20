package main;

import controller.CountryController;
import dao.CountryDAO;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Country;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        CountryController controller = new CountryController();
        Scene scene = new Scene(controller.getView(), 500, 400);
        stage.setTitle("Country MVC Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        seedData();
        Application.launch(args);
    }

    private static void seedData() {
        File file = new File(CountryDAO.FILE_PATH);
        if(file.length() == 0) {
            Country[] countries = {
                    new Country("USA", "Washington DC", 280, true),
                    new Country("Canada", "Ottawa", 32, true),
                    new Country("United Kingdom", "London", 60, true),
                    new Country("Germany", "Berlin", 83, true),
                    new Country("France", "Paris", 60, true)
            };
            try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                for(Country country : countries) {
                    outputStream.writeObject(country);
                }
            } catch (IOException ex) {
                // log
            }
        }
    }
}
