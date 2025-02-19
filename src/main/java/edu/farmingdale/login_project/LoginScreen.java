package edu.farmingdale.login_project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginScreen {
    @FXML
    Button registerButton;
    @FXML
    Button logInButton;

    public void start() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("this is the login screen");
        stage.setScene(scene);
        stage.show();
    }

    public void register() throws IOException {
        new RegisterScreen().start();
    }

    public void logIn() throws IOException {
        new LandingScreen().start();
    }

}
