package ui.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class homeController {

    @FXML
    private Pane centerContent;

    @FXML
    private void initialize() throws IOException {
        Pane test = FXMLLoader.load(getClass().getResource("../Views/Dashboard.fxml"));
        centerContent.getChildren().add(test);
    }
}
