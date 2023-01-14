import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class FontDemo extends Application {
  @Override
  public void start(Stage stage) {
    Pane pane = new StackPane();

    Circle circle = new Circle();
    circle.setRadius(50);
    circle.setStroke(Color.BLACK);
    circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));

    pane.getChildren().add(circle);

    // create a label
    Label label = new Label("JavaFX");
    label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
    pane.getChildren().add(label);

    // create scene
    Scene scene = new Scene(pane);
    stage.setTitle("Font and Color demo");
    stage.setScene(scene);
    stage.show();
  }
}
