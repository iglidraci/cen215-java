import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ShowCircle extends Application {
  @Override
  public void start(Stage primaryStage) {
    Circle circle = new Circle();
    circle.setRadius(50);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.BLUE);
    // create  a pane to hold the circle
    Pane pane = new Pane();
    pane.getChildren().add(circle);

    /*
    A binding property is an object that can be bound to a source object.
    A target listens to the changes in the source and automatically updates
    itself once a change is made in the source
    */

    circle.centerXProperty().bind(pane.widthProperty().divide(2));
    circle.centerYProperty().bind(pane.heightProperty().divide(2));

    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Show Circle");
    primaryStage.show();
  }
}
