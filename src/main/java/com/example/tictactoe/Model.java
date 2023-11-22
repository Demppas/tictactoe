package com.example.tictactoe;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Model {
    private StringProperty message;
    private final Player playerOne;
    private final Player playerTwo;
    protected ArrayList<StringProperty> gridButtons;
    private int playerTurn = 0;
    protected int counter;
    protected boolean aBoolean;



    public Model() {
        this.message = new SimpleStringProperty();
        this.playerOne = new Player();
        this.playerTwo = new Player();
        this.gridButtons = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            gridButtons.add(new SimpleStringProperty(""));
        }
        this.counter = 9;
        this.aBoolean = false;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }

    public void setCounter(int counter){
        this.counter = counter;
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

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerSymbol(int pos) {
        StringProperty stringProperty = gridButtons.get(pos);
            stringProperty.setValue("X");
            playerTurn = 1;
            setMessage("Player O's Turn");
    }

    public int computerMove(){
        while (true){
            int key = (int)(Math.random() * 10);
            if (key >= 9){
                continue;}
            StringProperty val = gridButtons.get(key);
            if (val.getValue().equals("")){
                val.setValue("O");
                playerTurn = 0;
                setMessage("Player X's Turn");
                return key;
            }
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
                int score = Integer.parseInt(getPlayerOne().getPlayerOneScore());
                score ++;
                playerOne.setPlayerOneScore(String.valueOf(score));
                updateBoard();


            } else if (line.equals("OOO")) {
                setMessage("Player O won");
                int score = Integer.parseInt(getPlayerTwo().getPlayerTwoScore());
                score ++;
                playerTwo.setPlayerTwoScore(String.valueOf(score));
                updateBoard();

            }
        });
    }
    public void updateCounter(){
        this.counter--;
        if (this.counter == 0){
            setMessage("Stalemate");
            updateBoard();

        }
    }

    public void hideButtonValues(){
        for (int i = 0; i < 9; i++){
            gridButtons.get(i).setValue("");
        }
    }

    public boolean updateBoard(){
        this.aBoolean = true;
        return aBoolean;

    }






}


