package edu.farmingdale.login_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterScreen {
    Stage stage = new Stage();
    @FXML
    private Button register;
    @FXML
    private Label registerName;

    public void start() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("registerScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Please register");
        stage.setScene(scene);
        stage.show();
    }

    public void registerA(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) register.getScene().getWindow();
        new LoginScreen().start();
        stage.close();

    }
}
