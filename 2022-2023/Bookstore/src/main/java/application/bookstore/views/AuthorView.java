package application.bookstore.views;

import application.bookstore.controllers.AuthorController;
import application.bookstore.models.Author;
import application.bookstore.ui.*;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AuthorView extends View{
    private final BorderPane borderPane = new BorderPane();
    private final TableView<Author> tableView = new TableView<>();
    private final HBox formPane = new HBox();
    private final TextField firstNameField = new TextField();
    private final TextField lastNameField = new TextField();
    private final Button saveBtn = new CreateButton();
    private final Button deleteBtn = new DeleteButton();
    private final Button editBtn = new EditButton();
    private final TableColumn<Author, String> firstNameCol = new TableColumn<>("First name");
    private final TableColumn<Author, String> lastNameCol = new TableColumn<>("Last name");
    private final Label resultLabel = new Label("");
    private final SearchView searchView = new SearchView("Search for an author");

    public SearchView getSearchView() {
        return searchView;
    }

    public TableColumn<Author, String> getFirstNameCol() {
        return firstNameCol;
    }

    public TableColumn<Author, String> getLastNameCol() {
        return lastNameCol;
    }

    public Button getEditBtn() {
        return editBtn;
    }

    public Button getDeleteBtn() {
        return deleteBtn;
    }

    public Label getResultLabel() {
        return resultLabel;
    }

    public TableView<Author> getTableView() {
        return tableView;
    }

    public TextField getFirstNameField() {
        return firstNameField;
    }

    public TextField getLastNameField() {
        return lastNameField;
    }

    public Button getSaveBtn() {
        return saveBtn;
    }

    public AuthorView() {
        setTableView();
        setForm();
        new AuthorController(this);
    }

    @Override
    public Parent getView() {
        borderPane.setCenter(tableView);
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(5);
        vBox.getChildren().addAll(formPane, resultLabel);
        borderPane.setBottom(vBox);
        borderPane.setTop(searchView.getSearchPane());
        return borderPane;
    }

    private void setForm() {
        formPane.setPadding(new Insets(20));
        formPane.setSpacing(20);
        formPane.setAlignment(Pos.CENTER);
        Label firstNameLabel = new Label("First name: ", firstNameField);
        firstNameLabel.setContentDisplay(ContentDisplay.TOP);
        Label lastNameLabel = new Label("Last name: ", lastNameField);
        lastNameLabel.setContentDisplay(ContentDisplay.TOP);
        formPane.getChildren().addAll(firstNameLabel, lastNameLabel, saveBtn, deleteBtn, editBtn);
    }

    private void setTableView() {
        // select multiple records in order to delete them
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tableView.setEditable(true);
        tableView.setItems(FXCollections.observableArrayList(Author.getAuthors()));
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<>("firstName")
        );
        firstNameCol.setCellFactory(TextFieldTableCell.forTableColumn());

        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("lastName")
        );
        lastNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        tableView.getColumns().addAll(firstNameCol, lastNameCol);
    }
}
