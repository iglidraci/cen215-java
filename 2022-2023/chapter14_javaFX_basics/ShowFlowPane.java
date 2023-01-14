import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;

public class ShowFlowPane extends Application {
  @Override
  public void start(Stage stage) {
    FlowPane pane = new FlowPane();
    pane.setPadding(new Insets(11, 12, 13, 14));
    pane.setHgap(5);
    pane.setVgap(5);

    // create nodes and set them in the pane
    pane.getChildren().addAll(
      new Label("First name:"), new TextField(),
      new Label("Last name:"), new TextField()
    );

    // create a scene
    Scene scene = new Scene(pane, 200, 200);
    stage.setTitle("Show Flow Pane");
    stage.setScene(scene);
    stage.show();

  }
}
