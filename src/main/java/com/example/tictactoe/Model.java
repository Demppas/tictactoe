package com.example.tictactoe;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Node;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.stream.IntStream;

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
        IntStream.range(0, 8).mapToObj(i -> switch (i) {
            case 0 -> gridButtons.get(0).getValue() + gridButtons.get(1).getValue() + gridButtons.get(2).getValue();
            case 1 -> gridButtons.get(3).getValue() + gridButtons.get(4).getValue() + gridButtons.get(5).getValue();
            case 2 -> gridButtons.get(6).getValue() + gridButtons.get(7).getValue() + gridButtons.get(8).getValue();
            case 3 -> gridButtons.get(0).getValue() + gridButtons.get(3).getValue() + gridButtons.get(6).getValue();
            case 4 -> gridButtons.get(1).getValue() + gridButtons.get(4).getValue() + gridButtons.get(7).getValue();
            case 5 -> gridButtons.get(2).getValue() + gridButtons.get(5).getValue() + gridButtons.get(8).getValue();
            case 6 -> gridButtons.get(0).getValue() + gridButtons.get(4).getValue() + gridButtons.get(8).getValue();
            case 7 -> gridButtons.get(2).getValue() + gridButtons.get(4).getValue() + gridButtons.get(6).getValue();
            default -> null;
        }).forEach(line -> {
            if (line.equals("XXX")) {
                setMessage("Player X won");
            } else if (line.equals("OOO")) {
                setMessage("Player O won");
            }
        });

    }

    protected void isGameEnded(){

        for  (int i = 0; i <= 9; i++){
            String value = gridButtons.get(i).getValue();
            if (value == null || value.isEmpty()){
                break;
            } else if (value.equals("X") || value.equals("O")){
                ++i;
            } else if (8 <= i){
                setMessage("Stalemate");
            }
    }


    }





}


