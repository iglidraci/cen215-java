import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ShowHBoxVBox extends Application {
  @Override
  public void start(Stage stage) {
    BorderPane pane = new BorderPane();
    pane.setTop(getHBox());
    pane.setLeft(getVBox());

    // create Scene
    Scene scene = new Scene(pane);
    stage.setScene(scene);
    stage.setTitle("Show HBox VBox");
    stage.show();
  }

  private HBox getHBox() {
    HBox hBox = new HBox(15);
    hBox.setPadding(new Insets(15, 15, 15, 15));
    hBox.setStyle("−fx−background−color: gold");
    hBox.getChildren().addAll(new Button("Software Engineering"), new Button("Chemistry"));
    ImageView imageView = new ImageView(new Image("images/cat.png"));
    hBox.getChildren().add(imageView);
    return hBox;
  }

  private VBox getVBox() {
    VBox vBox = new VBox(15);
    vBox.setPadding(new Insets(15, 5, 5, 5));
    vBox.getChildren().add(new Label("Courses"));
    Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"),
                        new Label("CSCI 2410"), new Label("CSCI 3720")};
    for (Label course: courses) {
      VBox.setMargin(course, new Insets(0, 0, 0, 15));
      vBox.getChildren().add(course);
    }
    return vBox;
  }
}
