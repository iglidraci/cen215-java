import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class ButtonInPane extends Application {
  @Override
  public void start(Stage primaryStage) {
    /*
    The StackPane places the nodes in the center of the pane on top of each other
    */
    StackPane pane = new StackPane();
    Button btn = new Button("Ok");
    /*
    The getChildren() method returns an instance of ObservableList behaves
    very much like an ArrayList for storing a collection of elements
    */
    pane.getChildren().add(btn, btn2);
    Scene scene = new Scene(pane);
    primaryStage.setTitle("Button in a pane");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
