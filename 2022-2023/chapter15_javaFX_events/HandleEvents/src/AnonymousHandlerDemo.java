import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 1) An anonymous inner class must always extend a superclass or implement an interface,
 * 	but it cannot have an explicit extends or implements clause
 * 2) An anonymous inner class must implement all the abstract methods in the superclass 
 * 	or in the interface
 * 3) An anonymous inner class always uses the no-arg constructor from its superclass to 
 * 	create an instance. If an anonymous inner class implements an interface, 
 * 	the constructor is Object()
 * 4) An anonymous inner class is compiled into a class named OuterClassName$n. class.
 */

public class AnonymousHandlerDemo extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		VBox pane = new VBox(10);
		pane.setPadding(new Insets(20));
		Label usernameLbl = new Label("Username");
		TextField usernameTf = new TextField();
		Label passwordLbl = new Label("Password");
		TextField passwordTf = new TextField();
		Label yearLbl = new Label("Birth year");
		TextField yearTf = new TextField();
		Button btn = new Button("Login");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Login button clicked");
				String username = usernameTf.getText();
				String password = passwordTf.getText();
				Integer year = Integer.parseInt(yearTf.getText());
				System.out.println(username + " " + password);
				if (username.equals("foo") && password.equals("bar") && year <= 2000) {
					System.out.println("Login successfully");
					stage.setScene(getHomePageScene());
				} else {
					System.out.println("Wrong credentials");
				}
			}
		});
		pane.getChildren().addAll(usernameLbl, usernameTf, passwordLbl, passwordTf,
									yearLbl, yearTf, btn);
		pane.setAlignment(Pos.CENTER);
		Scene scene = new Scene(pane, 400, 400);
		stage.setScene(scene);
		stage.setTitle("Anonymous Inner classes");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	private Scene getHomePageScene() {
		StackPane pane = new StackPane();
		pane.getChildren().add(new Label("Successfull login"));
		Scene scene = new Scene(pane, 400, 400);
		return scene;
	}

}
