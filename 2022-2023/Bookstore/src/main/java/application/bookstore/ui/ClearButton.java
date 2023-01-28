package application.bookstore.ui;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class ClearButton extends Button {
    public ClearButton() {
        super.setText("Clear");
        super.setGraphic(getImage());
    }

    private ImageView getImage() {
        ImageView imageView = new ImageView(String.valueOf(ClearButton.class.getResource("/images/clear_icon.png")));
        return imageView;
    }
}
