package edu.farmingdale.login_project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label welcomeText;
    @FXML
    private Button loginButton;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginScreen.fxml"));
        Scene loginScene = new Scene(loader.load(), 800, 600);
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(loginScene);
    }
}