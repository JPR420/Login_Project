package edu.farmingdale.login_project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginScreen {
    @FXML
    private Label username;
    @FXML
    Button registerButton;
    @FXML
    Button logInButton;

    public void start() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginScreen.fxml"));
        Scene loginScene = new Scene(loader.load(), 800, 600);
        Stage stage = new Stage();
        stage.setScene(loginScene);
    }

    public void register() throws IOException {
        new RegisterScreen().start();

    }

    public void logIn() throws IOException {
       new LandingScreen().start();
        username.getScene().getWindow().hide();
    }

}
