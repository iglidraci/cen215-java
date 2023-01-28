package application.bookstore.ui;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class DeleteButton extends Button {
    public DeleteButton() {
        super.setText("Delete");
        super.setGraphic(getImage());
        super.setTextFill(Color.WHITE);
        super.setStyle("-fx-background-color: darkred");
    }

    private ImageView getImage() {
        ImageView imageView = new ImageView(String.valueOf(DeleteButton.class.getResource("/images/delete_icon.png")));
        return imageView;
    }
}
