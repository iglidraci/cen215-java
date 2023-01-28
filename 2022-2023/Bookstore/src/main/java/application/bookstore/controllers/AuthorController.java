package application.bookstore.controllers;

import application.bookstore.auxiliaries.FileHandler;
import application.bookstore.models.Author;
import application.bookstore.views.AuthorView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.TableColumn;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.util.ArrayList;

public class AuthorController {
    private AuthorView authorView;
    public AuthorController(AuthorView authorView) {
        this.authorView = authorView;
        setSaveListener();
        setDeleteListener();
        setSearchListener();
        setEditListener();
    }

    private void setEditListener() {
        // anonymous inner class
        authorView.getFirstNameCol().setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Author, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Author, String> event) {
                Author authorToEdit = event.getRowValue();
                int index = Author.getAuthors().indexOf(authorToEdit);
                Author.getAuthors().get(index).setFirstName(event.getNewValue());
            }
        });
        // with lambda now
        authorView.getLastNameCol().setOnEditCommit(event -> {
            Author authorToEdit = event.getRowValue();
            int index = Author.getAuthors().indexOf(authorToEdit);
            Author.getAuthors().get(index).setLastName(event.getNewValue());
        });
        // if the user clicks edit button, save the changes into the file
        authorView.getEditBtn().setOnAction(e -> {
            try {
                // todo change it
                FileHandler.overwriteCurrentListToFile(Author.DATA_FILE, Author.getAuthors());
                authorView.getResultLabel().setText("Authors were updated successfully");
            } catch (IOException ex) {
                authorView.getResultLabel().setText("Writing authors to the file failed!");
                ex.printStackTrace();
            }
        });
    }

    private void setSearchListener() {
        authorView.getSearchView().getClearBtn().setOnAction(e -> {
            authorView.getSearchView().getSearchField().setText("");
            authorView.getTableView().setItems(FXCollections.observableArrayList(Author.getAuthors()));
        });
        authorView.getSearchView().getSearchBtn().setOnAction(e -> {
            String searchText = authorView.getSearchView().getSearchField().getText();
            ArrayList<Author> searchResults = Author.getSearchResults(searchText);
            authorView.getTableView().setItems(FXCollections.observableArrayList(searchResults));
        });
    }

    private void setDeleteListener() {
        authorView.getDeleteBtn().setOnAction(e -> {
            ObservableList<Author> authorsInTable = authorView.getTableView().getItems();
            ObservableList<Integer> indices = authorView.getTableView().getSelectionModel().getSelectedIndices();
            for (int index: indices)
                authorsInTable.get(index).deleteFromFile();
            authorView.getTableView().setItems(FXCollections.observableArrayList(Author.getAuthors()));
            authorView.getResultLabel().setTextFill(Color.DARKGREEN);
            authorView.getResultLabel().setText("Authors deleted successfully!");
        });
    }

    private void setSaveListener() {
        authorView.getSaveBtn().setOnAction(e -> {
            String firstName = authorView.getFirstNameField().getText();
            String lastName = authorView.getLastNameField().getText();
            Author author = new Author(firstName, lastName);
            if (author.saveInFile()){
                authorView.getTableView().getItems().add(author);
                authorView.getResultLabel().setText("Author created successfully!");
                authorView.getResultLabel().setTextFill(Color.DARKGREEN);
                authorView.getFirstNameField().setText("");
                authorView.getLastNameField().setText("");
            }
            else {
                authorView.getResultLabel().setText("Author creation failed!");
                authorView.getResultLabel().setTextFill(Color.DARKRED);
            }

        });
    }

}
