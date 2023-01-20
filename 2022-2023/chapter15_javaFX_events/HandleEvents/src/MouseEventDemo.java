import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * A MouseEvent is fired whenever a mouse button is pressed, released, clicked,
 * moved, or dragged on a node or a scene
 *
 */

public class MouseEventDemo extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
		Text text = new Text(20, 20, "Mouse Event Demo");
		pane.getChildren().add(text);
		text.setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				text.setX(event.getX());
				text.setY(event.getY());
			}
		});
		Scene scene = new Scene(pane, 200, 200);
		stage.setScene(scene);
		stage.setTitle("Mouse Event Demo");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
