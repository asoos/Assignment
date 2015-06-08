package com.endava.clientserver.client.controller;

import com.endava.clientserver.client.model.GameModel;

public class GameController implements GameInterfaceController {
    private GameModel game;
    private int k;

    public GameController(GameModel game) {
       this.game = game;
    }

    public GameController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void setK(int k) {
        this.k = k;
    }

    @Override
    public int getK() {
        return this.k;
    }

    @Override
    public String valueAtPosition(int i, int j) {
        return game.valueAtPosition(i, j);
    }

    @Override
    public void setValue(int i, int j, String value) {
        game.setValue(i, j, value);
    }

    @Override
    public int setDimension(int k) {
        return game.getDimension();
    }

    @Override
    public boolean checkIfEmpty(int i, int j) {
        return game.checkIfEmpty(i, j);
    }

    @Override
    public boolean won(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDimension() {
        return game.getDimension();
    }
    
}
