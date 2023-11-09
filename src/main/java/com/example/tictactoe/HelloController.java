package com.example.tictactoe;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    private GridPane map;

    @FXML
    private Label infoLabel;

    @FXML
    private Button startButton;

    @FXML
    private Button resetButton;
    static int player = 0;

    public HelloController(GridPane map) {
        this.map = map;
    }

    public void initialize(){
    }


}