package application.bookstore.ui;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class EditButton extends Button {
    public EditButton() {
        super.setText("Edit");
        super.setGraphic(getImage());
        super.setTextFill(Color.WHITE);
        super.setStyle("-fx-background-color: blue");
    }

    private ImageView getImage() {
        ImageView imageView = new ImageView(String.valueOf(CreateButton.class.getResource("/images/edit_icon.png")));
        return imageView;
    }
}
