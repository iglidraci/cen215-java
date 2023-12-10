import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.*;

public class ShowGridPane extends Application {
  @Override
  public void start(Stage stage) {
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    pane.setHgap(5.5);
    pane.setVgap(5.5);

    // place nodes in the pane
    pane.add(new Label("First name:"), 0, 0); // column 0 row 0
    pane.add(new TextField(), 1, 0);
    pane.add(new Label("Last name:"), 0, 1);
    pane.add(new TextField(), 1, 1);
    Button btn = new Button("Add");
    pane.add(btn, 1, 2);
    GridPane.setHalignment(btn, HPos.CENTER);

    // create a scene
    Scene scene = new Scene(pane);
    stage.setTitle("Show Grid Pane");
    stage.setScene(scene);
    stage.show();
  }
}
