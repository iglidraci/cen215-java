package application.bookstore.ui;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class SearchButton extends Button {
    public SearchButton() {
        super.setText("");
        super.setGraphic(getImage());
    }

    private ImageView getImage() {
        ImageView imageView = new ImageView(String.valueOf(SearchButton.class.getResource("/images/search_icon.png")));
        return imageView;
    }
}
