import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private final BookFormPane pane = new BookFormPane();

	@Override
	public void start(Stage stage) {
		pane.getSubmitBtn().setOnAction(this::onBookSubmit);
		Scene scene = new Scene(pane, 500, 500);
		stage.setScene(scene);
		stage.setTitle("Bookstore");
		stage.show();
	}

    private void onBookSubmit(ActionEvent actionEvent) {
        String isbn13 = pane.getIsbnTF().getText();
        String title = pane.getTitleTF().getText();
        float price = Float.parseFloat(pane.getPriceTF().getText());
        String description = pane.getDescriptionTA().getText();
        Author author = pane.getAuthorComboBox().getValue();
        boolean isPaperback = pane.getRbPaperback().isSelected();
        Book newBook = new Book(isbn13, title, description, price, author, isPaperback);
        for(int i=0; i < pane.getGenreCheckboxes().size(); i++) {
            if(pane.getGenreCheckboxes().get(i).isSelected())
                newBook.addGenre(Genre.values()[i]);
        }
        boolean res = FileHandler.writeBookToFile(newBook);
        if (res)
            System.out.println("Book saved successfully");
        else
            System.out.println("Operation failed");
    }

	public static void main(String[] args) {
		Application.launch(args);
	}

}
