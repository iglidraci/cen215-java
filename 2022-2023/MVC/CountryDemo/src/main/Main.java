package main;

import controller.CountryController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.CountryView;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        CountryView view = new CountryView();
        new CountryController(view); // inject the view in the controller
        Scene scene = new Scene(view, 500, 400);
        stage.setTitle("Country MVC Demo");
        stage.setScene(scene);
        stage.show();
    }
}
