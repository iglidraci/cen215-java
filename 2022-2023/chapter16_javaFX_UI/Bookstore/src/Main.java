import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// create pane
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(0, 10, 0, 10));
		pane.setVgap(10);
		pane.setHgap(10);
		
		TextField titleTF = new TextField();
		Label titleLbl = new Label("Title");
		
		TextField isbnTF = new TextField();
		Label isbnLbl = new Label("ISBN 13");
		
		TextField priceTF = new TextField();
		Label priceLbl = new Label("Price");
		
		Label versionLbl = new Label("Version");
		RadioButton rbPaperback = new RadioButton("Paperback");
		RadioButton rbEbook = new RadioButton("E-book");
		ToggleGroup group = new ToggleGroup();
		rbPaperback.setToggleGroup(group);
		rbEbook.setToggleGroup(group);
		HBox hbox = new HBox(10);
		hbox.getChildren().addAll(rbPaperback, rbEbook);
		
		Label descriptionLbl = new Label("Description");
		TextArea descriptionTA = new TextArea();
		descriptionTA.setPrefColumnCount(20);
		descriptionTA.setPrefRowCount(5);
		descriptionTA.setWrapText(true);
		
		Author[] authors = getAvailableAuthors();
		ComboBox<Author> cbo = new ComboBox<>();
		cbo.getItems().addAll(authors);
		Label authosLbl = new Label("Select an author: ");
		
		// genres
		VBox paneForGenres = new VBox(10);
		paneForGenres.setPadding(new Insets(4));
		ArrayList<CheckBox> genreCheckboxes = new ArrayList<>();
		for(Genre g : Genre.values()) {
			genreCheckboxes.add(new CheckBox(g.toString()));
		}
		paneForGenres.getChildren().addAll(genreCheckboxes);
		Label genreLbl = new Label("Genres: ");
		
		Button submitBtn = new Button("Submit");
		submitBtn.setOnAction(e -> {
			String isbn13 = isbnTF.getText();
			String title = titleTF.getText();
			float price = Float.parseFloat(priceTF.getText());
			String description = descriptionTA.getText();
			Author author = cbo.getValue();
			boolean isPaperback = rbPaperback.isSelected();
			Book newBook = new Book(isbn13, title, description, price, author, isPaperback);
			for(int i=0; i < genreCheckboxes.size(); i++) {
				if(genreCheckboxes.get(i).isSelected())
					newBook.addGenre(Genre.values()[i]);
			}
			boolean res = writeBookToFile(newBook);
			if (res)
				System.out.println("Book saved sucessfully");
			else
				System.out.println("Failure");
		});
		
		
		
		pane.add(titleLbl, 0, 0);
		pane.add(titleTF, 1, 0);
		pane.add(isbnLbl, 0, 1);
		pane.add(isbnTF, 1, 1);
		pane.add(priceLbl, 0, 2);
		pane.add(priceTF, 1, 2);
		pane.add(versionLbl, 0, 3);
		pane.add(hbox, 1, 3);
		pane.add(descriptionLbl, 0, 4);
		pane.add(descriptionTA, 1, 4);
		pane.add(authosLbl, 0, 5);
		pane.add(cbo, 1, 5);
		pane.add(genreLbl, 0, 6);
		pane.add(paneForGenres, 1, 6);
		pane.add(submitBtn, 1, 7);
		
		Scene scene = new Scene(pane, 500, 500);
		stage.setScene(scene);
		stage.setTitle("Bookstore");
		stage.show();
	}
	
	private boolean writeBookToFile(Book newBook) {
		try {
			File booksFile = new File("books.dat");
			FileOutputStream outputStream = new FileOutputStream(booksFile, true);
			ObjectOutputStream writer;
			if (booksFile.length() > 0)
				writer = new HeaderlessObjectOutputStream(outputStream);
			else
				writer = new ObjectOutputStream(outputStream); 
			writer.writeObject(newBook);
			writer.close();
			return true;
		} catch(IOException ex) {
			return false;
		}
	}

	private Author[] getAvailableAuthors() {
		return new Author[] {
				new Author("Fyodor", "Dostoevsky", Gender.MALE),
				new Author("Noam", "Chomsky", Gender.MALE),
				new Author("Anne", "Applebaum", Gender.FEMALE),
				new Author("George", "Orwell", Gender.MALE)
		};
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
