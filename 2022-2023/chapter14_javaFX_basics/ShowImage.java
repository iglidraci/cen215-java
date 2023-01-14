import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowImage extends Application {
  @Override
  public void start(Stage stage) {
    // An HBox is a pane that places all nodes horizontally in one row
    Pane pane = new HBox(10);
    pane.setPadding(new Insets(5, 5, 5, 5));
    Image image = new Image("images/cat.png");
    ImageView imageView1 = new ImageView(image);

    ImageView imageView2 = new ImageView(image);
    imageView2.setRotate(90);
    pane.getChildren().addAll(imageView1, imageView2);

    Scene scene = new Scene(pane);
    stage.setTitle("Show image");
    stage.setScene(scene);
    stage.show();
  }
}
