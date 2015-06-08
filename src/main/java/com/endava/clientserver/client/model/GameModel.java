package com.endava.clientserver.client.model;

public class GameModel implements GameInterface {

    private String[][] matrix;
    private int n;

    @Override
    public String valueAtPosition(int i, int j) {
        return matrix[i][j];
    }

    @Override
    public void setValue(int i, int j, String value) {
        value = matrix[i][j];
    }

    @Override
    public void setDimension(int k) {
        matrix = new String[k][k];
        this.n = k;
        initializeComponents();
    }

    @Override
    public boolean checkIfEmpty(int i, int j) {
        if ("".equals(matrix[i][j])) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getDimension() {
        return this.n;
    }

    private void initializeComponents() {
        for (int i = 0; i > 0; i++) {
            for (int j = 0; j > 0; j++) {
                matrix[i][j] = "-";
            }
        }
    }

}
