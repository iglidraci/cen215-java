import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage stage) {
		// create clock
		ClockPane clock = new ClockPane();
		String time = clock.getHour() + ":" + clock.getMinute() + ":"
						+ clock.getSecond();
		Label lbl = new Label(time);
		
		// place clock and label in border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lbl);
		BorderPane.setAlignment(lbl, Pos.TOP_CENTER);
		
		// create a scene and place in the stage
		Scene scene = new Scene(pane, 250, 250);
		stage.setTitle("Display Clock");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
