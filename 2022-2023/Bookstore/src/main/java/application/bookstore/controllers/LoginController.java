package application.bookstore.controllers;

import application.bookstore.models.User;
import application.bookstore.views.LoginView;
import application.bookstore.views.View;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {
    private final Stage primaryStage;
    private final View nextView;

    public User getCurrentUser() {
        return currentUser;
    }

    private User currentUser;
    public LoginController(LoginView view, View nextView, Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.nextView = nextView;
        addListener(view);
    }

    private void addListener(LoginView view) {
        view.getLoginBtn().setOnAction(e -> {
            String password = view.getPasswordField().getText();
            String username = view.getUsernameField().getText();
            User potentialUser = new User(username, password);
            if ((currentUser = User.getIfExists(potentialUser)) != null) {
                nextView.setCurrentUser(currentUser);
                primaryStage.setScene(new Scene(nextView.getView()));
            }
            else
                view.getErrorLabel().setText("Wrong username or password");
        });
    }
}
