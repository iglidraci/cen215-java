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
    pane.setPadding(new Insets(50, 50, 50, 50));
    Image catImage = new Image("images/cat.png");
    ImageView imageView1 = new ImageView(catImage);

    ImageView imageView2 = new ImageView(catImage);
    imageView2.setRotate(90);

    Image dogImage = new Image("https://images.template.net/wp-content/uploads/2014/12/dog-template-48.jpg");
    ImageView imageView3 = new ImageView(dogImage);
    imageView3.setFitHeight(300);
    imageView3.setFitWidth(300);
    pane.getChildren().addAll(imageView1, imageView2, imageView3);

    Scene scene = new Scene(pane);
    stage.setTitle("Show image");
    stage.setScene(scene);
    stage.show();
  }
}
