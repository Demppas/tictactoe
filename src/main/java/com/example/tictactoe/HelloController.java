package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Label colorText;

    @FXML
    protected void onColorButtonAction() {
        colorText.setText("Choose color");
    }

    public void onLabelAction(MouseEvent mouseEvent) {
        colorText.setText("");
    }

    public void onStartButtonAction(ActionEvent actionEvent) {
        //start the game
    }

    public void onChooseDifficultyAction(ActionEvent actionEvent) {
    }
}