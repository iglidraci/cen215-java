import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Ok");
        Pane pane = new StackPane();
        pane.getChildren().add(button);
        Scene scene = new Scene(pane, 200, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
