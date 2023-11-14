package com.example.tictactoe;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class Model {
    private StringProperty message;
    private Player playerX;
    private Player playerO;
    protected ArrayList<StringProperty> gridButtons;
    private int playerTurn = 0;


    public Model() {
        this.message = new SimpleStringProperty();
        this.playerX = new Player();
        this.playerO = new Player();
        this.gridButtons = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            gridButtons.add(new SimpleStringProperty());
        }

    }
    public ArrayList<StringProperty> gridButtonsProperty() {
        return gridButtons;
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

    public Player getPlayerO() {
        return playerO;
    }

    public Player getPlayerX() {
        return playerX;
    }

    public void setPlayerSymbol(int pos) {
        StringProperty stringProperty = gridButtons.get(pos);
        if ( playerTurn == 0){
                    stringProperty.setValue("X");
                    playerTurn = 1;
                    setMessage("Player O's Turn");
            } else {
                    stringProperty.setValue("O");
                    playerTurn = 0;
                    setMessage("Player X's Turn");
            }

    }
    public void isGameDone(){
       String s1 = gridButtons.get(0).getValue();
       String s2 = gridButtons.get(1).getValue();
       String s3 = gridButtons.get(2).getValue();
       String s4 = gridButtons.get(3).getValue();
       String s5 = gridButtons.get(4).getValue();
       String s6 = gridButtons.get(5).getValue();
       String s7 = gridButtons.get(6).getValue();
       String s8 = gridButtons.get(7).getValue();
       String s9 = gridButtons.get(8).getValue();

       String row1 = s1 + s2 + s3;
       String row2 = s4 + s5 + s6;
       String row3 = s7 + s8 + s9;
       String col1 = s1 + s4 + s7;
       String col2 = s2 + s5 + s8;
       String col3 = s3 + s6 + s9;
       String diag1 = s1 + s5 + s9;
       String diag2 = s3 + s5 + s7;

            if (row1.equals("XXX")){
                setMessage("Player X is winner");
            } else if (row2.equals("XXX")){
                setMessage("Player X is winner");
            } else if (row3.equals("XXX")){
                setMessage("Player X is winner");
            } else if (col1.equals("XXX")){
                setMessage("Player X is winner");
            } else if (col2.equals("XXX")){
                setMessage("Player X is winner");
            } else if (col3.equals("XXX")){
                setMessage("Player X is winner");
            } else if (diag1.equals("XXX")){
                setMessage("Player X is winner");
            } else if (diag2.equals("XXX")){
                setMessage("Player X is winner");

            } else if (row1.equals("OOO")) {
                setMessage("Player O is winner");
            } else if (row2.equals("OOO")) {
                setMessage("Player O is winner");
            } else if (row3.equals("OOO")) {
                setMessage("Player O is winner");
            } else if (col1.equals("OOO")) {
                setMessage("Player O is winner");
            } else if (col2.equals("OOO")) {
                setMessage("Player O is winner");
            } else if (col3.equals("OOO")) {
                setMessage("Player O is winner");
            } else if (diag1.equals("OOO")) {
                setMessage("Player O is winner");
            } else if (diag2.equals("OOO")) {
                setMessage("Player O is winner");
            }




    }






}


