package application.bookstore.views;

import application.bookstore.ui.ClearButton;
import application.bookstore.ui.SearchButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class SearchView {
    private final String searchLabel;
    private final TextField searchField = new TextField();
    private final Button searchBtn = new SearchButton();
    private final Button clearBtn = new ClearButton();
    private final HBox searchPane = new HBox();
    public SearchView(String searchLabel) {
        this.searchLabel = searchLabel;
        setSearchForm();
    }
    public SearchView() {
        this("");
    }

    public HBox getSearchPane() {
        return searchPane;
    }

    public TextField getSearchField() {
        return searchField;
    }

    public Button getSearchBtn() {
        return searchBtn;
    }

    public Button getClearBtn() {
        return clearBtn;
    }
    private void setSearchForm() {
        Label label = new Label(searchLabel, searchField);
        label.setContentDisplay(ContentDisplay.RIGHT);
        searchPane.setPadding(new Insets(20));
        searchPane.setSpacing(20);
        searchPane.setAlignment(Pos.CENTER);
        searchField.setPromptText("Type something ... ");
        searchPane.getChildren().addAll(label, searchBtn, clearBtn);
    }
}
