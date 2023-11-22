package com.example.tictactoe;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Player {
    private SimpleStringProperty playerOneScore;
    private SimpleStringProperty playerTwoScore;

    public Player() {
        this.playerOneScore = new SimpleStringProperty();
        this.playerTwoScore = new SimpleStringProperty();
    }

    public String getPlayerTwoScore() {
        return playerTwoScore.get();
    }

    public SimpleStringProperty playerTwoScoreProperty() {
        return playerTwoScore;
    }

    public void setPlayerTwoScore(String playerTwoScore) {

        this.playerTwoScore.set(playerTwoScore);
    }


    public String getPlayerOneScore() {
        return playerOneScore.get();
    }

    public SimpleStringProperty playerOneScoreProperty() {
        return playerOneScore;
    }

    public void setPlayerOneScore(String playerOneScore) {
        this.playerOneScore.set(playerOneScore);
    }
}
