import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuDemo extends Application {
	private TextField tfNumber1 = new TextField();
	private TextField tfNumber2 = new TextField();
	private TextField tfResult = new TextField();

	@Override
	public void start(Stage stage) throws Exception {
		MenuBar menuBar = new MenuBar();
		
		Menu menuOperation = new Menu("Operation");
		Menu menuExit = new Menu("Exit");
		menuBar.getMenus().addAll(menuOperation, menuExit);
		
		MenuItem menuItemAdd = new MenuItem("Add");
		MenuItem menuItemSub = new MenuItem("Subtract");
		MenuItem menuItemMul = new MenuItem("Multiply");
		MenuItem menuItemDiv = new MenuItem("Divide");
		menuOperation.getItems().addAll(menuItemAdd, menuItemSub, menuItemMul, menuItemDiv);
		
		MenuItem menuItemClose = new MenuItem("Close");
		menuExit.getItems().add(menuItemClose);
		
		menuItemAdd.setAccelerator(KeyCombination.keyCombination("Ctrl+A"));
		menuItemSub.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
		menuItemMul.setAccelerator(KeyCombination.keyCombination("Ctrl+M"));
		menuItemDiv.setAccelerator(KeyCombination.keyCombination("Ctrl+D"));
		
		HBox hbox1 = new HBox(5);
		hbox1.getChildren().addAll(new Label("Number 1:"), tfNumber1, new Label("Number 2:"), tfNumber2,
									new Label("Result:"), tfResult);
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hbox2 = new HBox(5);
		Button btnAdd = new Button("Add");
		Button btnSub = new Button("Subtract");
		Button btnMul = new Button("Multiply");
		Button btnDiv = new Button("Divide");
		hbox2.getChildren().addAll(btnAdd, btnSub, btnMul, btnDiv);
		hbox2.setAlignment(Pos.CENTER);
		
		VBox vBox = new VBox(10);
		vBox.getChildren().addAll(menuBar, hbox1, hbox2);
		
		Scene scene = new Scene(vBox);
		stage.setScene(scene);
		stage.setTitle("Menu demo");
		stage.show();
		
		// handle menu actions
		
		menuItemAdd.setOnAction(e -> calculate('+'));
		menuItemSub.setOnAction(e -> calculate('-'));
		menuItemDiv.setOnAction(e -> calculate('/'));
		menuItemMul.setOnAction(e -> calculate('*'));
		
		menuItemClose.setOnAction(e -> System.exit(0));
		
		//handle button actions
		btnAdd.setOnAction(e -> calculate('+'));
		btnSub.setOnAction(e -> calculate('-'));
		btnDiv.setOnAction(e -> calculate('/'));
		btnMul.setOnAction(e -> calculate('*'));
		
	}

	private void calculate(char operator) {
		double nr1 = Double.parseDouble(tfNumber1.getText());
		double nr2 = Double.parseDouble(tfNumber2.getText());
		
		double result;
		switch(operator) {
		case '+':
			result = nr1 + nr2; break;
		case '-':
			result = nr1 - nr2; break;
		case '*':
			result = nr1 * nr2; break;
		case '/':
			result = nr1/nr2; break;
		default:
			result = 0;
		}
		tfResult.setText(result + "");
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
