import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class BookFormPane extends GridPane {
    private final TextField titleTF = new TextField();
    private final Label titleLbl = new Label("Title");
    private final TextField isbnTF = new TextField();
    private final Label isbnLbl = new Label("ISBN 13");
    private final TextField priceTF = new TextField();
    private final Label priceLbl = new Label("Price");
    private final Label versionLbl = new Label("Version");
    private final RadioButton rbPaperback = new RadioButton("Paperback");
    private final RadioButton rbEbook = new RadioButton("E-book");
    private final Label descriptionLbl = new Label("Description");
    private final TextArea descriptionTA = new TextArea();
    private final Label authorsLbl = new Label("Select an author: ");
    private final ComboBox<Author> authorComboBox = new ComboBox<>();
    private final ArrayList<CheckBox> genreCheckboxes = new ArrayList<>();
    private final Label genreLbl = new Label("Genres: ");

    private final Button submitBtn = new Button("Submit");

    public BookFormPane() {
        setUpView();
    }

    public TextField getTitleTF() {
        return titleTF;
    }

    public TextField getIsbnTF() {
        return isbnTF;
    }

    public TextField getPriceTF() {
        return priceTF;
    }

    public RadioButton getRbPaperback() {
        return rbPaperback;
    }

    public RadioButton getRbEbook() {
        return rbEbook;
    }

    public TextArea getDescriptionTA() {
        return descriptionTA;
    }

    public ComboBox<Author> getAuthorComboBox() {
        return authorComboBox;
    }

    public ArrayList<CheckBox> getGenreCheckboxes() {
        return genreCheckboxes;
    }

    public Button getSubmitBtn() {
        return submitBtn;
    }

    private void setUpView() {
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(0, 10, 0, 10));
        this.setVgap(10);
        this.setHgap(10);

        ToggleGroup group = new ToggleGroup();
        rbPaperback.setToggleGroup(group);
        rbEbook.setToggleGroup(group);
        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(rbPaperback, rbEbook);


        descriptionTA.setPrefColumnCount(20);
        descriptionTA.setPrefRowCount(5);
        descriptionTA.setWrapText(true);

        ArrayList<Author> authors = FileHandler.getAvailableAuthors();
        authorComboBox.getItems().addAll(authors);

        // genres
        VBox paneForGenres = new VBox(10);
        paneForGenres.setPadding(new Insets(4));
        for(Genre g : Genre.values()) {
            genreCheckboxes.add(new CheckBox(g.toString()));
        }
        paneForGenres.getChildren().addAll(genreCheckboxes);

        this.add(titleLbl, 0, 0);
        this.add(titleTF, 1, 0);
        this.add(isbnLbl, 0, 1);
        this.add(isbnTF, 1, 1);
        this.add(priceLbl, 0, 2);
        this.add(priceTF, 1, 2);
        this.add(versionLbl, 0, 3);
        this.add(hbox, 1, 3);
        this.add(descriptionLbl, 0, 4);
        this.add(descriptionTA, 1, 4);
        this.add(authorsLbl, 0, 5);
        this.add(authorComboBox, 1, 5);
        this.add(genreLbl, 0, 6);
        this.add(paneForGenres, 1, 6);
        this.add(submitBtn, 1, 7);
    }
}
