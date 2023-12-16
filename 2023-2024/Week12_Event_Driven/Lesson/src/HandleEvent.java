import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button okBtn = new Button("OK");
		Button cancelBtn = new Button("Cancel");
		OkBtnHandler handler1 = new OkBtnHandler();
		okBtn.setOnAction(handler1);
		CancelBtnHandler handler2 = new CancelBtnHandler();
		cancelBtn.setOnAction(handler2);
		
		pane.getChildren().addAll(okBtn, cancelBtn);
		
		// create scene
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("Handle events");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}

/*
 * The button is an event source object
 * Event handler is an object capable of handling the action event on a button
 * To be a handler, two requirements must be met:
 * 1) implement the EventHandler<T extends Event> interface
 * 2) the handler must be registered with the event source object using: source.setOnAction(handler)
 * */

class OkBtnHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		System.out.println("OK button clicked");
	}
	
}

class CancelBtnHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Cancel button clicked");
	}
	
}
