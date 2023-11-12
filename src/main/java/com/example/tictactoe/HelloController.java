package com.example.tictactoe;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

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

    private boolean isHero = true;
    public void initialize(){
    }

    public void StartButtonAction(EventHandler<ActionEvent>onAction)  {
        getStartButton().setOnAction(onAction);
    }

    protected Button getStartButton() {
        return startButton;
    }

    public void showStartButton(){
        startButton.setVisible(true);
    }
    public void hideStartButton(){
        startButton.setVisible(false);
    }
    public void resetClicked(MouseEvent mouseEvent) {
    }

    public void startClicked(MouseEvent mouseEvent) {
    }

    public void buttonClickHandler(ActionEvent actionEvent) {
        Button buttonClicked = (Button) actionEvent.getTarget();
        String buttonText = buttonClicked.getText();

       // if (isHero == true && buttonText.isEmpty()){
       //     buttonClicked.setText("X");
       //     isHero = false;
       // } else (isHero == false && buttonText.isEmpty()){
       //     buttonClicked.setText("O");
       //     isHero = true;
       // }
    }






}


