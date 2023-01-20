import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
		pane.setPadding(new Insets(20));
		Label lbl = new Label("Start typing ...");
		Text text = new Text(20, 20, "");
		pane.getChildren().addAll(lbl, text);
		text.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch(event.getCode()) {
					case DOWN:
						text.setY(text.getY() + 10); break;
					case UP:
						text.setY(text.getY() - 10); break;
					case LEFT:
						text.setX(text.getX() - 10); break;
					case RIGHT:
						text.setX(text.getX() + 10); break;
					case BACK_SPACE:
						int length = text.getText().length();
						if (length > 0)
							text.setText(text.getText().substring(0, length-1));
					default:
						if (event.getText().length() > 0)
							text.setText(text.getText() + event.getText());
				}
			}
		});
		// create scene
		Scene scene = new Scene(pane, 200, 200);
		stage.setTitle("Key Event demo");
		stage.setScene(scene);
		stage.show();
		text.requestFocus(); // // text is focused to receive key input
		// Only a focused node can receive KeyEvent
	}

}
