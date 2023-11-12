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

    @FXML private Button b1;
    @FXML private Button b2;
    @FXML private Button b3;
    @FXML private Button b4;
    @FXML private Button b5;
    @FXML private Button b6;
    @FXML private Button b7;
    @FXML private Button b8;
    @FXML private Button b9;

    private Model model;

    public HelloController() {
        this.model = new Model();
    }

    private boolean isHero = true;
    public void initialize(){
        message.textProperty().bind(model.messageProperty());
        heroScore.textProperty().bind(model.playerOne().scoreProperty());
        villainScore.textProperty().bind(model.playerTwo().scoreProperty());
        b1.textProperty().bind(model.stuffProperty().get(0));
        b2.textProperty().bind(model.stuffProperty().get(1));
        b3.textProperty().bind(model.stuffProperty().get(2));
        b4.textProperty().bind(model.stuffProperty().get(3));
        b5.textProperty().bind(model.stuffProperty().get(4));
        b6.textProperty().bind(model.stuffProperty().get(5));
        b7.textProperty().bind(model.stuffProperty().get(6));
        b8.textProperty().bind(model.stuffProperty().get(7));
        b9.textProperty().bind(model.stuffProperty().get(8));
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
    hideStartButton();
    model.setMessage("Hero's Turn");
    }

    public void buttonClickHandler(ActionEvent actionEvent) {
        // om inget spel har startat skit i att göra nåt
        Button buttonClicked = (Button) actionEvent.getTarget();
        // ta reda på vilken knapp det var
        // uppdatera modellen på positionen som motsvarar knappen
        // sätt x eller o beroend på vilken spelare
        // gör så att knappen inte går att trycka på

    }






}


