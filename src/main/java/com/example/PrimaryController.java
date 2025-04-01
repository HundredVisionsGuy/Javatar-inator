package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class PrimaryController {
    @FXML
    Button getImageButton = new Button();

    @FXML
    TextField seedText = new TextField();
    
    @FXML
    ImageView avatarImage = new ImageView();
    
    @FXML
    Label outputLabel = new Label();

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void setText() throws IOException {
        outputLabel.setText(getText());
    }

    @FXML
    private String getText() throws IOException {
        String output = seedText.getText();
        return output;
    }
}
