package application.bookstore.views;

import application.bookstore.models.User;
import javafx.scene.Parent;

public abstract class View {
    private User currentUser = null;

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public abstract Parent getView();
}
