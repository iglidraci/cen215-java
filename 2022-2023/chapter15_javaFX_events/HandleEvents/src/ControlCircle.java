import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {
	
	private CirclePane circlePane = new CirclePane();
	
	@Override
	public void start(Stage stage) throws Exception {
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		Button enlargeBtn = new Button("Enlarge");
		Button shrinkBtn = new Button("Shrink");
		hbox.getChildren().addAll(enlargeBtn, shrinkBtn);
		
		// create event handlers
		enlargeBtn.setOnAction(new EnlargeHandler());
		shrinkBtn.setOnAction(new ShrinkHandler());
	
		BorderPane pane = new BorderPane();
		pane.setCenter(circlePane);
		pane.setBottom(hbox);
		BorderPane.setAlignment(hbox, Pos.CENTER);
		
		// create a scene
		Scene scene = new Scene(pane, 200, 150);
		stage.setScene(scene);
		stage.setTitle("Controll circle");
		stage.show();
		System.out.println("Done loading");
	}
	
	class EnlargeHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			circlePane.enlarge();
		}
	}
	
	class ShrinkHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			circlePane.shrink();
		}
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}

class CirclePane extends StackPane {
	
	private Circle circle = new Circle(50);
	
	public CirclePane() {
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
	}

	public void enlarge() {
		// TODO Auto-generated method stub
		circle.setRadius(circle.getRadius() + 5);
	}

	public void shrink() {
		// TODO Auto-generated method stub
		if (circle.getRadius() > 5) {
			circle.setRadius(circle.getRadius() - 5);
		}
	}
	
}
