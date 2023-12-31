package com.example.tictactoe;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.util.Arrays;

public class HelloController {
    @FXML private TextField heroScore;
    @FXML private TextField villainScore;
    @FXML private Button startButton;
    @FXML private Button resetButton;
    @FXML private Label message;
    @FXML private GridPane map;

    @FXML private Button b1;
    @FXML private Button b2;
    @FXML private Button b3;
    @FXML private Button b4;
    @FXML private Button b5;
    @FXML private Button b6;
    @FXML private Button b7;
    @FXML private Button b8;
    @FXML private Button b9;

    protected Model model;

    public HelloController() {
        this.model = new Model();

    }

    public void initialize(){
        message.textProperty().bind(model.messageProperty());
        heroScore.textProperty().bind(model.getPlayerOne().playerOneScoreProperty());
        villainScore.textProperty().bind(model.getPlayerTwo().playerTwoScoreProperty());
        b1.textProperty().bind(model.gridButtonsProperty().get(0));
        b2.textProperty().bind(model.gridButtonsProperty().get(1));
        b3.textProperty().bind(model.gridButtonsProperty().get(2));
        b4.textProperty().bind(model.gridButtonsProperty().get(3));
        b5.textProperty().bind(model.gridButtonsProperty().get(4));
        b6.textProperty().bind(model.gridButtonsProperty().get(5));
        b7.textProperty().bind(model.gridButtonsProperty().get(6));
        b8.textProperty().bind(model.gridButtonsProperty().get(7));
        b9.textProperty().bind(model.gridButtonsProperty().get(8));
        model.getPlayerOne().playerOneScoreProperty().set("0");
        model.getPlayerTwo().playerTwoScoreProperty().set("0");

    }


    protected Button getStartButton() {
        return startButton;
    }

    public void resetClicked(MouseEvent mouseEvent) {
        model.getPlayerOne().playerOneScoreProperty().set("0");
        model.getPlayerTwo().playerTwoScoreProperty().set("0");
        for (Button button : Arrays.asList(b1, b2, b3, b3 ,b4,b5, b6, b7, b8, b9)) {
            button.setDisable(false);
        }
        model.hideButtonValues();
        model.setPlayerTurn(0);
        model.setCounter(0);
    }

    public void startClicked(MouseEvent mouseEvent) {
        model.setMessage("Player X's Turn");
        for (Button button : Arrays.asList(b1, b2, b3, b3 ,b4, b5, b6, b7, b8, b9)) {
            button.setDisable(false);
        }
        model.hideButtonValues();
        model.setPlayerTurn(0);
        model.setCounter(0);

    }

    public void buttonClickHandler(ActionEvent actionEvent) {
        Button buttonClicked = (Button) actionEvent.getTarget();

        switch (buttonClicked.getId()) {
            case "b1": buttonClicked = b1;
                model.setPlayerSymbol(0);
                buttonClicked.setDisable(true);
            break;
            case "b2": buttonClicked = b2;
                model.setPlayerSymbol(1);
                buttonClicked.setDisable(true);
            break;
            case "b3": buttonClicked = b3;
                model.setPlayerSymbol(2);
                buttonClicked.setDisable(true);
            break;
            case "b4": buttonClicked = b4;
                model.setPlayerSymbol(3);
                buttonClicked.setDisable(true);
            break;
            case "b5": buttonClicked = b5;
                model.setPlayerSymbol(4);
                buttonClicked.setDisable(true);
            break;
            case "b6": buttonClicked = b6;
                model.setPlayerSymbol(5);
                buttonClicked.setDisable(true);
            break;
            case "b7": buttonClicked = b7;
                model.setPlayerSymbol(6);
                buttonClicked.setDisable(true);
            break;
            case "b8": buttonClicked = b8;
                model.setPlayerSymbol(7);
                buttonClicked.setDisable(true);
            break;
            case "b9": buttonClicked = b9;
                model.setPlayerSymbol(8);
                buttonClicked.setDisable(true);
            break;

        }
        int i = model.computerMove();
        i++;
        String buttonName = String.format("b%d", i);
        switch (buttonName) {
            case "b1": buttonClicked = b1;
                buttonClicked.setDisable(true);
                break;
            case "b2": buttonClicked = b2;
                buttonClicked.setDisable(true);
                break;
            case "b3": buttonClicked = b3;
                buttonClicked.setDisable(true);
                break;
            case "b4": buttonClicked = b4;
                buttonClicked.setDisable(true);
                break;
            case "b5": buttonClicked = b5;
                buttonClicked.setDisable(true);
                break;
            case "b6": buttonClicked = b6;
                buttonClicked.setDisable(true);
                break;
            case "b7": buttonClicked = b7;
                buttonClicked.setDisable(true);
                break;
            case "b8": buttonClicked = b8;
                buttonClicked.setDisable(true);
                break;
            case "b9": buttonClicked = b9;
                buttonClicked.setDisable(true);
                break;}

        model.isGameDone();
        model.updateCounter();
    }


}


