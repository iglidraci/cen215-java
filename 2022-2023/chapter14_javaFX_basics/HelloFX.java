import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloFX extends Application {
  /*
  The start method normally places UI controls in a scene and displays the scene
  in a stage.
  */
  @Override
  public void start(Stage primaryStage) {
    /*
    A Stage object is a window. A Stage object called primary stage is created by
    the JVM when the application is launched
    */
    Button okBtn = new Button("OK");
    Scene scene = new Scene(okBtn, 200, 250);
    primaryStage.setTitle("Hello FX");
    primaryStage.setScene(scene);
    primaryStage.setResizable(false);
    primaryStage.show();
  }
  /*
  Not needed but just to make sure
  The launch method is a static method defined in the Application class
  for launching a stand-alone JavaFX application.
  */
  public static void main(String[] args) {
    Application.launch(args);
  }
}
