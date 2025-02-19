module edu.farmingdale.login_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.login_project to javafx.fxml;
    exports edu.farmingdale.login_project;
}