package com.endava.clientserver.client.controller;

public interface GameInterfaceController {
    public void setK(int k);
    public int getK();
    public String valueAtPosition(int i, int j);
	public void setValue(int i, int j, String value);
	public int setDimension(int k);
	public boolean checkIfEmpty(int i, int j);
        public boolean won(String value);
	public int getDimension();
}
