import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class NodeStyleRotate extends Application {

  @Override
  public void start(Stage primaryStage) {
    StackPane pane = new StackPane();
    Button btn = new Button("OK");
    btn.setStyle("-fx-border-color: blue;");
    pane.getChildren().add(btn);

    pane.setRotate(45);
    pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

    Scene scene = new Scene(pane, 250, 200);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Node Style Rotate Demo");
    primaryStage.show();
  }
}
