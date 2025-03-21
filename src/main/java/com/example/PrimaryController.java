package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class PrimaryController {
    Button getImageButton = new Button();
    TextField seedText = new TextField();
    ImageView avatarImage = new ImageView();

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
