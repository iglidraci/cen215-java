package application.bookstore.ui;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class CreateButton extends Button {
    public CreateButton() {
        super.setText("Create");
        super.setGraphic(getImage());
        super.setTextFill(Color.WHITE);
        super.setStyle("-fx-background-color: green");
    }

    private ImageView getImage() {
        ImageView imageView = new ImageView(String.valueOf(CreateButton.class.getResource("/images/save_icon.png")));
        return imageView;
    }
}
