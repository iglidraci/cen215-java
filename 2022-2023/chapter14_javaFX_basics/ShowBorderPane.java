import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import java.util.Random;

public class ShowBorderPane extends Application {
  @Override
  public void start(Stage stage) {
    BorderPane pane = new BorderPane();
    // place nodes in the pane
    pane.setTop(new CustomPane("Top"));
    pane.setRight(new CustomPane("Right"));
    pane.setBottom(new CustomPane("Bottom"));
    pane.setLeft(new CustomPane("Left"));
    pane.setCenter(new CustomPane("Center"));

    // create a scene
    Scene scene = new Scene(pane);
    stage.setScene(scene);
    stage.setTitle("Show border pane");
    stage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}

// custom pane to hold a label in the center
class CustomPane extends StackPane {
  public CustomPane(String title) {
    this.getChildren().add(new Label(title));
    this.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    int r = randomColor();
    int g = randomColor();
    int b = randomColor();
    this.setStyle("-fx-border-color: rgb(" + r + "," + g + "," + b + ");");
  }

  private int randomColor() {
    Random random = new Random();
    return random.nextInt(0, 256);
  }
}
