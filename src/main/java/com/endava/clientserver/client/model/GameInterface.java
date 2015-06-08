package com.endava.clientserver.client.model;

public interface GameInterface {
    public String valueAtPosition(int i, int j);
	public void setValue(int i, int j, String value);
	public void setDimension(int k);
	public boolean checkIfEmpty(int i, int j);
	public int getDimension();
}
