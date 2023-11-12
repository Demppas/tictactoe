package com.example.tictactoe;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class Model {
    private StringProperty message;
    private Player player1;
    private Player player2;
    private ArrayList<StringProperty> stuff;

    public Model() {
        this.message = new SimpleStringProperty();
        this.player1 = new Player();
        this.player2 = new Player();
        stuff = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            stuff.add(new SimpleStringProperty());
        }
    }

    public ArrayList<StringProperty> stuffProperty(){
        return stuff;
    }

    public String getMessage() {
        return message.get();
    }
    public StringProperty messageProperty() {
        return message;
    }
    public void setMessage(String message) {
        this.message.setValue(message);
    }

    public Player playerTwo(){
        return player2;
    }

    public Player playerOne(){
        return player1;
    }
}


