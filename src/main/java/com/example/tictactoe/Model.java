package com.example.tictactoe;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Model {
    private Label infoLabel;
    private Button startB, resetB;
    private GridPane map;
    private String player1, player2;
    private int score;
    public Model(String player1, String player2){
        this.player1 = "Hero";
        this.player2 = "Villain";
    }




}


